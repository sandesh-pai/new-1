package com.naukri.Driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.naukri.FrameworkConstants.naukriFrameworkConstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	
	
	public static void initDriver(String browsertype)
	{
		if (Objects.isNull(DriverManager.getDriver())) {
			if (browsertype.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				DriverManager.setDriver(driver);
				DriverManager.getDriver().get(naukriFrameworkConstants.getBaseurl());
			}
			else if (browsertype.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
				WebDriver driver = new ChromeDriver();
				DriverManager.setDriver(driver);
				DriverManager.getDriver().get(naukriFrameworkConstants.getBaseurl());
				DriverManager.getDriver().manage().window().maximize();
			}
			
			
		}
	}
	
	
	public static void quitDriver()
	{
		if (Objects.nonNull(DriverManager.getDriver())) {
			
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
	
	
	
}
