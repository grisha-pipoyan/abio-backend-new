package com.brutus.abio.utils;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.CsvToBeanFilter;
import eu.europa.esig.dss.model.InMemoryDocument;

import java.io.InputStreamReader;
import java.util.List;

public class JavaBeanToCSVConverter {

    public static String[] productColumns = {
            "productCode", "name", "quantity", "price", "discount", "discountPrice",
            "name_en", "name_ru", "name_am", "title_en", "title_ru", "title_am",
            "description_en", "description_ru", "description_am", "category1", "category2", "category3",
            "color", "dimensions_en", "dimensions_ru", "dimensions_am", "bulky", "enabled", "hasPictures"
    };

    public static String[] blacklistColumns = {
            "Id", "email", "phoneNumber", "reason", "blacklistedAt"
    };

    public static String[] deliveryRegionsColumns = {
            "Id", "name_en", "name_ru", "name_am", "price", "currencyType", "bulky"
    };

    public static String[] videoColumns = {
            "Id", "title_en", "title_ru", "title_am",
            "description_en", "description_ru", "description_am", "date", "url"
    };

    public static String[] orderColumns = {
            "Id", "orderDateTime", "address", "date",
            "time", "comment", "first_name", "last_name", "email",
            "mobileNo", "totalPrice", "paymentStatus", "paymentType", "isConfirmed", "transactionId"
    };

    public static String[] promoCodeColumns = {
            "Id", "code", "discount", "promoCodeType",
            "validFrom", "validUntil",
            "productCodes", "minimumPurchase", "maxApplications", "currentApplications"
    };

    public static <T> List<T> convertToJavaBean(InMemoryDocument inMemoryDocument, Class<T> beanClass, CsvToBeanFilter filter) {
        return new CsvToBeanBuilder<T>(new InputStreamReader(inMemoryDocument.openStream()))
                .withType(beanClass)
                .withSeparator(',')
                .withIgnoreLeadingWhiteSpace(true)
                .withFilter(filter)
                .build()
                .parse();
    }

}
