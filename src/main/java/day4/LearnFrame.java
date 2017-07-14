package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));

		driver.findElementByXPath("//*[@id='selectable]/li[3]").click();
		driver.switchTo().defaultContent();		
		driver.findElementByLinkText("Download").click();

		File src = driver.getScreenshotAs(OutputType.FILE);		
		File dest = new File("./snap/img.jpg");		
		FileUtils.copyFile(src, dest);		

	}

}
