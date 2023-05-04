package com.brutus.abio.controller.admin;

import com.brutus.abio.controller.admin.dto.OrderDetailsDTO;
import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.persistance.order.OrderDetails;
import com.brutus.abio.persistance.order.PaymentStatus;
import com.brutus.abio.service.ArmSoftService;
import com.brutus.abio.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/abio/management/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final ArmSoftService armSoftService;

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/setPayed")
    public void setOrderPayed(@RequestParam String orderId) {
        OrderDetails orderDetails = orderService.findById(orderId);
        orderDetails.setPaymentStatus(PaymentStatus.PAYED);

        orderService.save(orderDetails);
        // TODO: 3/11/2023 send to hc

        try {
            armSoftService.sendSaleDocument(orderDetails);
        }catch (Exception e){
            throw new BadRequestException(e.getMessage());
        }

    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/get")
    public ResponseEntity<List<OrderDetailsDTO>> getOrderDetailsCSV() {
        return ResponseEntity.ok(orderService.getAllOrdersModels());
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/getAllOrdersByIsConfirmedEquals/{isConfirmed}")
    public ResponseEntity<List<OrderDetailsDTO>> getNotConfirmedOrders(@PathVariable Boolean isConfirmed) {
        return ResponseEntity.ok(orderService.getAllByIsConfirmedEquals(isConfirmed));
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/getNotPayedOrders")
    public ResponseEntity<List<OrderDetailsDTO>> getNotPayedOrders() {
        return ResponseEntity.ok(orderService.getAllByPaymentStatusEquals(PaymentStatus.NOT_PAYED));
    }

}
