package com.brutus.abio.controller.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
    private BigDecimal globalPrice;
    private BigDecimal globalNormalPrice;
    private BigDecimal globalDiscountPrice;
    private BigDecimal deliveryPrice;
    private List<CartProductDTO> cartProductDTOList;
}
