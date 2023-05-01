package com.brutus.abio.persistance.delivery;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryRegion {

    @Id
    @GeneratedValue
    private Long Id;

    private String name_en;
    private String name_ru;
    private String name_am;
    private BigDecimal price;

    private String currencyType;

    private Integer bulky;

    public DeliveryRegion(String name_en, String name_ru, String name_am, BigDecimal price, String currencyType, Integer bulky) {
        this.name_en = name_en;
        this.name_ru = name_ru;
        this.name_am = name_am;
        this.price = price;
        this.currencyType = currencyType;
        this.bulky = bulky;
    }
}
