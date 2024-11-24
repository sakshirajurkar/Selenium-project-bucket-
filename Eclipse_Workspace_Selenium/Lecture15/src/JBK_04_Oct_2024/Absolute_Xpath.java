package JBK_04_Oct_2024;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
   public static void main(String[] args) {
	///html/body/div/div[2]/form/div[1]/input
	   String offlineWeb = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(offlineWeb);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");///p[@class='intro']
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();;
}
}
