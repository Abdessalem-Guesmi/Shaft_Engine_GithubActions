package pages;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public class HomePage {
	private WebDriver driver;
	private String title;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@Step("get title of home page")
	public String getTitle() {

		title = driver.getTitle();
		return title;
	}
}
