package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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

		// SIGNIN_BUTTON.click();

		driver.findElement(SIGNIN_BUTTON_LOCATOR).click();

		WebElement CUSTOMER_BUTTON_ELE = driver.findElement(By.xpath("//span[contains(text(),'Customers')]"));
		WebElement ADD_CUSTOMER_BUTTON_ELE = driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
		

		CUSTOMER_BUTTON_ELE.click();
		ADD_CUSTOMER_BUTTON_ELE.click();
		
		WebElement COMPANY_DD_ELE = driver.findElement(By.xpath("//select[@id='cid']"));
		Select sel = new Select(COMPANY_DD_ELE);
		sel.selectByVisibleText("Personal Company");
		//sel.selectByValue("Personal Company");
		

	}

//	@After
//	public void tearDown() {
//		
//		driver.close();
//		driver.quit();
//		
//	}

}
