package com.brutus.abio.persistance.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ProductDTO {

    private String productCode;
    private String name;
    private String title;
    private String description;

    private String category1;
    private String category2;
    private String category3;

    private String color;

    private String dimensions;
    private Integer quantity;

    private Boolean inStock;

    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;


    private List<String> pictureIds;

}
