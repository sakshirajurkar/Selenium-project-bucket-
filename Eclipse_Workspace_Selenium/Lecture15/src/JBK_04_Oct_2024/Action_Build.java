package JBK_04_Oct_2024;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Build {
     public static void main(String[] args) {
		WebDriver   driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchBar = driver.findElement(By.name("q"));
		Actions actions = new  Actions(driver);
		searchBar.sendKeys("ind");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		actions.sendKeys(searchBar, org.openqa.selenium.Keys.ARROW_DOWN)
		.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN)
		.sendKeys(org.openqa.selenium.Keys.ENTER).perform();
	}
}
