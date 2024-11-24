package JBK_1_Oct_2024;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation_Methods {
	public static void main(String[] args) {
	final String offlineUrl = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
	WebDriver driver= new ChromeDriver();
	driver.get(offlineUrl);
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	//login page
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
	System.out.println("Login Successfully--"+driver.getTitle());
	System.out.println("Dashboard page open"+driver.getTitle());
	//dashboard page
	driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
	System.out.println("User page open"+driver.getTitle());
	
	//user page
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
	System.out.println("Add User page open"+driver.getTitle());
	
	//first way
	driver.navigate().back();
	System.out.println("back-->"+ driver.getTitle());
	
	driver.navigate().to("https://www.youtub.com/");
	
	//second way
	Navigation nv = driver.navigate();
	nv.forward();
	nv.refresh();
	
	}
}
