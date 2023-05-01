package com.brutus.abio.service;

import com.brutus.abio.controller.admin.dto.OrderDetailsDTO;
import com.brutus.abio.exception.NotFoundException;
import com.brutus.abio.persistance.order.OrderDetails;
import com.brutus.abio.persistance.order.OrderDetailsDTOMapper;
import com.brutus.abio.persistance.order.OrderDetailsRepository;
import com.brutus.abio.persistance.order.PaymentStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService {

    private final OrderDetailsRepository orderDetailsRepository;
    private final OrderDetailsDTOMapper orderDetailsDTOMapper;

    public OrderDetails findById(String orderId) {
        return orderDetailsRepository.findById(orderId).orElseThrow(
                () -> new NotFoundException(String.format("Order with id %s not found", orderId)));
    }

    public void save(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }

    public List<OrderDetails> getAllOrders() {
        return orderDetailsRepository.findAll();
    }

    public List<OrderDetailsDTO> getAllByIsConfirmedEquals(Boolean isConfirmed) {
        List<OrderDetails> allByIsConfirmedEquals = orderDetailsRepository.findAllByIsConfirmedEquals(isConfirmed);
        return allByIsConfirmedEquals.stream().map(orderDetailsDTOMapper).collect(Collectors.toList());
    }

    public List<OrderDetailsDTO> getAllByPaymentStatusEquals(PaymentStatus paymentStatus) {
        List<OrderDetails> allByPaymentStatusEquals = orderDetailsRepository.findAllByPaymentStatusEquals(paymentStatus);
        return allByPaymentStatusEquals.stream().map(orderDetailsDTOMapper).collect(Collectors.toList());
    }

    public List<OrderDetailsDTO> getAllOrdersModels() {
        List<OrderDetails> orderDetails = getAllOrders();
        return orderDetails.stream().map(orderDetailsDTOMapper).collect(Collectors.toList());
    }

    public List<OrderDetails> findAllExpiredNonCashOrders(LocalDateTime expirationTime) {
        return orderDetailsRepository.findAllExpiredNonCashOrders(expirationTime);
    }

    public List<OrderDetails> findAllExpiredOrders(LocalDateTime expirationTime) {
        return orderDetailsRepository.findAllExpiredOrders(expirationTime);
    }

    public void delete(OrderDetails order) {
        orderDetailsRepository.delete(order);
    }

    public OrderDetailsDTO getDTOFromObject(OrderDetails orderDetails){
        return orderDetailsDTOMapper.apply(orderDetails);
    }
}
