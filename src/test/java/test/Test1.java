package test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTests;

public class Test1 extends BaseTests {
	private String title;

	@Test(priority = 1)
	public void test1() {
		googlePage.sendKeyWord("Test0");
		homePage = googlePage.clickSearchBtn();
		title = homePage.getTitle();

		assertTrue(title.contains("Test0"));
	}

	@Test(priority = 2)
	public void test2() throws InterruptedException {
		googlePage.sendKeyWord("Test2");
		homePage = googlePage.clickSearchBtn();
		title = homePage.getTitle();
		Thread.sleep(3000);
		assertFalse(title.contains("Test2"));

	}

	@Test(priority = 3)
	public void test3() {
		googlePage.sendKeyWord("Test3");
		homePage = googlePage.clickSearchBtn();
		throw new SkipException("test-case skipped");

	}

	@Test(priority = 4)
	public void test4() {
		googlePage.sendKeyWord("Test4");
		homePage = googlePage.clickSearchBtn();
		title = homePage.getTitle();
		assertTrue(title.contains("Test4"));

	}

}
