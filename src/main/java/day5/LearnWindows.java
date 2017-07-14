package day5;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
		OperaDriver driver = new OperaDriver();
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
