package JBK_26_Seot_2024;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserPageFormTestCase {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		driver.get(offlineSite);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		System.out.println("Login successfully");

		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();

		driver.findElement(By.id("username")).sendKeys("Sakshi");
		driver.findElement(By.id("mobile")).sendKeys("12345678");
		driver.findElement(By.id("email")).sendKeys("sakshi123@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Manual Testing");

		driver.findElement(By.id("Female")).click();
		
		WebElement stateElement = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		Select selectState = new Select(stateElement);
		
		selectState.selectByIndex(2);
		driver.findElement(By.id("password")).sendKeys("123");
		//submit
		driver.findElement(By.id("submit")).click();
		
		Alert alrt = driver.switchTo().alert();
		System.out.println("Alert msg :"+alrt.getText());
		alrt.accept();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/a/span")).click();

	}
}
