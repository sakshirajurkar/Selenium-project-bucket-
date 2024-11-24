package JBK_04_Oct_2024;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ActionClass {
  public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.co.in/");
	
	Actions builder = new Actions(driver);
	WebElement serachBar = driver.findElement(By.xpath(".//*[@ id='APjFqb']"));
	serachBar.sendKeys("ind");
	
    Action seriesOfActions = builder.moveToElement(serachBar)
    		.click().keyDown(serachBar, Keys.SHIFT). 
    		build();
    	     seriesOfActions.perform();        
	
	System.out.println("Thanks");
}
}
