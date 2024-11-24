package JBK_03_Oct_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collection;

import org.openqa.selenium.WebDriver;

public class AllWindowsHandle {
	static Set<String> windowsNames = null;
	static String parentWindow = null;
	static String childWindow01 = null;
	static String childWindow02 = null;
	static String childWindow03 = null;

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome for all windows testing");
		WebDriver driver = Handles_Multiple_Windows.getWindowsClicked();
		Set<String> windowsName = driver.getWindowHandles();
		List<String> windowsNameList = new ArrayList<>(windowsName); 
		String window = windowsNameList.get(0);
		driver.switchTo().window(window);
		System.out.println("window 0-->" + driver.getCurrentUrl());
		window = windowsNameList.get(1);
		driver.switchTo().window(window);
		System.out.println("window 1-->" + driver.getCurrentUrl());
           
		window = windowsNameList.get(2);
		driver.switchTo().window(window);
		System.out.println("window 2-->" + driver.getCurrentUrl());

//		window = windowsNameList.get(3);
//		driver.switchTo().window(window);
//		System.out.println("window 3-->" + driver.getCurrentUrl());
//		
		System.out.println("Thanks");

	}
}
