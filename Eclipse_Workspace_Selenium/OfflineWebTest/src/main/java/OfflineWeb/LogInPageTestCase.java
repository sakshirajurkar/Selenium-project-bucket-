package OfflineWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPageTestCase {
	WebDriver driver = null;
	final String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
	XSSFWorkbook book;
	Sheet sheet;

	void codeBeforeAllTestCases() throws Exception {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.get(offlineSite); // Open the offline site
			System.out.println("URL opened");
		}
	}

	Sheet getWorkbookSheet() {
		try {
			File f1 = new File(
					"C:\\Users\\GANESH\\Eclipse_Workspace_Selenium\\OfflineWebTest\\Testing_Jbk_Offline_Web.xlsx");
			InputStream stream = new FileInputStream(f1);
			book = new XSSFWorkbook(stream);
			sheet = book.getSheet("sheetLoginPage");
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheet;
	}

	// Test Case: Checking the Page Title
	public void CheckingTitle() throws Exception {
		codeBeforeAllTestCases();

		String actTitle = driver.getTitle();
		sheet = getWorkbookSheet();
		Row row1 = sheet.getRow(4);
		Cell cellData = row1.getCell(3);
		String expTitle = cellData.toString();
		System.out.println("actTitle: " + actTitle);
		System.out.println("expTitle: " + expTitle);
		if (actTitle.trim().equalsIgnoreCase(expTitle.trim())) {
			System.out.println("Title test case passed");
		} else {
			System.out.println("Title test case failed");
		}
	}

	// Test Case: Checking the URL
	public void CheckingUrl() throws Exception {
		codeBeforeAllTestCases();

		String actUrl = offlineSite;// Get current URL
		sheet = getWorkbookSheet();
		Row row1 = sheet.getRow(3);
		Cell cellData = row1.getCell(3);
		String expUrl = cellData.toString();
		System.out.println("actUrl: " + actUrl);
		System.out.println("expUrl: " + expUrl);

		if (actUrl.equals(expUrl)) {
			System.out.println("URL Test case passed");
		} else {
			System.out.println("URL Test case failed");
		}
	}

	// Test Case: Checking Email Textbox
	public void CheckingEmail() throws Exception {
		codeBeforeAllTestCases();

		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("kiran@gmail.com");

		String enteredEmail = emailField.getAttribute("value");
		String expectedEmail = "kiran@gmail.com";

		System.out.println("enteredEmail > " + enteredEmail);
		System.out.println("expectedEmail > " + expectedEmail);

		if (enteredEmail.equals(expectedEmail))
			System.out.println("tc05 - Email input test case passed");
		else
			System.out.println("tc05 - Email input test case failed");
	}

	public void CheckingPassword() throws Exception {
		codeBeforeAllTestCases();

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("123456");

		String actPassword = passwordField.getAttribute("value");
		String expPassword = "123456";

		System.out.println("actPassword > " + actPassword);
		System.out.println("expPassword > " + expPassword);

		if (actPassword.equals(expPassword))
			System.out.println("Password input test case passed");
		else
			System.out.println("Password input test case failed");
	}

	public void checkLoginButton() throws Exception {
		WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		signInButton.click();

		String actualTitle = driver.getTitle();
		String expectedTitle = "JavaByKiran | Dashboard";

		System.out.println("Actual Title: " + actualTitle);
		System.out.println("Expected Title: " + expectedTitle);

		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Login Test Passed: Dashboard is opened");
		} else {
			System.out.println("Login Test Failed: Dashboard is not opened");
		}

	}

}
