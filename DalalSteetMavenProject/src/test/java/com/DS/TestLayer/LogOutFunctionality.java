package com.DS.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS.PageLayer.Dashboard_Page;
import com.DS.PageLayer.LoginPage;
import com.DS.TestBase.TestBaseClass;
import com.DS.Utilities.UtilClass;

public class LogOutFunctionality extends TestBaseClass{

	@Test
	public void verifyLogoutFunctionality() throws InterruptedException 
	{
		String expected_result = "https://www.apps.dalalstreet.ai/logout";
		
		//--------------------login----------
		Thread.sleep(5000);
		dash_Obj.ClickOnProfileButton();
		dash_Obj.ClickOnPowerOffButton();
		
		String actual_result = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_result, expected_result);
				
	
	}
}
