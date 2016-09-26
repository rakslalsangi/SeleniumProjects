package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTests {

	WebDriver driver = null;

	@Test(priority = 1)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\# Automation testing data backup\\AutomationTestingDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 2)
	public void OpenSite() {

		driver.get("http://www.register.com/");

	}

	@Test(priority = 3)
	public void VerifyTitle() {

		Assert.assertEquals("1", "2");

	}

	@Test(priority = 4)
	public void Close() {

		driver.close();

	}

}