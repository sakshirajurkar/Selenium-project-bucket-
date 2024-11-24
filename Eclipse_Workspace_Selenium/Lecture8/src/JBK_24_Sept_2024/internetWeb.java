package JBK_24_Sept_2024;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class internetWeb {
  public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/login");
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div/input")).sendKeys("tomsmith");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div/input")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
	//SuperSecretPassword! 
}
}
