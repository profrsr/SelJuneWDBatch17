package leafTaps.lead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{	

	@Test(dataProvider = "fetchData",invocationCount=2)
	public void createLead(String cname,String fname,String lname) throws Exception{		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",cname);
		enterById("createLeadForm_firstName", fname);
		enterById("createLeadForm_lastName", lname);		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByXpath("//input[@name='submitButton']");		
	}

	@DataProvider(name = "fetchData")
	public String[][] getData() {
		String[][] data = new String[2][3];
		data[0][0] = "testleaf";
		data[0][1] = "sarath";
		data[0][2] = "kumar";
		data[1][0] = "testleaf";
		data[1][1] = "gopi";
		data[1][2] = "jaikumar";
		return data;
	}













}
