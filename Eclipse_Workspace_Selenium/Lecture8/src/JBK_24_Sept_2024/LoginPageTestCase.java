package JBK_24_Sept_2024;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTestCase {
	WebDriver driver = null;
	WebDriver LoginPageTestCase1() {
		final String offlineWeb = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
	     driver = new ChromeDriver();
		driver.get(offlineWeb);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
         return driver;
	}

	public void TestCase001() {
		System.out.println("TestCase001 starting.....");
		driver = LoginPageTestCase1();
		String actTitle = driver.getTitle();
		String exptTitle = "JavaByKiran | Log in";

		if (actTitle.equals(exptTitle)) {
			System.out.println("Login Title TC passed");
		} else {
			System.out.println("Login Title TC failed");
		}
	}

	public void TestCase002() {
		System.out.println("TestCase002 starting.....");
		driver = LoginPageTestCase1();
		String actUrl = driver.getCurrentUrl();
		String exptUrl = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		if(actUrl.equals(exptUrl)) {
			System.out.println("Login URL TC passed");
		}else {
			System.out.println("Login  URL TC failed");
		}
	}

	

}
