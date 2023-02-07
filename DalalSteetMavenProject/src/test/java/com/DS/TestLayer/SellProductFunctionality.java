package com.DS.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS.PageLayer.Dashboard_Page;

import com.DS.PageLayer.Exchange_PageOfBuy;
import com.DS.PageLayer.Exchange_PageOfSell;
import com.DS.PageLayer.LoginPage;
import com.DS.TestBase.TestBaseClass;

public class SellProductFunctionality extends TestBaseClass{

	
	@Test
	public void VerifySellFunctionalityLongTermWithMarket() throws InterruptedException
	
	{
		//String expected_result = "Limit Order Created Successfully";

		//-----------------------dashboard--------
		
		dash_Obj.EnterCompanyName("wipro");
		Thread.sleep(2000);
		dash_Obj.ClickOnOption();
		Thread.sleep(3000);
		//----------------exchange ----------------
		sell_obj.ClickOnSellButton();
		
		//-------------------------sell
		Thread.sleep(2000);
		sell_obj.EnterQuantityForSell("2");
		sell_obj.ClickOnSellButton2();
		
//		String actaul_result = exch_obj.getOrderStatus();
//		Assert.assertEquals(actaul_result, expected_result);
	}
	
	
	
	@Test
	public void VerifySellFunctionalityLongTermWithCustomeLimit() throws InterruptedException
	
	{
		
		//-----------------------dashboard--------
		
		dash_Obj.EnterCompanyName("wipro");
		Thread.sleep(2000);
		dash_Obj.ClickOnOption();
		Thread.sleep(3000);
		//----------------exchange ----------------
		Thread.sleep(2000);
		sell_obj.ClickOnSellButton();
		
		//-------------------------sell-----------
		Thread.sleep(2000);
		sell_obj.ClickOnCustomLimitButton2();
		sell_obj.EnterQuantityForSell("2");
		sell_obj.EnterPrice("300");
		sell_obj.ClickOnSellButton2();
	}
	
	@Test
	public void VerifySellFunctionalityIntradayWithMarket() throws InterruptedException
	
	{
		//String expected_result = "Limit Order Created Successfully";
		
		//-----------------------dashboard--------
		
		dash_Obj.EnterCompanyName("wipro");
		Thread.sleep(2000);
		dash_Obj.ClickOnOption();
		Thread.sleep(3000);
		//----------------exchange ----------------
		sell_obj.ClickOnSellButton();
		
		sell_obj.ClickOnIntradayButton();
		Thread.sleep(2000);
		sell_obj.EnterQuantityForSell("1");
		sell_obj.ClickOnSellButton2();
//		String actaul_result = exch_obj.getOrderStatus();
//		Assert.assertEquals(actaul_result, expected_result);
	}
	
	@Test
	public void VerifySellFunctionalityIntradayWithCustomLimit() throws InterruptedException
	
	{
		
		//-----------------------dashboard--------
		
		dash_Obj.EnterCompanyName("wipro");
		Thread.sleep(2000);
		dash_Obj.ClickOnOption();
		Thread.sleep(3000);
		//----------------exchange ----------------
		sell_obj.ClickOnSellButton();
		
		sell_obj.ClickOnIntradayButton();
		Thread.sleep(2000);
		sell_obj.ClickOnCustomLimitButton2();
		sell_obj.EnterQuantityForSell("1");
		sell_obj.EnterPrice("200");
		sell_obj.ClickOnSellButton2();
	}
}
