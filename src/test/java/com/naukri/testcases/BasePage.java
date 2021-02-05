package com.naukri.testcases;

import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.naukri.Driver.Driver;

public class BasePage {

	
	@SuppressWarnings("unchecked")
	@BeforeMethod()
	public void setUp(Object[] data)
	{
		Map<String, String>map = (Map<String, String>) data[0];
		Driver.initDriver(map.get("browser"));
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
	// Driver.quitDriver();	
	}
}
