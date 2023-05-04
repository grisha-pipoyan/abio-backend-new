package com.brutus.abio.service;

import com.brutus.abio.controller.customer.dto.CartDTO;
import com.brutus.abio.controller.customer.dto.CartProductDTO;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.persistance.product.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender emailSender;
    private final ProductService productService;
    private final MailProperties mailProperties;

    public void sendOrderConfirmationEmail(String to, String username, CartDTO cartDTO) {

        try {
            String message = getMessage(cartDTO, username);

            MimeMessage mimeMessage = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

            helper.setFrom(mailProperties.getUsername());
            helper.setTo(to);
            helper.setSubject("Order confirmation");
            helper.setText(message, true);

            emailSender.send(mimeMessage);

        } catch (Exception e) {
            throw new BadRequestException(String.format("Can not send message: %s", e.getMessage()));
        }

    }

    private String getMessage(CartDTO cartDTO, String username) {

        String firstText = String.format("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Order Confirmation</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Thank You For Your Order!</h1>\n" +
                "    <p>Hello %s,</p>\n" +
                "    <p>We're happy to let you know that your order has been confirmed! We're preparing your items for shipping and will send you a confirmation email once your order has shipped.</p>\n" +
                "    <p>Here are the details of your order:</p>\n" +
                "    <table style=\"border-collapse: collapse;\">\n" +
                "        <thead>\n" +
                "            <tr>\n" +
                "                <th style=\"border: 1px solid #ddd; padding: 8px;\">Product</th>\n" +
                "                <th style=\"border: 1px solid #ddd; padding: 8px;\">Price</th>\n" +
                "                <th style=\"border: 1px solid #ddd; padding: 8px;\">Quantity</th>\n" +
                "                <th style=\"border: 1px solid #ddd; padding: 8px;\">Promo code</th>\n" +
                "                <th style=\"border: 1px solid #ddd; padding: 8px;\">Total</th>\n" +
                "            </tr>\n" +
                "        </thead>\n" +
                "        <tbody>", username);

        StringBuilder first = new StringBuilder();
        first.append(firstText);

        List<CartProductDTO> cartProductDTOList = cartDTO.getCartProductDTOList();
        for (CartProductDTO model :
                cartProductDTOList) {

            String productCode = model.getProductCode();
            Product product = productService.findByProductCode(productCode);
            ArrayList<String> imgNames = new ArrayList<>(product.getPicturePaths());
//            String img = String.format("https://abio.com.ru:8443/abio/public/files?productCode=%s&fileName=%s",
//                    productCode, imgNames.get(0));
//            String img = String.format("http://localhost:8080/abio/public/files?productCode=%s&fileName=%s",
//                    productCode, imgNames.get(0));
            String img = "";
            BigDecimal totalPrice = model.getDiscountPrice();

            String format = String.format(" <tr>\n" +
                            "                <td style=\"border: 1px solid #ddd; padding: 8px;\"><img src=\"%s\" alt=\"%s\" style=\"width: 100px; height: 100px;\">%s</td>\n" +
                            "                <td style=\"border: 1px solid #ddd; padding: 8px;\">%s</td>\n" +
                            "                <td style=\"border: 1px solid #ddd; padding: 8px;\">%s</td>\n" +
                            "                <td style=\"border: 1px solid #ddd; padding: 8px;\">%s</td>\n" +
                            "                <td style=\"border: 1px solid #ddd; padding: 8px;\">%s</td>\n" +
                            "            </tr>", img, product.getName(), product.getName(),
                    totalPrice.divide(new BigDecimal(model.getQuantity()), RoundingMode.UNNECESSARY),
                    model.getQuantity(), model.getPromocode(), totalPrice);

            first.append(format);
        }


        BigDecimal subTotal = cartDTO.getGlobalDiscountPrice();

        String last = String.format(
                "</tbody>\n" +
                        "        <tfoot>\n" +
                        "            <tr>\n" +
                        "                <td colspan=\"3\" style=\"border: 1px solid #ddd; padding: 8px; text-align: right;\">Subtotal:</td>\n" +
                        "                <td style=\"border: 1px solid #ddd; padding: 8px;\">%s</td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "                <td colspan=\"3\" style=\"border: 1px solid #ddd; padding: 8px; text-align: right;\">Shipping:</td>\n" +
                        "                <td style=\"border: 1px solid #ddd; padding: 8px;\">%s</td>\n" +
                        "            </tr>\n" +
                        "            <tr>\n" +
                        "                <td colspan=\"3\" style=\"border: 1px solid #ddd; padding: 8px; text-align: right;\">Total:</td>\n" +
                        "                <td style=\"border: 1px solid #ddd; padding: 8px;\">%s</td>\n" +
                        "            </tr>\n" +
                        "        </tfoot>\n" +
                        "    </table>\n" +
                        "    <p>Thank you again for your order! We appreciate your business and look forward to serving you again in the future.</p>\n" +
                        "    <p>Best regards,</p>\n" +
                        "    <p>The ABIO team</p>\n" +
                        "</body>\n" +
                        "</html>", subTotal, cartDTO.getDeliveryPrice(),
                cartDTO.getGlobalPrice());

        first.append(last);

        return first.toString();
    }

}
