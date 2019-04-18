package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[contains(@id,'email')]")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@id='u_0_2']")
	public WebElement loginbutton;
	
	
	public void setEmail(String EMAIL) {
		email.sendKeys(EMAIL);
	}
	
	public void setPass(String password) {
		pass.sendKeys(password);
	}
	
	public void clickLoginbutton() {
		loginbutton.click();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
}
