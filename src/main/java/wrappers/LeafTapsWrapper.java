package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LeafTapsWrapper extends GenericWrappers{
	
	@BeforeMethod
	public void logIn() throws Exception {
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	
	@AfterMethod
	public void closeApplication(){
		closeBrowser();
	}

}
