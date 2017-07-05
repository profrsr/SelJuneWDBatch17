package day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.findElementById("loginbutton").click();
		Thread.sleep(2000);
		String txt=driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().accept();
		
		driver.findElementById("usernameId").sendKeys("sarath");
		String txt1=driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().accept();
		
	}

}
