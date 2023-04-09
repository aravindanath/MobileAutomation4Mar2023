package day5;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXlsx {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"studentData.xlsx";
        FileInputStream fis = new FileInputStream(path);
        /**
         * HSSF --> xls
         * XSSF --> XLSX
         */

        XSSFWorkbook wb = new XSSFWorkbook(fis);
       Sheet sh =  wb.getSheetAt(0);
      String value =  sh.getRow(1).getCell(0).getStringCellValue();
        System.out.println(value);


    }
}
