package review11;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReaderDemo {
    public static void main(String[] args) {
        String path="Files/Review.xlsx";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");
            Row row=sheet1.getRow(3);
           // Cell cell=row.getCell(0);
            System.out.println(row.getCell(2));
        } catch (Exception e) { //will catch all exception
            System.out.println("Please check the path of the file");
        }


    }
}
