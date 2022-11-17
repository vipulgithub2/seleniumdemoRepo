package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	public WebDriver driver;
	
	public WebDriverWait wait;
	
	
	public void loginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@title='My Account']")

	public static WebElement AccountCreate;
	
	@FindBy(xpath="//*[@name='email']")
	public static WebElement UserName;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@type='submit']")

	public static WebElement btnLogin;
	
	
    public static void clickOnAccountcreate() {
		AccountCreate.click();
	}
	
	public static void enterUserName() {
	
		UserName.sendKeys("amotooricap1@gmail.com");
	}
	
	public static void enterPassword() {
		

		Password.sendKeys("12345");
	}
  
	public static void submitbutton() {
		
		
	}
}
