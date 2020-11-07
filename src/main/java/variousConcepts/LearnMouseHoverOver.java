package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class LearnMouseHoverOver {
	WebDriver driver;

	@Test
	public void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='l1']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id='l1_6']/span"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[9]/ul/li[1]/a/img")).click();
		
		
		
		String mele  = driver.findElement(By.xpath("//*[@id=\"page-title\"]/div/div/h1/span")).getText();
		
		Assert.assertEquals("Header do not match" , "Monitors", mele);
		
		
		
		
	}
}
