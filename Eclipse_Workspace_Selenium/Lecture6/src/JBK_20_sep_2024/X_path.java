package JBK_20_sep_2024;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class X_path {
   public static void main(String[] args) {
	 final String OfflineSiteWeb = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
	WebDriver driver = new ChromeDriver();
	driver.get(OfflineSiteWeb);
	
	System.out.println("Title:-" + driver.getTitle());
	System.out.println("url:-" + driver.getCurrentUrl());
	
	WebElement label1 = driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));
	System.out.println("label:-"+label1.getText());
	
}
}
