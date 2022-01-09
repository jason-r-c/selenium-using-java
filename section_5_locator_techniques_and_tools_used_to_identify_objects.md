## Get element by html ID attribute
```
driver.findElement(By.id("inputUsername"));
```

## Get element by html attribute
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
