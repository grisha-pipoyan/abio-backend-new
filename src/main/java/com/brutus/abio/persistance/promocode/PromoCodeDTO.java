package com.brutus.abio.persistance.promocode;//package com.brutus.abio.persistance.promocode;
//
//import lombok.Data;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//import java.util.List;
//
//@Data
//public class PromoCodeDTO {
//
//    private Long Id;
//    private String code;
//    private BigDecimal discount;
//    private PromoCodeType promoCodeType;
//
//    // 2022-03-10
//    private LocalDate validFrom;
//    private LocalDate validUntil;
//    private List<String> productCodes;
//    private Integer maxApplications;
//    private Integer currentApplications;
//
//    // Method to check if promo code is valid now
//    public boolean isValidNow() {
//        LocalDate now = LocalDate.now();
//        return now.isEqual(validFrom) || (now.isAfter(validFrom) && now.isBefore(validUntil));
//    }
//
//    // Check if a promocode is exhausted based on its current and max application
//    public boolean isExhausted() {
//        return currentApplications >= maxApplications;
//    }
//}
