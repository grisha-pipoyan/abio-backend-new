package com.brutus.abio.utils;//package com.brutus.abio.utils;
//
//import com.opencsv.CSVWriter;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class XlxsToCsv {
//
//    public static byte[] convert(byte[] xlxsFile) throws IOException {
//        XSSFWorkbook workbook = new XSSFWorkbook(new ByteArrayInputStream(xlxsFile));
//        Sheet sheet = workbook.getSheetAt(0);
//
//        List<String[]> dataList = new ArrayList<>();
//        for (Row row : sheet) {
//            String[] data = new String[row.getLastCellNum()];
//            for (int i = 0; i < row.getLastCellNum(); i++) {
//                Cell cell = row.getCell(i);
//                if (cell != null) {
//
//                    switch (cell.getCellType()){
//                        case STRING -> data[i] = row.getCell(i).getStringCellValue();
//                        case NUMERIC -> data[i] = String.valueOf(row.getCell(i).getNumericCellValue());
//                        case BOOLEAN -> data[i] = String.valueOf(row.getCell(i).getBooleanCellValue());
//                    }
//
//                } else {
//                    data[i] = null;
//                }
//            }
//            dataList.add(data);
//        }
//
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//
//        CSVWriter writer = new CSVWriter(new OutputStreamWriter(byteArrayOutputStream));
//        writer.writeAll(dataList);
//        writer.close();
//
//        return byteArrayOutputStream.toByteArray();
//
//    }
//
//}
