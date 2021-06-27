package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebDriver {

	public static void main(String[] args) {
		
		/**
		 * Firefox web browser
		 */
		
		System.setProperty("webdriver.gecko.driver", "/home/parallels/eclipse-workspace/geckodriver");
		
		// We type the variableas WebDriver as that is the interface we are
		// implementing via FirefoxDriver.		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.co.uk");
		
		System.out.println(driver.getTitle());

	}

}
