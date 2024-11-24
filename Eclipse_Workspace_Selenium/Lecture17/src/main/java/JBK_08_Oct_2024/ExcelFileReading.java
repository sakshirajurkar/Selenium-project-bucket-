package JBK_08_Oct_2024;
import java.io.InputStream;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReading {
  public static void main(String[] args) throws Exception {
	File f1 = new File("C:\\Users\\GANESH\\Eclipse_Workspace_Selenium\\Lecture17\\Testing.xlsx");	
	
	InputStream stream = new FileInputStream(f1);
	System.out.println("InputStream");
	
	
	//workbook
	XSSFWorkbook book = new XSSFWorkbook(stream);
	System.out.println("XSSFWorkbook");
	
	//sheet
	Sheet sheet1 = book.getSheet("login_sheet"); //1st sheet
	System.out.println("sheet1");
	
	//cell --- row a and col
	Row row1 = sheet1.getRow(1);
	Cell cell_01 =row1.getCell(2);            //row1.getCell(2);
	System.out.println("cell_01 >" + cell_01);
   }
}
