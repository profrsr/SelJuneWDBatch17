package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LeafTapsWrapper extends GenericWrappers{
	@Parameters({"browser","url","uName","pwd"})
	@BeforeMethod()
	public void logIn(String browser,String url1,String uname,String pwd) throws Exception {
		invokeApp(browser,url1);
		enterById("username", uname);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	
	@AfterMethod(groups={"common"})
	public void closeApplication(){
		closeBrowser();
	}

}
