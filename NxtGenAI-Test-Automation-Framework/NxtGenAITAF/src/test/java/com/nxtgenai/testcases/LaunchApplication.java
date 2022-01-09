package com.nxtgenai.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchApplication {
	
	public static WebDriver driver;
	
	public static String browser = "chrome";
	public String url = "https://nxtgenaiacademy.com";

	@BeforeClass
	public WebDriver launchBrowser(String browser, String url) 	{
		
		if(browser.equalsIgnoreCase("firefox"))			
		{
				System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}			
			else if(browser.equalsIgnoreCase("chrome"))	
			{
				System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
				driver = new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver",".\\Drivers\\msedgedriver.exe");	
				driver = new EdgeDriver();
			}
			
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			return driver;				
	 }
	
	@Test
	public void test() {
		
	}
	
	
}
