package leafTaps.contact;

import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;


public class CreateContact extends LeafTapsWrapper {

	@Test
	public void createContact() throws Exception{
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");		
	}

}
