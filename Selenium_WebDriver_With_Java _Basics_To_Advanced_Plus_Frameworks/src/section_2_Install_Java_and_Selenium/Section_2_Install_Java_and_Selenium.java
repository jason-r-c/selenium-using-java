package section_2_Install_Java_and_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Section_2_Install_Java_and_Selenium {

	public static void main(String[] args) {
		
		/**
		 * Course url: 
		 * udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/5791920#notes
		 */

		/**
		 * Chrome web browser
		 */
		System.setProperty("webdriver.chrome.driver", "/home/parallels/eclipse-workspace/chromedriver");
		
		// We 'type' the variableas WebDriver as that is the interface we are
		// implementing via ChromeDriver.		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to a url
		driver.get("http://google.co.uk");
		
		// Validate if your page title is correct
		System.out.println(driver.getTitle() );
		
		// Validate you have landed on the correct url
		System.out.println(driver.getCurrentUrl() );
		
		// Useful for getting webpage source if a website has right-click disabled 
		System.out.println(driver.getPageSource() );
		 
		// Click back in the web browser
		driver.get("http://oracle.com");
		driver.navigate().back();
		System.out.println("Navigated back");
		
		// Click forward in the web browser
		driver.navigate().forward();
		System.out.println("Navigated forward");
		
		// Closes current tab/browser. If only one tab open, then quits the browser.
		// But where 3 tabs are open, focus is on tab 3, and you close(), 
		// youll close the 3rd tab but the other 2 will remain open.
		driver.close();
		
		// Quits all tabs/browsers opened by Selenium. Including multiple tabs.
		driver.quit();
		
		/**
		 * Firefox web browser
		 */
		
		System.setProperty("webdriver.gecko.driver", "/home/parallels/eclipse-workspace/geckodriver");
		
		// We type the variableas WebDriver as that is the interface we are
		// implementing via FirefoxDriver.		
		WebDriver ffdriver = new FirefoxDriver();
		
		ffdriver.get("http://google.co.uk");
		
		System.out.println(ffdriver.getTitle());	
		
		/**
		 * Firefox web browser
		 */
		
		System.setProperty("webdriver.edge.driver", "/home/parallels/eclipse-workspace/msedgedriver");
		
		// We type the variableas WebDriver as that is the interface we are
		// implementing via EdgeDriver.		
		WebDriver eddriver = new EdgeDriver();
		
		eddriver.get("http://google.co.uk");
		
		System.out.println(eddriver.getTitle());		

	}

}
