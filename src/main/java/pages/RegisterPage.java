package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String FirstName) {
driver.findElement(By.id("input-firstname")).sendKeys(FirstName);
	}

	public void enterLastName(String LastName) {
		driver.findElement(By.id("input-lastname")).sendKeys(LastName);
	}

	public void enterEmail(String Email) {
		driver.findElement(By.id("input-email")).sendKeys("ranivara" + randomNumber()
		  + "@gmail.com");
	}

	private String randomNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public void enterPassword(String Password) {
		driver.findElement(By.id("input-password")).sendKeys(Password);
	}

	public void enterConfirmPassword(String ConfirmPassword) {
		 driver.findElement(By.id("input-confirm")).sendKeys(ConfirmPassword);
	}

	public void selectAgreePrivacyPolicy() {
		driver.findElement(By.name("agree")).click();
	}

	public void ClickOnContinueButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	public void selectNewsLetterSubcriptionAsYes() {
		driver.findElement(By.name("newsletter")).click();
	}

	public void enterTelephone(String Telephone) {
		driver.findElement(By.id("input-telephone")).sendKeys();

	}

}
