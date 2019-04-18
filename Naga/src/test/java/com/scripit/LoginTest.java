package com.scripit;

import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void testLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("9581484814");
		lp.setPass("8142061866");
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(lp.loginbutton));
		lp.clickLoginbutton();
		
		String eTitle="(1) Facebook";
		String oTitle=lp.getPageTitle();
		Assert.assertEquals(oTitle, eTitle);
	}
		
	
}
