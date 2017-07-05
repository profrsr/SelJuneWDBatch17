package day7;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAllElements {
	
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=V2xcWfymLozz8AfZ2qiYBQ");
		driver.manage().window().maximize();
	
		driver.findElementById("lst-ib").sendKeys("TestLeaf", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> allLink = driver.findElementsByTagName("a");
		
		System.out.println(allLink.size());
		
		int count = 0;
		for (WebElement eachLink : allLink) {
			String x = eachLink.getText();
			Thread.sleep(200);
			if(x.contains("TestLeaf")){
				count = count+1;
				System.out.println(x);
			}
		}
		
		System.out.println(count);
		
		
	
		
		/*List<WebElement> allQu = driver.findElementsByLinkText("Get-a-Quote");
		System.out.println(allQu.size());
			
		allQu.get(4).click();*/
		
	}
	

}
