package com.amazon.cucumber;

import com.amazon.managers.PageObjectManager;
import com.amazon.managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		webDriverManager = WebDriverManager.getInstance();
		// create driver
		try {
			WebDriverManager.getInstance().setDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}