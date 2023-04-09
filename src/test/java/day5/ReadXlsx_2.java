package day5;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadXlsx_2 {
    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"studentData.xlsx";
        FileInputStream fis = new FileInputStream(path);
        /**
         * HSSF --> xls
         * XSSF --> XLSX
         */

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet sh =  wb.getSheetAt(0);
        int totalRow =  sh.getLastRowNum();
        for(int i=0; i<totalRow+1; i++) {
            String name =  sh.getRow(i).getCell(0).getStringCellValue();
            String city = sh.getRow(i).getCell(1).getStringCellValue();
            String pincode = sh.getRow(i).getCell(2).getStringCellValue();
            System.out.println(name + " " + city + " " + pincode);
        }



    }
}
