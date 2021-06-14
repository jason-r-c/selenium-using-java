package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/parallels/eclipse-workspace/chromedriver");
		
		// We type the variableas WebDriver as that is the interface we are
		// implementing via ChromeDriver.		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.co.uk");
		
		System.out.println(driver.getTitle());
	}

}
