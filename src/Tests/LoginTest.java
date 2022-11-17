package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.Base;
import Pages.LoginPage;

public class LoginTest extends Base{
	
	
	 @BeforeClass
	    public static void initiateDrivers() {
	        // Passing the driver as an argument to IndexPage constructor
	        try {
	        	LoginPage loginpage = new LoginPage();
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	 
	    @Test
	    public void niyoLoginProcess() {
	    	LoginPage.clickOnAccountcreate();
	    	LoginPage.enterUserName();
	    	
	    	LoginPage.enterPassword();
	    	LoginPage.submitbutton();
	
	    }
}
