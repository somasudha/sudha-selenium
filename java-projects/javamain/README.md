# JavaMain

This project has a simple Java class, that would open a Chrome browser, open a page and prints its page title.

## How to Run
- Clone git repo
```sh
cd ~/git
git clone https://github.com/somasudha/sudha-selenium.git
```
- Import Maven Project ~/git/sudha-selenium/java-projects/javamain to your IDE (Eclipse or IntelliJ)
- Download [Chrome Driver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- Set the Chrome Driver path as a System property "webdriver.chrome.driver" 
- Run Java Class SimpleSeleniumTest
Right Click SimpleSeleniumTest.java > Run As > Java Application

## Files
This project contains two files
```sh
pom.xml
src/main/java/sudha/selenium/javamain/SimpleSeleniumTest.java
```

### pom.xml
Maven's 'Project Object Model' for this simple project
- Download Selenium Java Client (org.seleniumhq.selenium.selenium-java)
- Compile & Run this project with Java 8

### SimpleSeleniumTest.java
- Set Chrome Driver Path
- Create a Chrome Selenium Web Driver (this will open a browser)
- Open a web page
- Print it title
- Quite the Chrome Driver (this will close the browser)
