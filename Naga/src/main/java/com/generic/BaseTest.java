package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public abstract class BaseTest implements AutoConstant {
	public WebDriver driver ;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	@BeforeSuite
	public void beforeSuite() {
	htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/SMEExtentReport.html");
	extent=new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	extent.setSystemInfo("Host Name", "SoftWare Testing Material");
	extent.setSystemInfo("Environmental", "Automation Testing");
	extent.setSystemInfo("user Name", "naga");
	
	htmlReporter.config().setDocumentTitle("Document of the Title comes here");
	htmlReporter.config().setReportName("Report of the Name comes here");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.DARK);
		
	}
	
	@BeforeMethod
	public void preCondition() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	driver=new ChromeDriver(options);
	driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void postCondition(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			Utilities.captureScreenShot(driver, result.getName());
			logger.fail(result.getThrowable());
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"test case fail", ExtentColor.RED));
		}
		//driver.close();
	}
		@AfterMethod
		public void afterSuite() {
			extent.flush();
		}
	


	}
