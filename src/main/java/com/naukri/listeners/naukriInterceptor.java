package com.naukri.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.naukri.dataprovider.naukriCredentials;

public class naukriInterceptor implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
		annotation.setDataProviderClass(naukriCredentials.class);
		annotation.setDataProvider("getdata");
		annotation.setRetryAnalyzer(NaukriRetry.class);
		
	}

	
	
}
