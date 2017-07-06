package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrapper implements Wrappers{
	RemoteWebDriver driver;
	int i=1;
	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		System.out.println("The browser "+browser+" is launched");
		takeSnap();
	}

	public void enterById(String idValue, String data) {
		driver.findElementById(idValue).sendKeys(data);
		System.out.println("The text field "+idValue+" is entered with value :"+data);
		takeSnap();
	}

	public void enterByName(String nameValue, String data) {


	}

	public void enterByXpath(String xpathValue, String data) {


	}

	public void verifyTitle(String title) {


	}

	public void verifyTextById(String id, String text) {


	}

	public void verifyTextByXpath(String xpath, String text) {


	}

	public void verifyTextContainsByXpath(String xpath, String text) {


	}

	public void clickById(String id) {


	}

	public void clickByClassName(String classVal) {

	driver.findElementByClassName(classVal).click();
	System.out.println("The button "+classVal+" is clicked");
	takeSnap();
	}

	public void clickByName(String name) {


	}

	public void clickByLink(String name) {


	}

	public void clickByLinkNoSnap(String name) {


	}

	public void clickByXpath(String xpathVal) {


	}

	public void clickByXpathNoSnap(String xpathVal) {


	}

	public String getTextById(String idVal) {

		return null;
	}

	public String getTextByXpath(String xpathVal) {

		return null;
	}

	public void selectVisibileTextById(String id, String value) {


	}

	public void selectIndexById(String id, int value) {


	}

	public void switchToParentWindow() {


	}

	public void switchToLastWindow() {


	}

	public void acceptAlert() {


	}

	public void dismissAlert() {


	}

	public String getAlertText() {

		return null;
	}

	public void takeSnap() {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./snaps/snap"+i+".jpg");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {

		driver.close();
		System.out.println("The browser is closed");
		//takeSnap();
	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("The browser is closed");

	}

}
