package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeWebDriver {

	public static void main(String[] args) {
		
		/**
		 * Firefox web browser
		 */
		
		System.setProperty("webdriver.edge.driver", "/home/parallels/eclipse-workspace/msedgedriver");
		
		// We type the variableas WebDriver as that is the interface we are
		// implementing via EdgeDriver.		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://google.co.uk");
		
		System.out.println(driver.getTitle());

	}

}
