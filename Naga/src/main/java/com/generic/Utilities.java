package com.generic;

import java.io.File;
import java.io.IOException;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utilities {
	public static void captureScreenShot(WebDriver driver,String testName) throws IOException {
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshots/"+testName+".png");
		Files.copy(src, dst);
	
		
		
	}

}
