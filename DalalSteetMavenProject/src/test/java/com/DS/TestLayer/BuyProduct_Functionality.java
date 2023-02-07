package com.DS.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS.PageLayer.Dashboard_Page;
import com.DS.PageLayer.Exchange_PageOfBuy;
import com.DS.PageLayer.LoginPage;
import com.DS.TestBase.TestBaseClass;




public class BuyProduct_Functionality extends TestBaseClass {
	
	@Test
	public void VerifyBuyFunctionalityLongTermWithMarket() throws InterruptedException
	
	{
		String expected_result = "Order Created successfully";
		
		dash_Obj.EnterCompanyName("wipro");
		Thread.sleep(2000);
		dash_Obj.ClickOnOption();
		logger.info("navigate to Exchange page");
		Thread.sleep(3000);
		//----------------exchange ----------------
		
		exch_obj.ClickOnBuyButton1();
		exch_obj.EnterQuantity("2");
		exch_obj.ClickOnBuyButton2();
		Thread.sleep(3000);
		logger.info("Order Created successfully");
		String actaul_result = exch_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
	}
	@Test
	public void VerifyBuyFunctionalityLongtermWithCustomeLimit() throws InterruptedException
	
	{
		String expected_result = "Limit Order Created Successfully";
		
		//-----------------------dashboard--------
		
		dash_Obj.EnterCompanyName("wipro");
		Thread.sleep(2000);
		dash_Obj.ClickOnOption();
		Thread.sleep(3000);
		logger.info("navigate to Exchange page");
		//--------------------------exchange----------
		
		exch_obj.ClickOnCustomLimitButton();
		exch_obj.EnterQuantity("1");
		exch_obj.EnterPrice("350");
		exch_obj.ClickOnBuyButton2();
		
		Thread.sleep(2000);
		String actaul_result = exch_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
	}
	
		@Test
		public void VerifyBuyFunctionalityIntradayWithMarket() throws InterruptedException
	
	{
		String expected_result = "Order Created Successfully";
		
		
		//-----------------------dashboard--------
		
		dash_Obj.EnterCompanyName("wipro");
		Thread.sleep(2000);
		dash_Obj.ClickOnOption();
		Thread.sleep(3000);
		
		//--------------------------exchange----------
		exch_obj.ClickOnIntradayButton();
		exch_obj.EnterQuantity("2");
		exch_obj.ClickOnBuyButton2();
		Thread.sleep(3000);
		String actaul_result = exch_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
	
	@Test
	public void VerifyBuyFunctionalityIntradayWithCustomLimits() throws InterruptedException

{
		String expected_result = "Limit Order Created Successfully";
	
	
	//-----------------------dashboard--------
	
	dash_Obj.EnterCompanyName("wipro");
	Thread.sleep(2000);
	dash_Obj.ClickOnOption();
	Thread.sleep(3000);
	
	//--------------------------exchange----------
	exch_obj.ClickOnIntradayButton();
	exch_obj.ClickOnCustomLimitButton();
	exch_obj.EnterQuantity("2");
	exch_obj.EnterPrice("200");
	exch_obj.ClickOnBuyButton2();
	Thread.sleep(3000);
	String actaul_result = exch_obj.getOrderStatus();
	Assert.assertEquals(actaul_result, expected_result);
	
}
	


}
