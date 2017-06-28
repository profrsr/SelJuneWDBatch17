package day3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {			

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://www.leaftaps.com");
		driver.manage().window().maximize();	
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();

		WebElement src = driver.findElementById("createLeadForm_dataSourceId");

		Select dd = new Select(src);
		//dd.selectByVisibleText("Public Relations");
		//	dd.selectByValue("LEAD_WEBSITE");
		dd.selectByIndex(1);

		List<WebElement> allOpt = dd.getOptions();
		//Count
		System.out.println(allOpt.size());
		
		//Last Value
		dd.selectByIndex(allOpt.size()-1);

		//Print all the values listed in Option Tags
		for (WebElement eachOpt : allOpt) {
			System.out.println(eachOpt.getText());
		}
	}
}
