package com.nxtgenai.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nxtgenai.driverscript.TestBase;
import com.nxtgenai.pages.NxtGenHomePage;
import com.nxtgenai.pages.NxtGenWebTablePage;

public class HandingWebTable extends TestBase {
	
	@BeforeClass
	public void navigateToMultipleWindows() {
		NxtGenHomePage homePage = PageFactory.initElements(driver, NxtGenHomePage.class);
		homePage.navigateToWebTable();	
	}
	
	@Test
	public void displayEmployerDetails() {
		NxtGenWebTablePage empTable = PageFactory.initElements(driver, NxtGenWebTablePage.class);
		empTable.displayFirstName();
		empTable.displayLastName();
		empTable.displayGender();
		empTable.displayDateOfBirth();
		empTable.displayBornPlace();
		empTable.displayDesignation();
		empTable.displayEmployerNumber();
		empTable.displaySalary();
		empTable.displayEmailID();		
	}
}
