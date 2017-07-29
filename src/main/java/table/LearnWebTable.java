package table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SCT",Keys.TAB);
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		
		//Row Count
		System.out.println(rows.size());
		
		//entered into first row
		WebElement firstRow = rows.get(0);
		
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));
	
		System.out.println(columns.size());
		
		System.out.println(columns.get(0).getText());
		System.out.println(columns.get(1).getText());
	}

}













