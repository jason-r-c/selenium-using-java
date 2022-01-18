## Get element by html ID attribute
```
driver.findElement(By.id("inputUsername"));
```

## Get element by html name attribute
```
driver.findElement(By.name("inputPassword"));
```

## Get element by html class attribute
```
driver.findElement(By.className("signInBtn"));
```

## For typing into an element such as an input field
```
driver.findElement(By.id("inputUsername")).sendKeys("fuzz");
```

## To return an html element so that we can further opterate on it
```
/**
 * As findElement() returns a WebElement type, we type our object as WebElement.
 * Then we can call methods on the WebElement object, such as getTagName().
 * It is useful to use Template Proposals to quickly and conveniantly see what methods are available and what they do.
 */
WebElement userName = driver.findElement(By.id("inputUsername"));
System.out.println("inputUsername element contains: "+userName.getTagName());
```

## Explicitly wait (up to 10 seconds) for  an element to become visible

### Create a WebDriverWait instance that uses the driver object, and waits up to 10 seconds
```
WebDriverWait wait = new WebDriverWait(driver, 10);
```

### Wait until the element (located by css selector) is visible on screen
```
WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")) );
```

### Complete example of explicitly waiting for element to become visible
```
/**
 * NOTES:	
 * 1) Using the WebDriverWait() method, we can wait (up to a defined period of time) until an element is visible
 * The wait will stop as soon as the 'ExpectedConditions' has been met.
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
```


