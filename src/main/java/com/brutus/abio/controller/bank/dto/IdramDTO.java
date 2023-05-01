package com.brutus.abio.controller.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdramDTO {

    private String EDP_REC_ACCOUNT;
    private String EDP_DESCRIPTION;
    private BigDecimal EDP_AMOUNT;
    private String EDP_BILL_NO;
    private String EDP_EMAIL;

}
