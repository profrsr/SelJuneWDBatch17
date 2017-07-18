package leafTaps.lead;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import freemarker.core.ReturnInstruction.Return;
import readExcel.Dp;
import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{	

	@Test(dataProvider = "fetchData")
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
	public String[][] getData() throws InvalidFormatException, IOException {
		Dp read = new Dp();
		return read.readExcel();




	}















}
