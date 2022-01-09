package com.parabank.testcases;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.ParaBankCustomerRegistrationPage;
import com.nxtgenai.pages.ParaBankHomePage;
import com.nxtgenai.pages.ParaBankUserWelcomePage;


public class ParaBankCustomerRegistration extends TestBase{	
	
	@Test(priority=1)
	public void registerParaBankUser() {

		ParaBankHomePage homePage = PageFactory.initElements(driver, ParaBankHomePage.class);
		homePage.clickRegisterLink();

		ParaBankCustomerRegistrationPage register = PageFactory.initElements(driver, ParaBankCustomerRegistrationPage.class);
		register.setFirstName("Vinoth");
		register.setLastName("R");
		register.setAddress("XYZ");
		register.setCity("Chennai");
		register.setState("Tamil Nadu");
		register.setZipCode("600100");
		register.setPhoneNumber("6383544892");
		register.setSSN("963258741");
		register.setUserName(config.getProperty("username"));
		register.setPassword(config.getProperty("password"));
		register.setConfirmPassword(config.getProperty("password"));		
		register.clickRegisterBtn();

		ParaBankUserWelcomePage customer = PageFactory.initElements(driver, ParaBankUserWelcomePage.class);
		customer.validateSuccessfulMessage("Your account was created successfully");
		customer.clickLogOutLink();
		
	}

}





