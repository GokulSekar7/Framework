package com.crm.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.pages.LoginPage;
import com.crm.testng.api.base.ProjectSpecificMethods;

public class TC009_EditContact extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC009_EditContact";
		testDescription="Edit existing Contact on LeafTaps";
		nodes = "Contacts";		
		dataSheetName="TC009";
		category="Smoke";
		authors="Hari";
	}
	
	@Test(dataProvider="fetchData", dependsOnMethods = "com.crm.testcases.TC008_CreateContact.createContact")
	public void editContact(String userName, String password, String firstName, String description) {
		new LoginPage(driver, node)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickContactsLink()
		.clickFindContacts()
		.enterFirstName(firstName)
		.clickFindContactsButton()
		.clickFirstResultingContact()
		.clickEditContactLink()
		.enterDescription(description)
		.clickUpdateContactSubmit()
		.verifyDescription(description);
		
		
	}
}
