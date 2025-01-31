package JBK_23_Sept_2024;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ValidID_InvalidPassword_Locators {
  public static void main(String[] args) {
	  String OfflineUrl = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
	  WebDriver driver = new ChromeDriver();
	  driver.get(OfflineUrl);
	  
	  WebElement emailTextBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailTextBox.sendKeys("sakshi@gmail.com");
		
		WebElement passwordTextBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passwordTextBox.sendKeys("12345");
		
		WebElement btnClick = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		btnClick.click();
		
		WebElement errorMsg1= driver.findElement(By.xpath("//*[@id=\"email_error\"]"));
		System.out.println("error msg 1 :" + errorMsg1.getText());
  
        WebElement errorMsg2 = driver.findElement(By.xpath("//*[@id=\"password_error\"]"));
        System.out.println("error msg 2 :"+ errorMsg2.getText());
  }
  
  
}
