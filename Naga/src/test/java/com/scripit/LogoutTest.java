package com.scripit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.EditAccountPage;
import com.pages.LoginPage;
import com.pages.LogoutPaage;

public class LogoutTest extends BaseTest{
	@Test
	public void testLogout() {
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("9581484814");
		lp.setPass("8142061866");
		WebDriverWait wait =new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(lp.loginbutton));
		lp.clickLoginbutton();		
		EditAccountPage ep=new EditAccountPage(driver);
		wait.until(ExpectedConditions.visibilityOf(ep.label));
		ep.clickLabel();
		
		LogoutPaage lp1=new LogoutPaage(driver);
		wait.until(ExpectedConditions.visibilityOf(lp1.logout));
		lp1.clickLogoutButton();
}
}
