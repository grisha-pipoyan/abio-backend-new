package com.brutus.abio.controller.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsDTO {
    private String Id;
    private String orderDateTime;
    private String address;
    private String date;
    private String time;
    private String comment;
    private String first_name;
    private String last_name;
    private String email;
    private String mobileNo;
    private BigDecimal totalPrice;
    private String paymentStatus;
    private String paymentType;
    private Boolean isConfirmed;
    private String transactionId;
}
