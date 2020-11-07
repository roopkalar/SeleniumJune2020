package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearniFrame {
	
	WebDriver driver;

	@Test
	public void LaunchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Left upper frame selection
		Thread.sleep(2000);
		//places our control on left upper frame to select java.awt
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();
		
		//Left Lower frame selection
		Thread.sleep(2000);
		driver.switchTo().parentFrame();	//so that we can place our driver control to exact frame
		//places our control on left lower frame to select Adjustable
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Adjustable")).click();
		
	}	
}
