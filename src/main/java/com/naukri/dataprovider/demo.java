package com.naukri.dataprovider;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {
	
	@Test()
	public void loginWithChrome(Map<String, String>map)
	{
		System.out.println(map.get("browser"));
		Assert.assertFalse(true);
	}

}
