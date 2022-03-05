package org.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\SauceDemo\\src\\test\\resources\\SauceDemo\\SauceDemo.feature", glue="org.steps", monochrome=true,
plugin="json:C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\SauceDemo\\target\\saucedemo.json")
public class CommonRunner {
	
	@AfterClass
	public static void reportGeneration() {
		ReportGeneration.generateReport("C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\SauceDemo\\target\\saucedemo.json");
	}
	
}
