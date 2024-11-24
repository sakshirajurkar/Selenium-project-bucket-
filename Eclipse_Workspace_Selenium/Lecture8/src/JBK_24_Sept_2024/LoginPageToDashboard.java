package JBK_24_Sept_2024;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageToDashboard {
	public static void main(String[] args) throws Exception {
		final String OfflineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(OfflineSite);
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		System.out.println("Login successfully");
		
		System.out.println("Now dashboard testing started");
		
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Dashboard";
		 if(actTitle.equals(expTitle)) {
			 System.out.println("Dashboard Title TC passed");
		 }
		 else {
			 System.out.println("Dashboard Title TC failed");
		 }
	}
}
