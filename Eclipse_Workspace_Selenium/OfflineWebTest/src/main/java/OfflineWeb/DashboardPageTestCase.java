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
import org.openqa.selenium.chrome.ChromeDriver;

public class DashboardPageTestCase {

    WebDriver driver = null;
    final String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
    XSSFWorkbook book;
    Sheet sheet;

    // This method initializes the ChromeDriver and opens the offline site
    void initializeDriver() throws Exception {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.get(offlineSite);
            System.out.println("URL opened");
        }
    }

    // Load Workbook and Sheet
    Sheet getWorkbookSheet() {
        try {
            File f1 = new File("C:\\Users\\GANESH\\Eclipse_Workspace_Selenium\\OfflineWebTest\\Testing_Jbk_Offline_Web.xlsx");
            InputStream stream = new FileInputStream(f1);
            book = new XSSFWorkbook(stream);
            sheet = book.getSheet("sheetDashboardPage"); // Correct the spelling if needed
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheet;
    }

    // Test Case: Checking the Dashboard URL
    public void CheckingDashboardUrl() throws Exception {
        initializeDriver(); // Changed method name for clarity
        getWorkbookSheet(); // Load the workbook

        String actUrl = driver.getCurrentUrl();
        Row row = sheet.getRow(3); // Assuming the expected URL is in the fourth row
        Cell cellData = row.getCell(3); // Assuming expected URL is in the fourth column

        String expUrl = cellData.toString();
        System.out.println("Actual URL: " + actUrl);
        System.out.println("Expected URL: " + expUrl);

        // Compare actual and expected URLs
        if (actUrl.equals(expUrl)) {
            System.out.println("URL Test case passed");
        } else {
            System.out.println("URL Test case failed");
        }
    }

    // Test Case: Checking the Dashboard Title
    public void CheckingDashboardTitle() throws Exception {
        
        String actTitle = driver.getTitle();
        Row row = sheet.getRow(3); 
        Cell titleCell = row.getCell(4);

        String expTitle = titleCell.toString();
        System.out.println("Actual Title: " + actTitle);
        System.out.println("Expected Title: " + expTitle);

        if (actTitle.equals(expTitle)) {
            System.out.println("Title Test case passed");
        } else {
            System.out.println("Title Test case failed");
        }
    }

    
        
    
}
