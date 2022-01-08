package section_5_locator_techniques_and_tools_used_to_identify_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class section_5_locator_techniques_and_tools_used_to_identify_objects {

	public static void main(String[] args) {
		/**
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "/home/parallels/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");


	}

}
