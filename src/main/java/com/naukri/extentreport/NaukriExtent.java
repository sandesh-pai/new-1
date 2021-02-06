package com.naukri.extentreport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NaukriExtent {
	
	
	@Test
	public  void extenttest() {
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
	extent.attachReporter(spark);
	
	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("naukri");
	
	ExtentTest test = extent.createTest("first test");
	test.pass("pass");
	
	extent.flush();
	try {
		Desktop.getDesktop().browse(new File("index.html").toURI());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}

