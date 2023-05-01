package com.brutus.abio.csv.filter;

import com.brutus.abio.utils.JavaBeanToCSVConverter;
import com.opencsv.bean.CsvToBeanFilter;

public class DeliveryFilter implements CsvToBeanFilter {
    @Override
    public boolean allowLine(String[] line) {
        return line.length == JavaBeanToCSVConverter.deliveryRegionsColumns.length;
    }
}