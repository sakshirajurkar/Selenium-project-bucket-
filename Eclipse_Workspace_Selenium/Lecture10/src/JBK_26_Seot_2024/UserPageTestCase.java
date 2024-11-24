package JBK_26_Seot_2024;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserPageTestCase {
 public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	  String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
     driver.get(offlineSite);
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		System.out.println("Login successfully");
		
		//click on user button
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		
		//find elements 
        List <WebElement> elements = driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]"));
        for(WebElement ele : elements) {
        	System.out.println(ele.getText());
        }
}
}
