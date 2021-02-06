package com.naukri.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.naukri.resources.config;
import com.naukri.utils.readproperty;

public class NaukriRetry implements IRetryAnalyzer{

	private int count = 0;
	private int retries = 2;
	
	public boolean retry(ITestResult result) {
		if (readproperty.getvalue(config.retryfailedtestcases).equalsIgnoreCase("yes")) {
		if (count < retries){
			count++;
			return true;
		}
		
	}
		return false;
	}
	
	
	
	
	
	
	
	
}
