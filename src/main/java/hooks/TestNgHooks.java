package hooks;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ReadExcelForDataProvider;
import wrappers.BaseDriver;

public class TestNgHooks extends BaseDriver{
	
	public String excelSheetName;
	
	@BeforeSuite
	public void init() {
		createTestReport();
	}
	
	@BeforeTest
	public void setUpTests() {
		// Later, lets do it !!
	}
	
	@BeforeClass
	public void beforeClass() {
		createTestcaseEntry(testcaseName, testDescription, author, category);
	}
	
	
	@BeforeMethod
	public void invoke() {
		startIteration(nodeName);
		startApp("chrome","http://leaftaps.com/opentaps");
	}
	
	@AfterMethod
	public void close() {
		// close browser
		closeActiveBrowser();
	}
	
	@AfterClass
	public void afterClass() {
		// Later, lets do it !!
	}
	
	
	@AfterTest
	public void completeTests() {
		// Later, lets do it !!
	}
	
	
	@AfterSuite
	public void tearDown() {
		publishReport();
	}
	
	@Before
	public void initBefore() {
		invoke();
	}
	
	@After
	public void afterClose() {
		close();
	}
	
	@DataProvider(name="FetchExcelData", indices = {0})
	public Object[][] readExcelData(){
		try {
			return ReadExcelForDataProvider.readExcelData(excelSheetName);
		} catch (InvalidFormatException e) {
			System.err.println("The excel is in invalid format. Looks corrupted");
		} catch (IOException e) {
			System.err.println("The file does not exist");
		}
		return null;
	}
	

}


















