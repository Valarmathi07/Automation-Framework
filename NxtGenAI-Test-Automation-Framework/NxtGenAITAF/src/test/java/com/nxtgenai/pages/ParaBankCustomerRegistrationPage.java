package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.reporter.ExtentReporter;

public class ParaBankCustomerRegistrationPage {
	
	public WebDriver driver;

	public ParaBankCustomerRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Initilize the webelements locators values using FINDBY class	
	@FindBy(id = "customer.firstName") 
	@CacheLookup
	WebElement firstName;
	
	@FindBy(id = "customer.lastName") 
	@CacheLookup
	WebElement lastName;
	
	@FindBy(id = "customer.address.street") 
	@CacheLookup
	WebElement address;
	
	@FindBy(id = "customer.address.city") 
	@CacheLookup
	WebElement city;
	
	@FindBy(id = "customer.address.state") 
	@CacheLookup
	WebElement state;
	
	@FindBy(id = "customer.address.zipCode") 
	@CacheLookup
	WebElement zipCode;
	
	@FindBy(id = "customer.phoneNumber") 
	@CacheLookup
	WebElement phone;
	
	@FindBy(id = "customer.ssn") 
	@CacheLookup
	WebElement ssn;
	
	@FindBy(id = "customer.username") 
	@CacheLookup
	WebElement userName;	
	
	@FindBy(id = "customer.password") 
	@CacheLookup
	WebElement password;
	
	@FindBy(id = "repeatedPassword") 
	@CacheLookup
	WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input") 
	@CacheLookup
	WebElement register;
	
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);

	}

	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void setAddress(String add) {
		address.sendKeys(add);
	}
	
	public void setCity(String cityVal) {
		city.sendKeys(cityVal);
	}

	public void setState(String stateVal) {
		state.sendKeys(stateVal);
	}

	public void setZipCode(String zipcodeVal) {
		zipCode.sendKeys(zipcodeVal);
	}

	public void setPhoneNumber(String pnum) {
		phone.sendKeys(pnum);
	}
	
	public void setSSN(String sn) {
		ssn.sendKeys(sn);
	}
	
	public void setUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pword) {
		password.sendKeys(pword);
	}
		
	public void setConfirmPassword(String pword) {
		confirmPassword.sendKeys(pword);
	}
	
	public void clickRegisterBtn() {
		register.click();
	}
}
