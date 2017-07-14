package leafTaps.lead;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;


public class MergeLead extends LeafTapsWrapper {
	
	@Test
	public void mergeLead() throws Exception{		
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		enterByName("firstName", "Gopinath");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(1500);
		String sText = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		System.out.println(sText);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		enterByName("firstName", "Babu");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(1500);
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input", sText);
		clickByXpath("//button[contains(text(),'Find Leads')]");
	
		verifyTextContainsByXpath("//div[@class='x-paging-info']", "No records to display");
			
	}

}
