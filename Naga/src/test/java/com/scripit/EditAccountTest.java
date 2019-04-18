package com.scripit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.EditAccountPage;
import com.pages.LoginPage;

public class EditAccountTest extends BaseTest {
	@Test
	public void testEditAccount() {
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("9581484814");
		lp.setPass("8142061866");
		WebDriverWait wait =new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(lp.loginbutton));
		lp.clickLoginbutton();		
		EditAccountPage ep=new EditAccountPage(driver);
		wait.until(ExpectedConditions.visibilityOf(ep.label));
		ep.clickLabel();
		wait.until(ExpectedConditions.visibilityOf(ep.settings));
		ep.clickSetting();
		String eTitle="General Account";
		String oTitle="lp.get";
		Assert.assertEquals(oTitle, eTitle);
	}
}
