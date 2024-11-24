package JBK_19_sep_2024;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basic {
     public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.flipkart.com/");
		System.out.println("url is opened");
	}
}
