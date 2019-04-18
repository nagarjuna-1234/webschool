package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPaage extends BasePage {

	public LogoutPaage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//span[@class='_54nh'])[6]")
	public WebElement logout;
	
	public void clickLogoutButton() {
		logout.click();
	}

}
