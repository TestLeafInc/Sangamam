package wrappers;

import org.openqa.selenium.WebElement;

public interface Browser {
	
	/**
	 * This method will launch and load the browser with maximized and timeout set
	 * @param browser  - The name of the browser (chrome, firefox, safari, ie, edge)
	 * @param url - The url of the application (prefix with http or https)
	 * @author Babu - TestLeaf
	 * @return boolean - True if all loaded else false
	 * @throws WebDriverException
	 */
	public boolean startApp(String browser, String url) ;	
	
	/**
	 * This method will locate the element using any given locator
	 * @param locator  - The locator by which the element to be found
	 * @param locValue - The locator value by which the element to be found
	 * @author Babu - TestLeaf
	 * @return WebElement - the first matching element
	 * @throws NoSuchElementException
	 */
	public WebElement locateElement(String locator, String locValue) ;	


	/**
	 * This method will verify browser actual title with expected
	 * @param title - The expected title of the browser
	 * @author Babu - TestLeaf
	 */
	public boolean verifyExactTitle(String expectedTitle);
	
	/**
	 * This method will verify browser actual title with expected text using contains
	 * @param title - The expected title of the browser
	 * @author Babu - TestLeaf
	 */
	public boolean verifyPartialTitle(String expectedTitle);


	/**
	 * This method will close the active browser
	 * @author Babu - TestLeaf
	 */
	public void closeActiveBrowser();		

	/**
	 * This method will close all the browsers
	 * @author Babu - TestLeaf
	 */
	public void closeAllBrowsers();
	
	

}
