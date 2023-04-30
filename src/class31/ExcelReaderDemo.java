package class31;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo {
    public static void main(String[] args) throws IOException {
        //location of file on the computer
        String path="Files/Book1.xlsx";
        //navigate to the file
        FileInputStream fileInputStream=new FileInputStream(path);
        //it is a class that knows how to read and write data to an Excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //we need to get the sheet first using below method
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");
        //as we are interested in the row 1 we pass 1 inside the getRow method rows and columns index based like array
        Row row=sheet1.getRow(1);
        Cell cell=row.getCell(1);
        System.out.println(cell);






    }
}
