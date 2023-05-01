package com.brutus.abio.controller.bank;

import com.brutus.abio.controller.customer.dto.CartDTO;
import com.brutus.abio.persistance.order.CartDTOMapper;
import com.brutus.abio.persistance.order.Customer;
import com.brutus.abio.persistance.order.OrderDetails;
import com.brutus.abio.persistance.order.PaymentStatus;
import com.brutus.abio.service.EmailService;
import com.brutus.abio.service.IdramService;
import com.brutus.abio.service.ShoppingCartService;
import eu.europa.esig.dss.spi.DSSUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

@Slf4j
@RestController
@RequestMapping("/abio/public/purchase")
@RequiredArgsConstructor
public class IdramController {

    private final ShoppingCartService cartService;
    private final IdramService idramService;
    private final EmailService emailService;
    private final CartDTOMapper cartDTOMapper;

    @PostMapping("/process-payment")
    public ResponseEntity<String> processPayment(HttpServletRequest request) {

        String edpPrecheck = request.getParameter("EDP_PRECHECK");
        String edpBillNo = request.getParameter("EDP_BILL_NO");
        String edpRecAccount = request.getParameter("EDP_REC_ACCOUNT");
        String edpAmount = request.getParameter("EDP_AMOUNT");
        String edpPayerAccount = request.getParameter("EDP_PAYER_ACCOUNT");
        String edpTransId = request.getParameter("EDP_TRANS_ID");
        String edpChecksum = request.getParameter("EDP_CHECKSUM");
        String edpTransDate = request.getParameter("EDP_TRANS_DATE");

        //(a)
        if (edpPrecheck != null && edpBillNo != null && edpRecAccount != null && edpAmount != null) {
            if (edpPrecheck.equals("YES")) {
                if (!edpRecAccount.equals(idramService.getEDP_REC_ACCOUNT())) {
                    return ResponseEntity.badRequest().body("FAIL");
                }
            }

            // this code checks if $bill_no exists in your system orders if exists then return "OK" otherwise return "FAIL"
            try {
                OrderDetails orderDetails = cartService.findOrderById(edpBillNo);
                if (orderDetails.getTotalPrice().compareTo(new BigDecimal(edpAmount)) != 0) {
                    return ResponseEntity.badRequest().body("FAIL");
                } else {
                    orderDetails.setIsConfirmed(true);
                    cartService.updateOrderDetails(orderDetails);

                    return ResponseEntity.ok("OK");
                }
            } catch (Exception e) {
                return ResponseEntity.badRequest().body("FAIL");
            }

        }

        //(b)
        if (edpPayerAccount != null && edpBillNo != null && edpRecAccount != null && edpAmount != null
                && edpTransId != null && edpChecksum != null) {
            String txtToHash = idramService.getEDP_REC_ACCOUNT() + ":" +
                    edpAmount + ":" + idramService.getSECRET_KEY() + ":" +
                    edpBillNo + ":" +
                    edpPayerAccount + ":" +
                    edpTransId + ":" +
                    edpTransDate;

            if (!edpChecksum.equalsIgnoreCase(DSSUtils.getMD5Digest(txtToHash.getBytes(StandardCharsets.UTF_8)))) {
                // Payment failed
                return ResponseEntity.badRequest().body("FAIL");
            } else {

                OrderDetails orderDetails = cartService.findOrderById(edpBillNo);
                orderDetails.setPaymentStatus(PaymentStatus.PAYED);
                orderDetails.setTransactionId(edpTransId);
                cartService.updateOrderDetails(orderDetails);

                // TODO: 3/6/2023 send to hc
                // Payment success

                // Send confirmation to email
                Customer customer = orderDetails.getCustomer();
                String to = customer.getEmail();
                String username = customer.getFirst_name() + " " + customer.getLast_name();
                CartDTO cartDTO = cartDTOMapper.apply(orderDetails.getCart());

                emailService.sendOrderConfirmationEmail(to, username, cartDTO);

                return ResponseEntity.ok("OK");
            }
        }

        // Invalid request parameters
        return ResponseEntity.badRequest().body("FAIL");
    }
}
