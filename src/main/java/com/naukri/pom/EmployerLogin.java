package com.naukri.pom;

import org.openqa.selenium.By;

import com.naukri.waitFactories.waitStrategy;

public final class EmployerLogin extends basePom{
	
	
	private static By jobseeker = By.xpath("//a[contains(.,'JobSeeker')]");
	
	
	public  jobseekerPage clickJonseeker()
	{
		click(jobseeker, waitStrategy.PRESENCE);
		return new jobseekerPage();
	}

}
