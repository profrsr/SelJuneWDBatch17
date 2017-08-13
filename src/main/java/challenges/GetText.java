package challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// load the browser with url
		driver.get("https://www.naukri.com/");
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Naukri on Mobile']/following::a[2]")).getText());
		
		//driver.findElement(By.xpath("//a[text()='Naukri on Mobile']/following::a[2]")).click();
		
		
		// Syntax for casting
		// ((transformingclass)object).methodname()
		((JavascriptExecutor)driver).executeScript("scroll(0,4500)");
		
		
		
		
		
		
		

	}

}
