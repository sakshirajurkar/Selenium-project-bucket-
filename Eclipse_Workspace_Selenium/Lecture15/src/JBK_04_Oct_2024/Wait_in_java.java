package JBK_04_Oct_2024;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Wait_in_java {
   public static void main(String[] args) {
	String offlineWeb = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
	WebDriver driver = new ChromeDriver();
	driver.get(offlineWeb);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement txtemail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementID")));
	txtemail.sendKeys("abcd@gmail.com");
	
	driver.findElement(By.xpath("//input [@button ='cancel']")).sendKeys("abc@gmail.com");
	
	System.out.println("Thanks");
}
}
