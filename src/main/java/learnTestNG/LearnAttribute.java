package learnTestNG;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class LearnAttribute extends LeafTapsWrapper{	
	
	//(invocationCount=2, threadPoolSize=2)
	//(invocationCount=2, invocationTimeOut=20000)
	//(invocationCount=2, timeOut=15000)
	//(expectedExceptions = NoSuchElementException.class)	
	//(dependsOnMethods = "leafTaps.lead.CreateLead")
	//(dependsOnMethods = "leafTaps.lead.CreateLead",alwaysRun = true)
	//(enabled = false)
	//(successPercentage = 70)
	
	@Test(invocationCount=2, threadPoolSize=2)
	public void createLead() throws Exception{
		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","Qeagle");
		enterById("createLeadForm_firstName", "Gopinath");
		enterById("createLeadForm_lastName", "Jayakumar");		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByXpath("//input[@name='submitButton']");
		
	}
















}
