package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {public Base() {
	// TODO Auto-generated constructor stub
}
	
	WebDriver driver;
	//we will launch browser.this browser will used by all the classes.base class will used browser.
	public WebDriver launchBrowserAndEnterApplicationURL() {
		String browserName = "chrome";
		
		if (browserName.equals("chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			 driver=new  FirefoxDriver();
		}
		else if(browserName.equals("Edge")) {
			driver=new EdgeDriver();
			
		}
		else {
			System.out.println("Browser Not Found");
		}
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return (driver);
	}
	
	}


