package JBK_03_Oct_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles_Multiple_Windows {
	public static WebDriver getWindowsClicked() {
		String offlineUrl = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(offlineUrl);

		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		System.out.println("Login succcessfully" + driver.getTitle());
		System.out.println("Dashboard page open" + driver.getTitle());

		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a")).click();
		// javabykiran
		driver.findElement(By.xpath("/html/body/div/footer/strong/a")).click();
		
		// Oracle
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();
		// selenium
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span")).click();
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[8]/a/span")).click();
		Set<String> windowsName = driver.getWindowHandles();
		List<String> windowsNameList = new ArrayList<>(windowsName);
       
		String window = windowsNameList.get(0);
		driver.switchTo().window(window);
		System.out.println("window 0-->" + driver.getCurrentUrl());
		return driver;
	}
}
