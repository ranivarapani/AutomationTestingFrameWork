package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver diver) {
		this.driver = driver;
	}

	public void enterUserName(String email) {
		driver.findElement(By.id("input-email")).sendKeys(email);

	}

	public void enterPassword(String Password) {
		driver.findElement(By.name("password")).sendKeys(Password);
	}

	public void clickOnLoginButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	
}
