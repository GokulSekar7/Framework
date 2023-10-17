package com.crm.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.pages.FindLeadPage;
import com.crm.pages.LoginPage;
import com.crm.testng.api.base.ProjectSpecificMethods;



public class TC006_DuplicateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate a Lead - LeafTaps";
		nodes = "Leads";
		dataSheetName="TC006";
		category="Regression";
		authors="Hari";
	}

	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String password ,String emailAddress) throws InterruptedException{

		String fName=
			new LoginPage(driver, node)
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()		
				.clickCRMSFA()		
				.clickLeadLink()		
				.clickFindLead()
				.clickEmailTab()
				.enterEmailAddress(emailAddress)
				.clickFindleadsButton()
				.getFirstResultingFirstName();
			new FindLeadPage(driver, node)
				.clickFirstResultingLead()
				.clickDuplicateLeadLink()
				.clickCreateLeadDublicate()
				.verifyFirstName(fName);

	}

}
