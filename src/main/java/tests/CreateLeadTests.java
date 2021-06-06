package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.Login;

public class CreateLeadTests extends TestNgHooks {
	
	@BeforeTest
	public void setUpData1() {
		excelSheetName = "Create Lead";
		testcaseName = "Create Lead";
		testDescription = "Create a new Lead in Leaftaps";
		nodeName = "Create Lead Iteration";
		author  = "Babu";
		category = "Smoke";
	}
	
	@Test(dataProvider = "FetchExcelData")
	public void login(String companyName, String firstName, String lastName) {
		
		new Login()
			.typeUserName("DemoSalesManager")
			.typePassword("crmsfa")
			.clickLogin()
			.verifyWelcomeMessage()
			.clickCrmSfa()
			.clickLeadsTab()
			.clickCreateLeadMenu()
			.typeCompanyName(companyName)
			.typeFirstName(firstName)
			.typeLastName(lastName)
			.clickCreateLeadButton()
			.verifyViewLead();
	}

}
