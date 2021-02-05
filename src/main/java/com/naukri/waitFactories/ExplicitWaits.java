package com.naukri.waitFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naukri.Driver.DriverManager;
import com.naukri.FrameworkConstants.naukriFrameworkConstants;

public class ExplicitWaits {
	
	
	public static WebElement explicitWait(By by, waitStrategy waitstrategy)
	{

		if (waitstrategy==waitStrategy.CLICKABLE) {
			return new WebDriverWait(DriverManager.getDriver(), naukriFrameworkConstants.getWaittime())
			.until(ExpectedConditions.elementToBeClickable(DriverManager.getDriver().findElement(by)));
		}
		
		else if (waitstrategy==waitStrategy.VISIBILITY) {
			
			return new WebDriverWait(DriverManager.getDriver(), naukriFrameworkConstants.getWaittime())
					.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(by)));
		}
		
		else if (waitstrategy==waitStrategy.PRESENCE) {
		return new WebDriverWait(DriverManager.getDriver(), naukriFrameworkConstants.getWaittime())
					.until(ExpectedConditions.presenceOfElementLocated((by)));
		}
		
		else if (waitstrategy==waitStrategy.None) {
			return DriverManager.getDriver().findElement(by);
		}
		
		return null;

	}
	

}
