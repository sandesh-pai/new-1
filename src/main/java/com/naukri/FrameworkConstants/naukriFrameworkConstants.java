package com.naukri.FrameworkConstants;

public class naukriFrameworkConstants {
	
	
	private final static String BASEURL = "https://www.naukri.com/";
	private final static int WAITTIME = 10;
	
	
	private final static String CONFIGPATH = System.getProperty("user.dir")+"/src/main/java/com/naukri/resources/config.properties";
	
	private final static String DATASHEETPATH = System.getProperty("user.dir") +
			"/src/main/java/com/naukri/resources/naukridatasheet.xlsx";
			
	
	
	
	public static String getConfigpath() {
		return CONFIGPATH;
	}
	public static String getBaseurl() {
		return BASEURL;
	}
	public static int getWaittime() {
		return WAITTIME;
	}
	public static String getDatasheetpath() {
		return DATASHEETPATH;
	}
	
	

	

}
