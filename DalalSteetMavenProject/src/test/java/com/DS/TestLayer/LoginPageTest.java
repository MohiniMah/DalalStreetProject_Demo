package com.DS.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.DS.PageLayer.LoginPage;
import com.DS.PageLayer.SignUp_Page;
import com.DS.TestBase.TestBaseClass;
import com.DS.Utilities.UtilClass;

public class LoginPageTest extends TestBaseClass{
	
	public void verifySignupWithCorrectCred() throws InterruptedException
	{
		//String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
		//--------------------obj Creation---------------
		
		LoginPage login_obj1 = new LoginPage(driver);
		UtilClass util_obj = new UtilClass();
		SignUp_Page signup_obj = new SignUp_Page(driver);
		
		//-------------------signup-------------
		
				login_obj1.ClickOnSignUp_btn();
				signup_obj.EnterFirstName("raj");
				signup_obj.EnterLastName("rajeshwar");
				signup_obj.EnterEmail("raj.raj@gmail.com");
				signup_obj.EnterPassword("Test1234567");
				signup_obj.tikOnCheck_box();
				signup_obj.clickOnStartJourny();
				Thread.sleep(5000);
				
//				String actual_output = util_obj.getWebPageUrl();
//				 
//				Assert.assertEquals(actual_output, expected_output);
				
	}
	@Test
	public void verifyLoginWithCorrectCred() throws InterruptedException {
		
		
		String expected_output= "https://www.apps.dalalstreet.ai/dashboard";
		//--------------------login----------
		
		System.out.println("Mohini");
	
		Thread.sleep(2000);
		String actual_output = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_output, expected_output);
				
	
	}

}

