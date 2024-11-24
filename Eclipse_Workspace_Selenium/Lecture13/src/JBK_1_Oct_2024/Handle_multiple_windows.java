package JBK_1_Oct_2024;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Handle_multiple_windows {
	public static void main(String[] args) {
     String offlineUrl = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
     WebDriver driver = new ChromeDriver();
     driver.get(offlineUrl);
     
     driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.com");
     driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
     driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
     System.out.println("Login succcessfully"+driver.getTitle());
     System.out.println("Dashboard page open"+driver.getTitle());
     
     driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a")).click();
     System.out.println("Downloads page open"+driver.getTitle());
     
     //open JDK url
     driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();
     System.out.println("JDK url open--->"+driver.getTitle());
     
     //Open Standlon jar url
     driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span")).click();
     System.out.println("Open Standlon jar url"+driver.getTitle()); 
     
     //Open source jar url
     driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[8]/a/span")).click();
     System.out.println("Open source jar"+driver.getTitle());
     
     //open google chrome url
     driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[8]/a/span")).click();
     System.out.println("Chrome url open"+driver.getTitle());
     
   //open JDK url
     driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();
     System.out.println("JDK url open--->"+driver.getTitle());
	}
}
