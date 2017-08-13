package challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ScrollSidewards {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// load the browser with url
		driver.get("https://dev28027.service-now.com");
		
		// Login
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Itorizon01");
		driver.findElement(By.id("sysverb_login")).click();
		
		// switch out
		driver.switchTo().defaultContent();
		
		// Search and click open incidents
		driver.findElement(By.id("filter")).sendKeys("incident", Keys.ENTER);
		driver.findElement(By.linkText("Open")).click();
		
		// Move to frame
		driver.switchTo().frame("gsft_main");
		((JavascriptExecutor)driver).executeScript("scroll(250,0)");
		

		
		

		
		
		
		
	}

}
