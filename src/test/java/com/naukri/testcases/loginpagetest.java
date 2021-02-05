package com.naukri.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.naukri.Driver.Driver;
import com.naukri.Driver.DriverManager;
import com.naukri.dataprovider.DataProviderUtil;
import com.naukri.dataprovider.naukriCredentials;
import com.naukri.pom.MyNaukriPage;
import com.naukri.pom.jobseekerPage;
import com.naukri.pom.loginpage;
import com.naukri.resources.*;



public class loginpagetest extends BasePage{
	
	
	@Test(dataProviderClass = naukriCredentials.class, dataProvider = "getdata")
	public void loginWithFireFox(Map<String, String>map)
	{
		loginpage lp = new loginpage();
		
		  lp.hoverOnForEmployer().employerlogin().switchDriver().clickJonseeker().pause(3000);;
		  
		  jobseekerPage jp = new jobseekerPage();
		  jp.username(map.get("username")).pwd(map.get("password")).login();
		  
		  MyNaukriPage mnp = new MyNaukriPage();
		  mnp.searchbtn().updateProfile();
		  
		  mnp.scrollto().pause(2000);
		  mnp.resumeupload(config.fileupload);
		  
	       System.out.println(DriverManager.getDriver().getTitle());
	}
	
@Test(dataProviderClass = naukriCredentials.class, dataProvider = "getdata")
public void loginWithChrome(Map<String, String>map)
{
	loginpage lp = new loginpage();
	
	  lp.hoverOnForEmployer().employerlogin().switchDriver().clickJonseeker().pause(3000);;
	  
	  jobseekerPage jp = new jobseekerPage();
	  jp.username(map.get("username")).pwd(map.get("password")).login();
	  
	  MyNaukriPage mnp = new MyNaukriPage();
	  mnp.searchbtn().updateProfile();
	  
	  mnp.scrollto().pause(2000);
	  mnp.resumeupload(config.fileupload);
	  
     System.out.println(DriverManager.getDriver().getTitle());
	
	
}
	

}
