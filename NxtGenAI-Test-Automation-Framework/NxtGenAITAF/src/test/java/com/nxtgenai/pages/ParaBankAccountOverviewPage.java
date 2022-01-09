package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ParaBankAccountOverviewPage {

	public WebDriver driver;

	public ParaBankAccountOverviewPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "") 
	@CacheLookup
	WebElement elementName;
	
}
