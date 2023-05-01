package com.brutus.abio.persistance.promocode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PromoCode {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(unique = true)
    private String code;
    private BigDecimal discount;
    private PromoCodeType promoCodeType;

    // 2022-03-10
    private LocalDate validFrom;
    private LocalDate validUntil;
    @ElementCollection
    @Column(name = "productCodes")
    private List<String> productCodes;

    private BigDecimal minimumPurchase;

    private Integer maxApplications;
    private Integer currentApplications;

    // Constructor for promo code with validity period
    public PromoCode(String code, BigDecimal discount,
                     PromoCodeType promoCodeType,
                     LocalDate validFrom, LocalDate validUntil,
                     Integer maxApplications) {
        this.code = code;
        this.discount = discount;
        this.promoCodeType = promoCodeType;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.maxApplications = maxApplications;
        this.currentApplications = 0;
    }

    // Constructor for promo code with specific product
    public PromoCode(String code, BigDecimal discount,
                     PromoCodeType promoCodeType, List<String> productCodes,
                     LocalDate validFrom, LocalDate validUntil,
                     Integer maxApplications) {
        this.code = code;
        this.discount = discount;
        this.promoCodeType = promoCodeType;
        this.productCodes = productCodes;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.maxApplications = maxApplications;
        this.currentApplications = 0;
    }

    // Method to check if promo code is valid now
    public boolean isValidNow() {
        LocalDate now = LocalDate.now();
        return now.isEqual(validFrom) || (now.isAfter(validFrom) && now.isBefore(validUntil));
    }

    // Check if a promocode is exhausted based on its current and max application
    public boolean isExhausted() {
        return currentApplications >= maxApplications;
    }

}
