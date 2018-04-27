package by.htp.test.testexample.listener;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.openqa.selenium.TakesScreenshot;

import by.htp.test.testexample.driver.DriverSingletone;

public class ScreenshotOnFailListener implements ITestListener, ISuiteListener,
		IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation");

	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("afterInvocation");

	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStart");

	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("onFinish");

	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		try {
			takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");

		try {
			takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");

	}

	/*
	 * private void takeScreenshot(){ File screenCapture =
	 * ((TakesScreenshot)DriverSingletone
	 * .getWebDriverInstance()).getScreenshotAs(OutputType.FILE); try {
	 * FileUtils.copyFile(screenCapture, new
	 * File(".//target/screenshots/screenshot.png"));
	 * 
	 * 
	 * } catch (IOException e) {
	 * System.out.println("Failed to save screenshot: " +
	 * e.getLocalizedMessage()); } }
	 */

	private void takeScreenshot() throws IOException {
		
		DriverSingletone.getWebDriverInstance().navigate().to("https://s.onliner.by/");
		File screenCapture = ((TakesScreenshot) DriverSingletone
				.getWebDriverInstance()).getScreenshotAs(OutputType.FILE);
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		
		String Path = "D:\\students\\yuliya\\Screenshots\\";
		File screenshotName = new File(Path + "screenshot.png");
		// Now add screenshot to results by copying the file
		FileUtils.copyFile(screenCapture, screenshotName);
	
		Reporter.log("<img src=\"" + screenshotName.getAbsolutePath() + "\"/>");
        
	
	}

}
