package com.brutus.abio.persistance.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ProductCsvDTO {

    // հծ
    private String productCode;
    private String name;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal discount;
    private BigDecimal discountPrice;

    private String name_en;
    private String name_ru;
    private String name_am;

    private String title_en;
    private String title_ru;
    private String title_am;

    private String description_en;
    private String description_ru;
    private String description_am;

    private Long category1;
    private Long category2;
    private Long category3;

    private String color;

    private String dimensions_en;
    private String dimensions_ru;
    private String dimensions_am;

    private Integer bulky;

    private Boolean enabled;
    private Boolean hasPictures;

}
