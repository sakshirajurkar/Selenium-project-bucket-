package JBK_09_Oct_2024;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTitleTestCase {

	public void tc01CheckingTitle() throws Exception {
		// selenium
		String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(offlineSite);
		String actTitle = driver.getTitle();

		File f1 = new File("C:\\Users\\GANESH\\Eclipse_Workspace_Selenium\\Lecture18\\Testing_Jbk_Offline_Web.xlsx");
		InputStream stream = new FileInputStream(f1);

		// workbook
		XSSFWorkbook book = new XSSFWorkbook(stream);

		// sheet
		Sheet sheet1 = book.getSheet("sheetLoginPage"); // 1st sheet
		// cell --- row a and col
		Row row1 = sheet1.getRow(4); // row -3
		Cell cellData = row1.getCell(3); // col -4

		String expTitle = cellData.toString();
		System.out.println("actTitle--" + actTitle);
		System.out.println("expTitle--" + expTitle);

		if (actTitle.equals(expTitle)) {
			System.out.println("Title test case passed");
		} else {
			System.out.println(("Title test case failed"));
		}
	}

	public void tc02CheckingUrl() throws Exception {
		// selenium
		String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(offlineSite);
		String actUrl = driver.getCurrentUrl();

		File f1 = new File("C:\\Users\\GANESH\\Eclipse_Workspace_Selenium\\Lecture18\\Testing_Jbk_Offline_Web.xlsx");
		InputStream stream = new FileInputStream(f1);

		// workbook
		XSSFWorkbook book = new XSSFWorkbook(stream);

		// sheet
		Sheet sheet1 = book.getSheet("sheetLoginPage"); // 1st sheet
		// cell --- row a and col
		Row row1 = sheet1.getRow(3); // row -3
		Cell cellData = row1.getCell(3); // col -4

		String expUrl = cellData.toString();
		System.out.println("actUrl--" + actUrl);
		System.out.println("expUrl--" + expUrl);

		if (actUrl.equals(expUrl)) {
			System.out.println("Title test case passed");
		} else {
			System.out.println("Title test case failed");
		}
	}

	public void tc03CheckingEmail() throws Exception {
		String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(offlineSite);
		String actUrl = driver.getCurrentUrl();

		File f1 = new File("C:\\Users\\GANESH\\Eclipse_Workspace_Selenium\\Lecture18\\Testing_Jbk_Offline_Web.xlsx");
		InputStream stream = new FileInputStream(f1);

		// workbook
		XSSFWorkbook book = new XSSFWorkbook(stream);

		// sheet
		Sheet sheet1 = book.getSheet("sheetLoginPage"); // 1st sheet
		// cell --- row a and col
		Row row1 = sheet1.getRow(3); // row -3
		Cell cellData = row1.getCell(3); // col -4

		String expUrl = cellData.toString();
		System.out.println("actUrl--" + actUrl);
		System.out.println("expUrl--" + expUrl);

		if (actUrl.equals(expUrl)) {
			System.out.println("Title test case passed");
		} else {
			System.out.println("Title test case failed");
		}
	}

}
