package pages;

import org.openqa.selenium.By;

public class CreateLead extends MyMenus{
	
	public CreateLead typeCompanyName(String companyName) {
		type(locateElement("id", "createLeadForm_companyName"), companyName);
		return this;
	}
	
	public CreateLead typeFirstName(String firstName) {
		type(locateElement("id", "createLeadForm_firstName"), firstName);
		return this;
	}
	
	public CreateLead typeLastName(String lastName) {
		type(locateElement("id", "createLeadForm_lastName"), lastName);
		return this;
	}
	
	public ViewLead clickCreateLeadButton() {
		click(locateElement("class", "smallSubmit"));
		return new ViewLead();
	}

}
