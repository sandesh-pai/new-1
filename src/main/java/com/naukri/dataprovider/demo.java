package com.naukri.dataprovider;

import java.util.Map;

import org.testng.annotations.Test;

public class demo {
	
	@Test(dataProviderClass = naukriCredentials.class, dataProvider = "getdata")
	public void loginWithChrome(Map<String, String>map)
	{
		System.out.println(map.get("browser"));
	}

}
