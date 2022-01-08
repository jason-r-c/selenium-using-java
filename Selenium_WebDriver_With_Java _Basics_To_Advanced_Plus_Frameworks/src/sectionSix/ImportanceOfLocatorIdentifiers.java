package sectionSix;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImportanceOfLocatorIdentifiers {

	public static void main(String[] args) {
		/**
		 * Chrome web browser
		 */
		System.setProperty("webdriver.chrome.driver", "/home/parallels/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://m.facebook.com");
		
		// Wait up to 3 seconds for the cookies pop up so to confirm the page has loaded
		WebDriverWait wait = new WebDriverWait(driver,3);		
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@data-testid=\"cookie-policy-dialog\"]//*[@data-cookiebanner=\"accept_button\"]")));

		// Find element so to accept cookies
		driver.findElement(By.xpath("//*[@data-testid=\"cookie-policy-dialog\"]//*[@data-cookiebanner=\"accept_button\"]")).click();
		
		// Wait up to 3 seconds for presence of the 'data-sigil' attribute and value.
		// This was chosen as this seems more likely NOT to change (text on screen is more likely to change).
		WebDriverWait clickEmailField = new WebDriverWait(driver,10);		
		clickEmailField.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@data-sigil=\"m_login_notice\"]")));
		
		// Enter email address
		driver.findElement(By.name("email")).sendKeys("timmytest@example.com");
		
		// ## Move to next lecture "identifying locators(id,name,linkText) with
		// developer tools -1"
		// ###############################################################################
		
		// Find email address field, then enter password
		driver.findElement(By.name("pass")).sendKeys("S3cr3t123$");
		
		// Click the login button 
		// NOTE: Mobile FB didnt seem to do much when i clicked it (for some reason)
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		
		// Click the forgotten password link
		driver.findElement(By.partialLinkText("Forgotten")).click();

	}
	

}
