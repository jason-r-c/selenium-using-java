package section_5_locator_techniques_and_tools_used_to_identify_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class section_5_locator_techniques_and_tools_used_to_identify_objects {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/parallels/eclipse-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		/**
		 * NOTES:
		 * 1) findElement() will search for a html element. 
		 * 2) By is a mechanism used to find elements based on their html attribute and value.
		 * 3) After an element has been located, sendKeys() types into the element (field for example).
		 * 4) After an element has been located, click() will click on the element.
		 */
		System.out.println("\n### Find an element by the html ID attribute. Then type into the field sendkeys(). "
				+ "Then get the name of the html tag. ###");
		WebElement userName = driver.findElement(By.id("inputUsername"));
		System.out.println("inputUsername element contains: "+userName.getTagName());		
		userName.sendKeys("fuzz");
		
		System.out.println("\n### Find an element by the html name attribute. Then type into the field sendkeys(). "
				+ "Then get the location of the element on the webpage. ###");		
		WebElement password = driver.findElement(By.name("inputPassword"));
		System.out.println("The top left-hand corner of the rendered element is: "+password.getLocation());
		password.sendKeys("mcchicken");
		
		System.out.println("\n### Find an element by the html class attribute. Note that the element has 2 classes"
				+ "and we only provided 1 class, so basically we dont need to locate by search for all classes. "
				+ "Then get the button text and click it. ###");
		WebElement signInBtn = driver.findElement(By.className("signInBtn"));
		System.out.println("The top left-hand corner of the rendered element is: "+signInBtn.getText());
		signInBtn.click();
		
		/**
		 * NOTES:	
		 * 1) Using the WebDriverWait() method, we can wait (up to a defined period of time) until an element is visible
		 * The wait will stop as soon as the 'ExpectedConditions' has been met.
		 * 1.1) WebDriverWait() is an Explicit wait whereby Selenium waits until the element is present or fails.
		 * 1.2) Implicit waits wait for the specified time regardless if the element is present already. Implicit waits 
		 * add more time to test run time which isnt good.
		 * An example driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
		 * 2) You can use cssSelector() method which hangs off of the By object.
		 * 
		 * Resources:
		 * https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver
		 */
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")) );
		System.out.println("\n### Wait up to 10 seconds for the 'error' element to become visible on screen. "
				+ "Once the element is visible, we print the element content. ###");
		System.out.println("The error message is: "+errorMsg.getText() );

		/** 
		 * NOTES:
		 * 1) Find a link by the text within the element
		 * 2) Use xpath queries to find and enter login details
		 * 
		 */
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println("\n### Find a link by its inner text then click it. Then find login fields and enter info.");
		driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("testmctest");
		driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("testmctest@example.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Phone Number']")).sendKeys("12345678910");
		

	}

}
