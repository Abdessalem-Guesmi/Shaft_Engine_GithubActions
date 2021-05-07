package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

import io.qameta.allure.Step;

public class GooglePage {
	private WebDriver driver;
	private By fieldSearch = By.name("q");
	private By searchBtn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");

	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Enter a key word into search field")
	public void sendKeyWord(String key) {
		ElementActions.type(driver, fieldSearch, key);
	}

	@Step("Navigate to Home page")
	public HomePage clickSearchBtn() {
		System.out.println("*************");
		ElementActions.click(driver, searchBtn);
		return new HomePage(driver);
	}
}
