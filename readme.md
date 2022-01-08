## Course progress
31. Importance of locators in Selenium WebDriver to identify the elements - https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29095972#questions/1509309

## Where the Eclipse project can be found
In the Ubuntu VM > open Terminal > cd ~/eclipse-workspace

## Issues Building the project
If there are any issues with building the project try setting the java compiler to 1.7

see "To avoid such error, You should change java compiler to early version 1.7 or 1.7 from configuring build path." from https://stackoverflow.com/questions/52245708/the-type-org-openqa-selenium-chrome-chromedriver-is-not-accessible

## Creating project - dont create 'module-info java file'
When creating a new project, do NOT create a 'module-info java file', based on past experience this has caused issues previously. See https://stackoverflow.com/questions/52158125/how-to-get-eclipse-to-stop-asking-to-create-a-module-info-java-file-on-new-java

## Display editor in IDE
When launching eclipse and the workspace (should be the default seleciton) click the Workbench icon on the right hand side. This then the displays the code editor.

## Creating a new Package
There isnt really any need to create a 'package-info' file (one hasnt been created for classes at time of writing - Jan '22)

## Creating a new Class
Tick checkbox "public static void main(String[] args)". This will create the method that gets called fist when running the class.

## How to update Chromedriver
First, check the version of Chrome installed

Go to https://chromedriver.chromium.org/downloads

Find the version you have installed

Download 

Add to ~/eclipse-workspace

