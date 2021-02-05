package com.naukri.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.naukri.FrameworkConstants.naukriFrameworkConstants;

import com.naukri.resources.*;

public final class readproperty {

	private readproperty() {};
      private static FileInputStream file;
	private static  Properties property = new Properties();
	private static Map<String, String> configmap = new HashMap<String, String>();
	
	
	static 
	{
		try {
			file = new FileInputStream(naukriFrameworkConstants.getConfigpath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			property.load(file);
		for (Object key : property.keySet()) {
			configmap.put(String.valueOf(key),String.valueOf(property.get(key)));
		}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getvalue(config key)
	{
		if (Objects.isNull(key)||Objects.isNull(configmap.get(key.name().toString()))) {
			
			System.out.println(key + "KEY OR VALUE IS NULL" + "check in configproperty file");
		}
		
		return configmap.get(key.name().toString());
		
	}
	
	
	
}
