package BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utilities.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	 public static WebDriver driver;
	 
	 @BeforeMethod
	public static void createDriverinstance() throws IOException {
		
		if(Utility.fetchPropertiesValue("browserName").toString().equalsIgnoreCase("chrome")) {
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		if(Utility.fetchPropertiesValue("browserName").toString().equalsIgnoreCase("firfox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
				
		}
		
		driver.get("http:tutorialsninja.com/demo/");
		
		
	}
	@AfterMethod
	
	public void tearDown() {
		
		driver.close();
	}

}
