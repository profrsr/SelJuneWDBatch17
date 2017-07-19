package learnReporter;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnExtentReport {

	@Test
	public void learnReport(){

		//@BeforeSuite	
		ExtentReports extent = new ExtentReports("./report123/result.html", false);

		//@BeforeMethod	
		ExtentTest test = extent.startTest("TC001_CreateLead", "Create a New Lead in leafTaps");
		test.assignAuthor("Sarath");		
		test.assignCategory("smoke");

		//GenericWrapper
		test.log(LogStatus.PASS, "EnterByID", "Comp Name Entered"
				+test.addScreenCapture("./../snaps/img1.jpg"));

		test.log(LogStatus.PASS, "EnterByID", "FirstName Could  not enter"
				+test.addScreenCapture("./../snaps/img2.jpg"));

		test.log(LogStatus.PASS, "EnterByID", "FirstName Could  not enter"
				+test.addScreenCapture("./../snaps/img3.jpg"));

		test.log(LogStatus.PASS, "ClickByXpath", "FirstName Button CouldN't Clicked");
		
		//AfterMethod
		extent.endTest(test);
		
		//AfterSuite
		extent.flush();
	}
}
