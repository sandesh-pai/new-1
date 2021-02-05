package com.naukri.dataprovider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class naukriCredentials {
	
	@DataProvider(parallel = true)
	public Object[] getdata(Method m)
	{
		
		String TestCaseName = m.getName();
		List<Map<String, String>> list = DataProviderUtil.getdata();
		List<Map<String, String>> iterationList = new ArrayList();
	
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).get("testcasename").equalsIgnoreCase(TestCaseName)) {
				iterationList.add(list.get(i));
				
				
			}
			
		}
		
		return iterationList.toArray();
		
	}

}
