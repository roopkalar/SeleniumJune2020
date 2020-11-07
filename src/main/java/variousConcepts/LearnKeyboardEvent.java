package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LearnKeyboardEvent {
	WebDriver driver;

	@Before
	public void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() {

		// element library
		WebElement USERNAME_ELE = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_ELE = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_BUTTON = driver.findElement(By.xpath("//button[@name='login']"));

		// Storing web elements By class
		By SIGNIN_BUTTON_LOCATOR = By.xpath("//button[@name='login']");
		By DASHBOARD_LABEL_LOCATOR = By.xpath("//h2[contains(text(),' Dashboard ')])");

		USERNAME_ELE.clear();
		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		USERNAME_ELE.sendKeys("demo@techfios.com");

		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		PASSWORD_ELE.sendKeys("abc123");

		// Using enter Key
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		

	

	}


}
