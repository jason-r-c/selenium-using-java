## Methods

### Set the path to the browser driver

```
/**
 * NOTES:
 * 1) You will need to keep each web browser driver up to date, as web browser will update regularly.
 */


// Chrome
System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

// Firefox
System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");

// Edge
System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver");
```

### Invoke an instance of the browser driver

```
/** 
 * NOTES:
 * 1) We type the variable as 'WebDriver' as that is the interface we are implementing via ChromeDriver.
 */

	
// Create instannce of Chrome
WebDriver driver = new ChromeDriver();

// Create instannce of Edge
WebDriver driver = new EdgeDriver();

// Create instannce of Firefox
WebDriver driver = new FirefoxDriver();
```


### Navigate to a url

```
//
driver.get("http://google.co.uk");
```

### Get web page title

```
// Validate if your page title is correct
System.out.println(driver.getTitle() );
```

### Get web page url

```
// Validate you have landed on the correct url
System.out.println(driver.getCurrentUrl() );
```


### Get web page HTML source

```
// Useful for getting webpage source if a website has right-click disabled 
System.out.println(driver.getPageSource() );
```

### Click back in the web browser

```
driver.navigate().back();
```

### Click forward in the web browser

```
driver.navigate().forward();
```

### Close current tab/browser 

```
/**
 * NOTES:
 * If only one tab open, then quits the browser.
 * But where 3 tabs are open, focus is on tab 3, and you close(), 
 * youll close the 3rd tab but the other 2 will remain open.
 */
driver.close();
```

### Quit all tabs/browsers opened by Selenium

```
// Quitting also includes multiple tabs that have been opened.
driver.quit();
```

