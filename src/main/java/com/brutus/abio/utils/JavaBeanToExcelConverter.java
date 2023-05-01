package com.brutus.abio.utils;//package com.brutus.abio.utils;
//
//import com.brutus.abio.controller.admin.model.ProductModelCSV;
//import eu.europa.esig.dss.model.FileDocument;
//import eu.europa.esig.dss.spi.DSSUtils;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.List;
//
//public class JavaBeanToExcelConverter {
//
//    public static byte[] convertBeanToExcel(List<ProductModelCSV> products, String fileName) throws IOException {
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("Products");
//
//        // create header row
//        Row headerRow = sheet.createRow(0);
//        headerRow.createCell(0).setCellValue("Product Code");
//        headerRow.createCell(1).setCellValue("Name");
//        headerRow.createCell(2).setCellValue("Quantity");
//        headerRow.createCell(3).setCellValue("Price");
//        headerRow.createCell(4).setCellValue("Discount");
//        headerRow.createCell(5).setCellValue("Discounted Price");
//        headerRow.createCell(6).setCellValue("Name (EN)");
//        headerRow.createCell(7).setCellValue("Name (RU)");
//        headerRow.createCell(8).setCellValue("Name (AM)");
//        headerRow.createCell(9).setCellValue("Title (EN)");
//        headerRow.createCell(10).setCellValue("Title (RU)");
//        headerRow.createCell(11).setCellValue("Title (AM)");
//        headerRow.createCell(12).setCellValue("Description (EN)");
//        headerRow.createCell(13).setCellValue("Description (RU)");
//        headerRow.createCell(14).setCellValue("Description (AM)");
//        headerRow.createCell(15).setCellValue("Category 1");
//        headerRow.createCell(16).setCellValue("Category 2");
//        headerRow.createCell(17).setCellValue("Category 3");
//        headerRow.createCell(18).setCellValue("Color");
//        headerRow.createCell(19).setCellValue("Dimensions (EN)");
//        headerRow.createCell(20).setCellValue("Dimensions (RU)");
//        headerRow.createCell(21).setCellValue("Dimensions (AM)");
//        headerRow.createCell(22).setCellValue("Bulky");
//        headerRow.createCell(23).setCellValue("Display");
//
//        // create data rows
//        int rowNum = 1;
//        for (ProductModelCSV product : products) {
//            Row row = sheet.createRow(rowNum++);
//            row.createCell(0).setCellValue(product.getProductCode());
//            row.createCell(1).setCellValue(product.getName());
//            row.createCell(2).setCellValue(product.getQuantity());
//            row.createCell(3).setCellValue(product.getPrice().doubleValue());
//            row.createCell(4).setCellValue(product.getDiscount().doubleValue());
//            row.createCell(5).setCellValue(product.getDiscountPrice().doubleValue());
//            row.createCell(6).setCellValue(product.getName_en());
//            row.createCell(7).setCellValue(product.getName_ru());
//            row.createCell(8).setCellValue(product.getName_am());
//            row.createCell(9).setCellValue(product.getTitle_en());
//            row.createCell(10).setCellValue(product.getTitle_ru());
//            row.createCell(11).setCellValue(product.getTitle_am());
//            row.createCell(12).setCellValue(product.getDescription_en());
//            row.createCell(13).setCellValue(product.getDescription_ru());
//            row.createCell(14).setCellValue(product.getDescription_am());
//            row.createCell(15).setCellValue(product.getCategory1());
//            row.createCell(16).setCellValue(product.getCategory2());
//            row.createCell(17).setCellValue(product.getCategory3());
//            row.createCell(18).setCellValue(product.getColor());
//            row.createCell(19).setCellValue(product.getDimensions_en());
//            row.createCell(20).setCellValue(product.getDimensions_ru());
//            row.createCell(21).setCellValue(product.getDimensions_am());
//            row.createCell(22).setCellValue(product.getBulky());
//            row.createCell(23).setCellValue(product.getDisplay());
//        }
//
//        FileOutputStream outputStream = new FileOutputStream(fileName);
//        workbook.write(outputStream);
//        workbook.close();
//        outputStream.close();
//
//        byte[] bytes = DSSUtils.toByteArray(new FileDocument(new File(fileName)));
//
////        File file = new File(fileName);
////        if (!file.delete()) {
////            String error = String.format("Can not delete file: %s", fileName);
////            throw new IOException(error);
////        }
//
//        return bytes;
//
//    }
//
//}
