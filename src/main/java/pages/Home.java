package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;
import io.cucumber.java.en.Given;


public class Home extends TestNgHooks{
	
	@Given("Verify the welcome message")
	public Home verifyWelcomeMessage() {
		verifyPartialText(locateElement("tag", "h2"), "Welcome");
		return this;
	}
	
	@Given("Click Logout")
	public Login clickLogout() {
		click(locateElement("class", "decorativeSubmit"));
		return new Login();
	}
	
	@Given("Click CRMSFA")
	public MyMenus clickCrmSfa() {
		click(locateElement("link", "CRM/SFA"));
		return new MyMenus();
	}
	

}
