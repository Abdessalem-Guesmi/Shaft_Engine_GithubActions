package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;

import pages.GooglePage;
import pages.HomePage;

public class BaseTests {

	public WebDriver driver;
	public GooglePage googlePage;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = DriverFactory.getDriver();

		BrowserActions.navigateToURL(driver, "https://www.google.com/");
		googlePage = new GooglePage(driver);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
