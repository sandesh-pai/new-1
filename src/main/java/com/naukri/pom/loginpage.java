package com.naukri.pom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import com.naukri.Driver.DriverManager;
import com.naukri.waitFactories.waitStrategy;

public class loginpage extends basePom{

	private static By forEmployer = By.xpath("//div[.='For Employers']");
	
	private static By employerLogin = By.xpath("//a[.='Employer Login']");
	
	
	
	
	public  loginpage hoverOnForEmployer()
	{
		parentWindow();
		mouseHover(forEmployer, waitStrategy.None);
		return this;
		
	}
	
	
	
	public loginpage employerlogin()
	{
		click(forEmployer, waitStrategy.CLICKABLE);
		return this;
	}
	
	public  EmployerLogin  switchDriver()
	{
	      childWindow(1);
	      return new EmployerLogin();
	}
	
}
