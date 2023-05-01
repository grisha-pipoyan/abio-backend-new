package com.brutus.abio.controller.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartProductDTO {
    private String productCode;
    private Integer quantity;
    private BigDecimal totalNormalPrice;
    private BigDecimal totalDiscountPrice;
    private String promocode;

    public boolean hasDiscount() {
        return totalDiscountPrice.compareTo(BigDecimal.ZERO) != 0;
    }

}
