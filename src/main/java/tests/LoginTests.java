package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.Login;

public class LoginTests extends TestNgHooks {
	
	@BeforeTest
	public void setUpData() {
		excelSheetName = "Login";
		testcaseName = "Login";
		testDescription = "Login to leaftaps and logout";
		nodeName = "Login Iteration";
		author  = "Babu";
		category = "Sanity";
	}
	
	@Test(dataProvider = "FetchExcelData")
	public void login(String username, String password) {
		
		new Login()
			.typeUserName(username)
			.typePassword(password)
			.clickLogin()
			.verifyWelcomeMessage()
			.clickLogout();
	}

}
