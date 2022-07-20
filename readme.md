## Course progress
34. Browser plugins- Selectorshub to identify and validate the elements on the page - https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29096016#overview

## Install Open JDK
1- See https://stackoverflow.com/questions/14788345/how-to-install-the-jdk-on-ubuntu-linux and follow instructions of top rated comment. 

2- When setting enviroment variable, see https://stackoverflow.com/questions/9612941/how-to-set-java-environment-path-in-ubuntu and folowing instructions of top rated comment. 

If not avaible there is a scrape below for bullet 1:

```
Open Terminal from Application Dash or press Ctrl+Alt+T

Update repository:

sudo add-apt-repository ppa:openjdk-r/ppa  # only Ubuntu 17.4 and earlier
sudo apt update
Optional: To search available distributions of openjdk, use the following command:

apt search openjdk
Install the appropriate version with the following command:

sudo apt install openjdk-8-jdk
sudo apt install openjdk-8-source #this is optional, the jdk source code
For JAVA_HOME (Environment Variable) type command as shown below, in "Terminal" using your installation path...

export JAVA_HOME=/usr/lib/jvm/java-8-openjdk
(Note: /usr/lib/jvm/java-8-openjdk is symbolically used here just for demostration. You should use your path as per your installation.)

For PATH (Environment Variable) type command as shown below, in Terminal:

export PATH=$PATH:$JAVA_HOME/bin

To check your installation:

java -version
```

Scrape for bullet 2:

```
set environment variables as follows

Edit the system Path file /etc/profile

sudo gedit /etc/profile
Add following lines in end

JAVA_HOME=/usr/lib/jvm/jdk1.7.0
PATH=$PATH:$HOME/bin:$JAVA_HOME/bin
export JAVA_HOME
export JRE_HOME
export PATH
Then Log out and Log in ubuntu for setting up the paths...
```

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

## How to add Template Proposal method information
I added an answer to my own question on the Q and A section which has screenshots
https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29095978#questions/16615624

Question)

"Hi

Im not too sure how to see method information using Eclipese. For example, when i type driver.get() the template proposal window pops up, but the get() method information isnt displayed - does anyone know how to set this up / enable?

See image attached which hopefully describes what i mean.

Thanks."

Answer)

"After some more digging i have found a solution.

1) If you right click on the Java project folder > click properties:

2) Java Build Path > Classpath > select "client-combined-3.141.59.jar" > click Edit button:

3) External location > External file > "client-combined-3.141.59-sources.jar" > click ok button:

You should now see the method information displayed in the Template Proposal:"
