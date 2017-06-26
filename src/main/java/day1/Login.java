package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leaftaps.com");
	/*	driver.navigate().to("http://www.leaftaps.com");
		driver.navigate().forward();*/
		driver.manage().window().maximize();		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("decorativeSubmit").click();
		driver.close();
	//	driver.quit();
	}

}
