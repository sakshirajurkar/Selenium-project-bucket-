package com.tka;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {

	WebDriver driver = null;
	final String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
	XSSFWorkbook book;
	Sheet sheet;

	@BeforeMethod
	void codeBeforeAllTestCases() throws Exception {
		// Initialize the ChromeDriver and set the driver path
		driver = new ChromeDriver();
		driver.get("offlineSite");
		System.out.println("URL opened");

		// Load the Excel file
		
	}

	Sheet getWorkbookSheet() {
		try {
			File f1 = new File("C:\\Users\\GANESH\\Eclipse_Workspace_Selenium\\OfflineWebTesting.xlsx");
			InputStream stream = new FileInputStream(f1);
			// workbook
			book = new XSSFWorkbook(stream);
			sheet = book.getSheet("sheetLoginPage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheet;
	}

	@Test
	public void CheckingTitle() throws Exception {
		// Make sure book is initialized in getWorkbookSheet()
		 codeBeforeAllTestCases();
		Sheet sheet1 = book.getSheet("sheetLoginPage");
		String actTitle = driver.getTitle();
		// Get the expected URL from the Excel sheet
		Row row1 = sheet1.getRow(4); // row -3
		Cell cellData = row1.getCell(3); // col -4
		String expTitle = cellData.toString();
		Assert.assertEquals(actTitle, expTitle);

	}

	@Test
	public void CheckingUrl() throws Exception {
		// Implementation for CheckingUrl test
		Sheet sheet1 = book.getSheet("sheetLoginPage");
		String actUrl = offlineSite;
		// Get the expected URL from the Excel sheet
		Row row1 = sheet1.getRow(3); // row -3
		Cell cellData = row1.getCell(3); // col -4
		String expUrl = cellData.toString();
		Assert.assertEquals(actUrl, expUrl);
	}
	
	@Test
	public void CheckingEmail() throws Exception {
		// Implementation for CheckingEmail test case
		
		
	}
}
