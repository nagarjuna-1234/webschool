package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage  extends BasePage{

	public EditAccountPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@id='userNavigationLabel']")
	public WebElement label;
	
	@FindBy(xpath="(//span[.='Settings'])[2]")
	public  WebElement settings;
	
	public void clickLabel() {
		label.click();
	}
public void clickSetting() {
	settings.click();
}
public String getPageTitle() {
	return driver.getTitle();
}

}
