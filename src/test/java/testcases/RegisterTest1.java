package testcases;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest1 extends Base {
	WebDriver driver;

	public String randomNumber() {
		Random random = new Random();
		String randomNumber = String.format("%04d", random.nextInt(10000));
		System.out.println("randomNumber");
		return randomNumber;

	}

	@BeforeMethod
	public void setup() {
		driver = launchBrowserAndEnterApplicationURL();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		homePage.clickOnRegisterButton();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(priority = 1)

	public void registerWithAllMandatoryFielfds() throws Exception {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.enterFirstName("rani");
		registerPage.enterLastName("samala");
		registerPage.enterEmail("ranisamala" + randomNumber() + "gmail.com");
		registerPage.enterTelephone("9964551805");
		registerPage.enterPassword("Jaihanuman");
		registerPage.enterConfirmPassword("Jaihanuman");
		registerPage.selectAgreePrivacyPolicy();
		registerPage.ClickOnContinueButton();

		/*
		 * driver.findElement(By.id("input-firstname")).sendKeys("rani");
		 * driver.findElement(By.id("input-lastname")).sendKeys("vara");
		 * driver.findElement(By.id("input-email")).sendKeys("ranivara" + randomNumber()
		 * + "@gmail.com");
		 * driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		 * driver.findElement(By.id("input-password")).sendKeys("Omsairam");
		 * driver.findElement(By.id("input-confirm")).sendKeys("Omsairam");
		 * 
		 * driver.findElement(By.name("agree")).click(); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */

	}

//second test case enter valid fields and also newsletter click on yes
	@Test(priority = 2)
	public void registerWithAllMandatoryFieldsAndNewsLetterSubscriptionYes() throws Exception {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.enterFirstName("rani");
		registerPage.enterLastName("samala");
		registerPage.enterEmail("ranisamala" + randomNumber() + "gmail.com");
		registerPage.enterTelephone("9964551804");
		registerPage.enterPassword("Jaihanuman");
		registerPage.enterConfirmPassword("Jaihanuman");
		registerPage.selectNewsLetterSubcriptionAsYes();
		registerPage.selectAgreePrivacyPolicy();
		registerPage.ClickOnContinueButton();

		/*
		 * driver.findElement(By.id("input-firstname")).sendKeys("rani");
		 * driver.findElement(By.id("input-lastname")).sendKeys("vara");
		 * driver.findElement(By.id("input-email")).sendKeys("ranivara" + randomNumber()
		 * + "@gmail.com");
		 * driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		 * driver.findElement(By.id("input-password")).sendKeys("Omsairam");
		 * driver.findElement(By.id("input-confirm")).sendKeys("Omsairam");
		 * driver.findElement(By.name("newsletter")).click();
		 * driver.findElement(By.name("agree")).click(); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */

	}

	// third testcase
	@Test(priority = 3)
	public void registerAccountAllFieldsButNotSelectingPrivacyPolicy() throws Exception {
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.enterFirstName("rani");
		registerPage.enterLastName("samala");
		registerPage.enterEmail("ranisamala" + randomNumber() + "gmail.com");
		registerPage.enterTelephone("9964551805");
		registerPage.enterPassword("Jaihanuman");
		registerPage.enterConfirmPassword("Jaihanuman");
		registerPage.selectNewsLetterSubcriptionAsYes();
		registerPage.ClickOnContinueButton();

		/*
		 * driver.findElement(By.id("input-firstname")).sendKeys("rani");
		 * driver.findElement(By.id("input-lastname")).sendKeys("vara");
		 * driver.findElement(By.id("input-email")).sendKeys("ranivara" + randomNumber()
		 * + "@gmail.com");
		 * driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		 * driver.findElement(By.id("input-password")).sendKeys("Omsairam");
		 * driver.findElement(By.id("input-confirm")).sendKeys("Omsairam");
		 * driver.findElement(By.name("newsletter")).click(); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */

	}

	// fouth test case
	@Test(priority = 4)
	public void registerAccountWithoutEnteringAnyFields(RegisterPage registerPage) throws Exception {

		registerPage.ClickOnContinueButton();

		/*
		 * driver.findElement(By.linkText("Register")).click();
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * Thread.sleep(3000);
		 */

	}

}
