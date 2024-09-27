package com.automation.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class DataProviderClass {

    @org.testng.annotations.DataProvider(name ="Product data")
    public static Object[][] readProductData() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/product.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        Object[][] obj = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
        for (int k = 1; k <= sheet.getLastRowNum(); k++) {
            Row row = sheet.getRow(k);
            for (int i = 0; i < row.getLastCellNum(); i++) {
                XSSFCell cell = (XSSFCell) row.getCell(i);
                obj[k - 1][i] = cell.getStringCellValue();
            }
        }
        return obj;
    }
}
