package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {
	
	public static  void generateReport(String json) {
		File f = new File("C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\SauceDemo\\target");
		Configuration c = new Configuration(f, "SauceDemo");
		c.addClassifications("SauceDemo", "Validation");
		c.addClassifications("Browser", "Chrome");
		List<String> jsonFile = new ArrayList();
		jsonFile.add(json);
		ReportBuilder r = new ReportBuilder(jsonFile, c);
		r.generateReports();
	}

}
