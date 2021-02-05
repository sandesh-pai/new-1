package com.naukri.pom;

import org.openqa.selenium.By;

import com.naukri.utils.readproperty;
import com.naukri.waitFactories.waitStrategy;

import com.naukri.resources.config;
import io.github.bonigarcia.wdm.config.Config;

public final class MyNaukriPage extends basePom{


	private static By jobs = By.xpath("//div[.='Jobs']");

	private static By updateProfileBtn = By.xpath("(//div[.='UPDATE PROFILE'])[1]");
	
	private static By searchbtn = By.xpath("//button[.= 'SEARCH']");
	
	
	private static By attchcv = By.xpath("//input[@id='attachCV']");
	
	private static By deleteResume = By.xpath("//a[.='DELETE RESUME']");


	public MyNaukriPage searchbtn()
	{
		click(searchbtn, waitStrategy.PRESENCE);
		return this;

	}
	
	
	public MyNaukriPage updateProfile()
	{
		click(updateProfileBtn, waitStrategy.CLICKABLE);
		return this;
	}

	
	public MyNaukriPage scrollto()
	{
		scrollbar(deleteResume, waitStrategy.PRESENCE);
		return this;
	}
	
	
	public void resumeupload(config value)
	{
		enterInput(attchcv, waitStrategy.PRESENCE, readproperty.getvalue(value));
	}
}
