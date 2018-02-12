# Java TestNG

This project has a simple TestNG test case , that would open a Chrome browser, open a page, wait till it loads, gets its page title and checks if the page's title is same as expected.

## How to Run
- Clone git repo, if you haven't
```sh
cd ~/git
git clone https://github.com/somasudha/sudha-selenium.git
```
- Make sure Chrome Driver location is set properly in [test.properties](src/test/resources/test.properties)
- Run the test
```sh
#Go to Git Hub repo in your local computer
cd ~/git/sudha-selenium
#Go to testng project
cd java-projects/testng/
#Execute Maven Test
mvn test
```
- Check Results, Open this file in Chrome
```sh
file:///Users/rpalaniappan/git/sudha-selenium/java-projects/testng/target/surefire-reports/emailable-report.html
```

## Files
This project contains these files
```sh
├── pom.xml
└── src
    └── test
        ├── java
        │   └── sudha
        │       └── selenium
        │           └── testng
        │               └── SimpleSeleniumTestNG.java
        └── resources
            └── test.properties
```

### pom.xml
Maven's 'Project Object Model' for this simple project
- Download Selenium Java Client libraries (org.seleniumhq.selenium.selenium-java)
- Download TestNG librarires
- Compile & Run this project with Java 8

### test.properties
- Contains Chrome Driver location in the laptop

### SimpleSeleniumTestNG.java
- Before any test in run in this class, get a Chrome Driver
-- Load test.properties
-- Create a Chrome Webdriver (this will open a browser)
- Run the test 'testTitle'.
-- Load the test page
-- Wait for the to load.  Check for a known element for upto 10 seconds
-- Get the title of the loaded page
-- Verify if the page title is as expected
- After all tests in this class are run, quit the Chrome Driver
