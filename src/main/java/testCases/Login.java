package testCases;



import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers{
	
	@Test
	public void login() throws Exception{
			
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username1", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Qeagle");
		enterById("lastNameField", "Gopinath");
		clickByName("submitButton");
		
	}

}
