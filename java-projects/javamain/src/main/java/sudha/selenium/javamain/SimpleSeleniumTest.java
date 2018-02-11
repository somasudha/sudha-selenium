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
		driver.get("https://htmlpreview.github.io/?https://github.com/somasudha/sudha-selenium/blob/master/testpage/index.html");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
