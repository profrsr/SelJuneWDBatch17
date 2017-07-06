package testCases;

import javax.crypto.spec.IvParameterSpec;

import org.junit.Test;

import wrappers.GenericWrapper;

public class Login extends GenericWrapper{
	
	@Test
	public void login(){
		/*invokeApp("chrome", "https://developer.salesforce.com/signup?d=70130000000td6N");
		enterById("first_name", "Sarath");
		enterById("last_name", "Kumar");		
		enterById("email", "sarath@testleaf.com");
		clickById("submit_btn");*/
		
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Qeagle");
		enterById("lastNameField", "Gopinath");
		String x = getTextById("generalToNameField");
		System.out.println(x);
		
		
		//clickByClassName("decorativeSubmit");
		
	}

}
