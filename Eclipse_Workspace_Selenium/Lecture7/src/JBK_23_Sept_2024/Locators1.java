package JBK_23_Sept_2024;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators1 {
   public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
	WebElement emailTextBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	emailTextBox.sendKeys("kiran@gmail.com");
	
	WebElement passwordTextBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	passwordTextBox.sendKeys("123456");
	
	WebElement btnClick = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
	btnClick.click();
	
	
	
}
}
