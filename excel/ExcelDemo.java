package excel;

import class24.File;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\daria\\OneDrive\\Desktop\\Text.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row= ((XSSFSheet) sheet).getRow(0);
        System.out.println(row.getCell(0));


    }
}
