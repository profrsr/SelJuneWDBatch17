package day5;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");

		System.out.println(driver.getTitle());
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getTitle());

		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin.size());

		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);			
		}
		driver.quit();
	}
}
