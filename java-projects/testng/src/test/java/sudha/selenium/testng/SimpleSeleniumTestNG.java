/**
 * 
 */
package sudha.selenium.testng;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Sudha Somasundaram
 *
 */
public class SimpleSeleniumTestNG {
	private WebDriver driver = null;

	@BeforeClass
	public void initDriver() throws IOException {
		loadProperties();
		driver = new ChromeDriver();
	}

	public void loadProperties() throws IOException {
		InputStream inStream = this.getClass().getResourceAsStream("/test.properties");
		Properties testProperties = new Properties();
		testProperties.load(inStream);
		System.getProperties().putAll(testProperties);
	}

	@Test
	public void testTitle() throws InterruptedException {
		String expectedTitle = "I am a page title";
		driver.get(
				"https://htmlpreview.github.io/?https://github.com/somasudha/sudha-selenium/blob/master/testpage/index.html");
		// Wait till the page is loaded (or a particular id is visible)
		getElementById(driver, "i_am_an_id");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	private WebElement getElementById(WebDriver driver, String idName) {
		return (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.id(idName)));
//		return getElementBy(driver, By.id(idName)); 
	}

//	private WebElement getElementBy(WebDriver driver, By element) {
//		return (new WebDriverWait(driver, 10)).
//				until(ExpectedConditions.presenceOfElementLocated(element));
//	}

}
