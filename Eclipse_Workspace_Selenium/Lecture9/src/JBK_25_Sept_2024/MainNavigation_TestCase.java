package JBK_25_Sept_2024;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainNavigation_TestCase {
  public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
		String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		driver.get(offlineSite);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		System.out.println("Login successfully");
		
		
//		WebElement textElement1 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a"));
//		textElement1.getText();
//		
//		WebElement textElement2 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a"));
//		textElement2.getText();
//		
//		WebElement textElement3 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a"));
//		textElement3.getText();
//		
//		WebElement textElement4 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a/span"));
//		textElement4.getText();
//		
//		WebElement textElement5 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a"));
//		textElement5.getText();
//		
//		WebElement textElement6 = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a"));
//		textElement6.getText();
		
		///html/body/div/aside/section/ul/li[1]
		List<WebElement> sublist = driver.findElements(By.xpath("/html/body/div/aside"));
		for(WebElement sub : sublist) {
			System.out.println(sub.getText());
		}
}
}
