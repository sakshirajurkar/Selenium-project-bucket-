package JBK_25_Sept_2024;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard_Elements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		driver.get(offlineSite);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		System.out.println("Login successfully");

		

		List<WebElement> sublist = driver.findElements(By.xpath("/html/body/div/div[1]/section[2]"));
		for(WebElement sub : sublist) {
			System.out.println(sub.getText());
		}
		
	}
}
