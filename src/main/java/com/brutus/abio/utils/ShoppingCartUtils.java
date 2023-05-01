package com.brutus.abio.utils;

import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.persistance.order.Cart;
import com.brutus.abio.persistance.order.OrderDetails;
import org.springframework.security.oauth2.jwt.Jwt;

import java.time.LocalDateTime;
import java.util.UUID;

public class ShoppingCartUtils {

    public static void validate(OrderDetails orderDetails, Cart cart, Jwt jwt) {

        if (orderDetails.getCart().getId().compareTo(cart.getId()) != 0) {
            throw new BadRequestException("Card id in header is not equal to the one in order details");
        }

        String subject = jwt.getSubject();

        String[] splitString = subject.split(":");

        String email = splitString[0];
        String orderId = splitString[1];
        UUID cartId = UUID.fromString(splitString[2]);

        if (orderId.compareTo(orderDetails.getId()) != 0) {
            throw new BadRequestException("Order id in jwt token is not equal to the one in header");
        }

        if (cartId.compareTo(cart.getId()) != 0) {
            throw new BadRequestException("Card id in jwt token is not equal to the one in header");
        }

        if (email.compareTo(orderDetails.getCustomer().getEmail()) != 0) {
            throw new BadRequestException("Email in jwt token is not equal to the one in order details");
        }

        // check if order is confirmed
        if (orderDetails.getIsConfirmed()) {
            throw new BadRequestException("Order is already confirmed");
        }

        // check if order is expired
        if (orderDetails.getOrderDateTime().isBefore(LocalDateTime.now().minusMinutes(15))) {
            throw new BadRequestException("Expired order");
        }
    }

}
