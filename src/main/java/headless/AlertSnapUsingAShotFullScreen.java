package headless;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AlertSnapUsingAShotFullScreen {

	@Test
	public void takeSnap() throws HeadlessException, AWTException, IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Screenshot screen =  new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screen.getImage(), "JPG", new File("./snaps/fullScreen.jpg"));

		driver.close();

		
		
		
		
		
	}
}