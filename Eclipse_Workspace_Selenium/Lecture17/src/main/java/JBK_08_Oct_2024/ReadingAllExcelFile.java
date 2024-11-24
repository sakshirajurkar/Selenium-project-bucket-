package JBK_08_Oct_2024;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingAllExcelFile {
	public static void main(String[] args) throws Exception {
		File f1 = new File("C:\\Users\\GANESH\\Eclipse_Workspace_Selenium\\Lecture17.xlsx");

		InputStream stream = new FileInputStream(f1);

		// workbook
		XSSFWorkbook book = new XSSFWorkbook(stream);

		// sheet
		Sheet sheet1 = book.getSheet("login_sheet"); // 1st sheet
		int noRows = sheet1.getPhysicalNumberOfRows();
		// cell --- row a and col
		for (int i = 0; i < noRows; i++) {
			Row row = sheet1.getRow(i);
			int noColmns = sheet1.getPhysicalNumberOfRows();

			for (int j = 0; j < noColmns; j++) {
				Cell cll = row.getCell(j);
				String cllValue = new String(cll.toString());
				System.out.println(" - " + cllValue);
			}
			System.out.println();
		}

	}
}
