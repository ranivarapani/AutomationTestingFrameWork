package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest1 extends Base{
	WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {
		driver = launchBrowserAndEnterApplicationURL();

		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAccount();
		homepage.selectLoginOption();

		Thread.sleep(3000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	@Test(priority = 1)
	public void loginWithValidUserNameandValidPassword() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("ranisamala@gmail.com");
		loginPage.enterPassword("Jaihanuman");
		loginPage.clickOnLoginButton();

		/*
		 * driver.findElement(By.id("input-email")).sendKeys("ranisamala@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("Jaihanuman");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */

	}

	// 2nd test case
	@Test(priority = 2)
	public void loginWithvalidUserNameandInvalidPassword() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("ranisamala@gmail.com");
		loginPage.enterPassword("Jai82782");
		loginPage.clickOnLoginButton();

	}
	// 3rd testcase

	@Test(priority = 3)
	public void loginWithInvalidUserNameAndValidPassword() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("ranisala@gmail.com");
		loginPage.enterPassword("Jaihanuman");
		loginPage.clickOnLoginButton();

	}

	// 4th test case
	@Test(priority = 4)
	public void loginWithNoUserNameandNoPassword() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLoginButton();

	}
}
