package com.brutus.abio.persistance.delivery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public final class DeliveryRegionDTO {
    private Long Id;
    private String name_en;
    private String name_ru;
    private String name_am;
    private BigDecimal price;
    private String currencyType;
    private Integer bulky;
}
