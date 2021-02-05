package com.naukri.pom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naukri.Driver.DriverManager;
import com.naukri.waitFactories.ExplicitWaits;
import com.naukri.waitFactories.waitStrategy;

public  class basePom {
	
	protected basePom() {};
	
	protected static void mouseHover(By by, waitStrategy waitstrategy) {
		
		Actions action = new Actions(DriverManager.getDriver());
		
		action.moveToElement(element(by, waitstrategy)).build().perform();
	}
    
	private static WebElement element(By by, waitStrategy waitstrategy)
	{
		return ExplicitWaits.explicitWait(by, waitstrategy);
	}
	
	
	
	protected static void parentWindow()
	{
		String parentWindow = DriverManager.getDriver().getWindowHandle();
		Set<String> TotalWindows = DriverManager.getDriver().getWindowHandles();
		TotalWindows.remove(parentWindow);
		
		
		  for (String string : TotalWindows) {
			
		  DriverManager.getDriver().switchTo().window(string);
		  
		 new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.titleContains(getTitle()));
		  DriverManager.getDriver().close(); 
		  }
		 
		
		/*
		 * TotalWindows.forEach(child ->{
		 * DriverManager.getDriver().switchTo().window(child);
		 * DriverManager.getDriver().close();});
		 */
		                                        
		
		DriverManager.getDriver().switchTo().window(parentWindow);
		
	}
	
	protected static void click(By by, waitStrategy waitStrategy)
	{
		element(by, waitStrategy).click();
	}
	
	
	public static String getTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
	
	
	protected static void childWindow(int x)
	{
		String parentwindow = DriverManager.getDriver().getWindowHandle();
		Set<String> Totalwindows = DriverManager.getDriver().getWindowHandles();
		List<String> windowList = new ArrayList<String>(Totalwindows);
		DriverManager.getDriver().switchTo().window(windowList.get(x));
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}
	
	protected static void enterInput(By by, waitStrategy waitStrategy, String value)
	{
		element(by, waitStrategy).sendKeys(value);
		
	}
	
	
	public void pause(int seconds)
	{
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	protected void scrollbar(By by, waitStrategy waitStrategy)
	{
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].scrollIntoView(true)", element(by, waitStrategy));
	}
	
	
	
	
}
	
