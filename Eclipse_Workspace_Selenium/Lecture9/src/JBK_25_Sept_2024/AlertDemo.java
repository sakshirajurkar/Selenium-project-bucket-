package JBK_25_Sept_2024;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertDemo {
  public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
	TargetLocator alert = driver.switchTo();
	
	

	
	
	
	
}
}
