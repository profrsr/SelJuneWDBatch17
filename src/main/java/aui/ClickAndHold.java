package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1)
		.clickAndHold(item4)
		.release()
		.build()
		.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
