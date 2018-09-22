package com.amazon.pageObjects;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "email")
	private WebElement txtbx_Email;

	@FindBy(how = How.NAME, using = "password")
	private WebElement txtbx_Password;

	@FindBy(how = How.ID, using = "continue")
	private WebElement txtbx_Continue;

	@FindBy(how = How.ID, using = "signInSubmit")
	private WebElement txtbx_SignInSubmit;

	public void enter_Email(String email) {
		txtbx_Email.sendKeys(email);
	}

	public void enter_Password(String pswd) {
		txtbx_Password.sendKeys(pswd);
	}

	public void perform_SignIn(JSONObject customer) {
		enter_Email(customer.get("emailAddress").toString());
		txtbx_Continue.click();
		enter_Password(customer.get("password").toString());
		txtbx_SignInSubmit.click();

	}

}