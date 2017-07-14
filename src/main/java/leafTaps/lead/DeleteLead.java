package leafTaps.lead;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;
import wrappers.LeafTapsWrapper;


public class DeleteLead extends LeafTapsWrapper {

	@Test(dependsOnMethods = "leafTaps.lead.CreateLead")
	public void deleteLead() throws Exception {		
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(text(),'Phone')]");
		enterByName("phoneNumber", "9597704568");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		String sText = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		clickByLink("Delete");
		clickByLink("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", sText);
		clickByXpath("//button[contains(text(),'Find Leads')]");		
		verifyTextContainsByXpath("//div[@class='x-paging-info']", "No records to display");
	}

}
