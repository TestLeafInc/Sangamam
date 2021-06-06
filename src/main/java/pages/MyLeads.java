package pages;

import org.openqa.selenium.By;

public class MyLeads extends MyMenus{
	
	
	public CreateLead clickCreateLeadMenu() {
		click(locateElement("link", "Create Lead"));
		return new CreateLead();
	}


}
