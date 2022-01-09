package section_5_locator_techniques_and_tools_used_to_identify_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
				+ "and we only provided 1 class, so basically we dont need to locate by search for all classes."
				+ "Then get the button text and click it. ###");
		WebElement signInBtn = driver.findElement(By.className("signInBtn"));
		System.out.println("The top left-hand corner of the rendered element is: "+signInBtn.getText());
		signInBtn.click();


	}

}
