package com.nxtgenai.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.nxtgeni.objectrepository.ObjectRepository;

public class NxtGenWebTablePage {

	public WebDriver driver;

	public NxtGenWebTablePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath=ObjectRepository.firstNameXpath) 
	@CacheLookup
	WebElement firstName;
	
	@FindBy(xpath=ObjectRepository.lastNameXpath) 
	@CacheLookup
	WebElement lastName;

	@FindBy(xpath=ObjectRepository.genderXpath) 
	@CacheLookup
	WebElement gender;

	@FindBy(xpath=ObjectRepository.dateOfBirthXpath) 
	@CacheLookup
	WebElement dateOfBirth;
	
	@FindBy(xpath=ObjectRepository.bornPlaceXpath)  
	@CacheLookup
	WebElement bornPlace;
	
	@FindBy(xpath=ObjectRepository.designationXpath) 
	@CacheLookup
	WebElement designation;

	@FindBy(xpath=ObjectRepository.empNumberXpath) 
	@CacheLookup
	WebElement empNumber;
	
	@FindBy(xpath=ObjectRepository.salaryXpath) 
	@CacheLookup
	WebElement salary;

	@FindBy(xpath=ObjectRepository.emailIDXpath) 
	@CacheLookup
	WebElement emailID;
	
	public void displayFirstName() {
		System.out.println("The Employer First Name is "+ firstName.getText());
	}
	
	public void displayLastName() {
		System.out.println("The Employer Last Name is "+ lastName.getText());
	}
	
	public void displayGender() {
		System.out.println("The Employer Gender is "+ gender.getText());
	}
	
	public void displayDateOfBirth() {
		System.out.println("The Employer Date of Birth is "+ dateOfBirth.getText());
	}
	
	public void displayBornPlace() {
		System.out.println("The Employer Born Place is "+ bornPlace.getText());
	}
	
	public void displayDesignation() {
		System.out.println("The Employer Designation is "+ designation.getText());
	}
	
	public void displayEmployerNumber() {
		System.out.println("The Employer Number is "+ empNumber.getText());
	}
	
	public void displaySalary() {
		System.out.println("The Employer Salary is "+ salary.getText());
	}
	
	public void displayEmailID() {
		System.out.println("The Employer Email ID is "+ emailID.getText());
	}
	
}
