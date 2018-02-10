/**
 * 
 */
package sudha.selenium.javamain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sudha Somasundaram
 *
 */
public class SimpleSeleniumTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://saucelabs.github.io/training-test-page/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
