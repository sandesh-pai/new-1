package com.naukri.pom;

import org.openqa.selenium.By;

import com.naukri.waitFactories.waitStrategy;

public final class jobseekerPage extends basePom{

	private static By usernametextBox = By.xpath("//input[@id='usernameField']");
	
	private static By passwordtextBox = By.xpath("//input[@id='passwordField']");
	
	private static By loginBtn = By.xpath("//button[.='Login']");
	
	
	
	public jobseekerPage username(String username)
	{
		enterInput(usernametextBox,waitStrategy.VISIBILITY, username);
		return this;
	}
	
	public jobseekerPage pwd(String pwd)
	{
		enterInput(passwordtextBox,waitStrategy.VISIBILITY, pwd);
		return this;
	}
	
	public MyNaukriPage login()
	{
		click(loginBtn, waitStrategy.CLICKABLE);
		return new MyNaukriPage();
	}
	
	
	
	
	
	
}
