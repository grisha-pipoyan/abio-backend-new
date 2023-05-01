package com.brutus.abio.persistance.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductHcDTO {
    private String productCode;
    private String name;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;
}
