package wrappers;

import org.openqa.selenium.WebElement;

public interface TargetLocator {
	
	/**
	 * This method will switch to the Window of interest
	 * @param index The window index to be switched to. 0 -> first window 
	 * @author Babu - TestLeaf
	 */
	public void switchToWindow(int index);

	/**
	 * This method will switch to the specific frame
	 * @param ele   - The Webelement (frame) to be switched
	 * @author Babu - TestLeaf
	 */
	public void switchToFrame(WebElement ele);

	/**
	 * This method will accept the alert opened
	 * @author Babu - TestLeaf
	 */
	public void acceptAlert();

	/**
	 * This method will dismiss the alert opened
	 * @author Babu - TestLeaf
	 */
	public void dismissAlert();

	/**
	 * This method will return the text of the alert
	 * @author Babu - TestLeaf
	 */
	public String getAlertText();

}
