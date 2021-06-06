package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;


public class MyMenus extends TestNgHooks{
	
	
	public MyLeads clickLeadsTab() {
		click(locateElement("link", "Leads"));
		return new MyLeads();
	}

	public MyLeads clickAccountsTab() {
		click(locateElement("link", "Accounts"));
		return new MyLeads();
	}
}
