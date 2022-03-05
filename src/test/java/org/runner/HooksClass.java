package org.runner;

import java.io.File;

import org.base.LibGlobal;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;

public class HooksClass extends LibGlobal{
	
	@After
	public void failedScenarioScreenShot(Scenario s) {
		if(s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\SauceDemo\\target\\saucedemo.json");
			driver.quit();
		}
	}
	

}
