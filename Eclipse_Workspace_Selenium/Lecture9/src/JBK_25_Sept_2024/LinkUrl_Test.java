package JBK_25_Sept_2024;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkUrl_Test {
  public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
		String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		driver.get(offlineSite);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		System.out.println("Login successfully");
		
		//text getText
		WebElement text = driver.findElement(By.xpath("/html/body/div/footer/strong/a"));
		text.getText();
		System.out.println(text.getText());
		
		//text click
		WebElement click = driver.findElement(By.xpath("/html/body/div/footer/strong/a"));
		text.click();
		
		
		String attributeValue = text.getAttribute("href");
		System.out.println("href value >" + attributeValue);
		
		
}
}
