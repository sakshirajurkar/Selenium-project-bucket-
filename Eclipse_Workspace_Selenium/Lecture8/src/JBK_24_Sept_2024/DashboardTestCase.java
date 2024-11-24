package JBK_24_Sept_2024;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashboardTestCase {
	WebDriver driver = null;

	public DashboardTestCase() {
		driver = new ChromeDriver();
	}

	WebDriver getDashboardPage() {
		final String offlineSite = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		driver.get(offlineSite);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		System.out.println("Login successfully");

		return driver; // it can retrun chrome or offline site and dashboard
	}

	public void tc001CheckingTitle() {
		System.out.println("\n\n tc001CheckingTitle starting...");
		driver = getDashboardPage();
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Dashboard";

		if (actTitle.equals(expTitle)) {
			System.out.println("Dashboard Title TC passed");
		} else {
			System.out.println("Dashboard Title TC failed]");
		}
	}

	public void tc002checkingUrl() {
		System.out.println("\n \n tc002checkingUrl starting....");
		driver = getDashboardPage();
		String actUrl = driver.getCurrentUrl();
		String exptUrl = "offlinesite-dashboardpage.html";

		if (actUrl.equals(exptUrl)) {
			System.out.println("Dashboard URL TC passed");
		} else {
			System.out.println("Dashboard URL TC failed");
		}
	}

	public void tc003checkingCaption() {
		// driver = getDashboardPage();
		// String actCaption = driver.c
		
	}
}
