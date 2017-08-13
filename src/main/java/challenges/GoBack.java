package challenges;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoBack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// load the browser with url
		driver.get("http://leaftaps.com/opentaps");
		
		// How to get url
		String oldUrl = driver.getCurrentUrl();
		
		// load another url
		driver.get("http://legacy.crystalcruises.com/");
		
		// go back
		System.out.println(driver.getCapabilities().getBrowserName());
		System.out.println(driver.getCapabilities().getPlatform());

		System.out.println(driver.getCapabilities().getVersion());
		if(driver.getCapabilities().getVersion().equals("41.0") || driver.getCapabilities().getVersion().equals("42.0")){
			driver.get(oldUrl);
		}
		
		try {
			driver.navigate().back();
		} catch (Exception e) {
			driver.get(oldUrl);
		}
		
		
		
		
		
		
		


	}

}
