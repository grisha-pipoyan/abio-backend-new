package com.brutus.abio.persistance.order;

import com.brutus.abio.controller.admin.dto.OrderDetailsDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class OrderDetailsDTOMapper implements Function<OrderDetails, OrderDetailsDTO> {
    @Override
    public OrderDetailsDTO apply(OrderDetails orderDetails) {
        OrderDetailsDTO orderDetailsDTO = new OrderDetailsDTO();
        orderDetailsDTO.setId(orderDetails.getId());
        orderDetailsDTO.setOrderDateTime(orderDetails.getOrderDateTime().toString());
        orderDetailsDTO.setAddress(orderDetails.getAddress());
        orderDetailsDTO.setDate(orderDetails.getDate());
        orderDetailsDTO.setTime(orderDetails.getTime());
        orderDetailsDTO.setComment(orderDetails.getComment());
        orderDetailsDTO.setFirst_name(orderDetails.getCustomer().getFirst_name());
        orderDetailsDTO.setLast_name(orderDetails.getCustomer().getLast_name());
        orderDetailsDTO.setEmail(orderDetails.getCustomer().getEmail());
        orderDetailsDTO.setMobileNo(orderDetails.getCustomer().getMobileNo());
        orderDetailsDTO.setTotalPrice(orderDetails.getTotalPrice());

        if (orderDetails.getPaymentStatus() != null) {
            orderDetailsDTO.setPaymentStatus(orderDetails.getPaymentStatus().name());
        }

        if (orderDetails.getPaymentType() != null) {
            orderDetailsDTO.setPaymentType(orderDetails.getPaymentType().name());
        }

        orderDetailsDTO.setIsConfirmed(orderDetails.getIsConfirmed());
        orderDetailsDTO.setTransactionId(orderDetails.getTransactionId());

        return orderDetailsDTO;
    }
}
