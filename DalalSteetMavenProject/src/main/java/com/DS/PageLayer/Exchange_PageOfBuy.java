package com.DS.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exchange_PageOfBuy {
	
	
	public Exchange_PageOfBuy(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Buy']")  private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")  private WebElement addQuantity_txt;
		
	@FindBy(xpath="//button[text()='Buy']")  private WebElement buy_btn2;

	@FindBy(xpath="//label[text()='Intraday']")  private WebElement Intraday_btn;
	
	@FindBy(xpath="//label[text()='Market']")  private WebElement Market_btn;

	@FindBy(xpath="//label[text()='Custom Limit']")  private WebElement CustomLimit_btn;

	@FindBy(xpath="//label[text()='Long-term']")  private WebElement LongTerm_btn;

	@FindBy(xpath="(//input[@class='form-control'])[4]")  private WebElement price_txt;
	
	@FindBy(xpath="//a[text()='Sell']")  private WebElement Sell_btn;
	
	@FindBy(xpath="//div[contains(text(),'Order Created')]") private WebElement status_smg;
	
	
	public void ClickOnBuyButton1() 
	{
		buy_btn1.click();
	}
	public void EnterQuantity(String count)
	{
		addQuantity_txt.click();
		addQuantity_txt.sendKeys(count);
	}
	public void ClickOnBuyButton2() 
	{
		buy_btn2.click();
	}
	
	public void ClickOnIntradayButton() 
	{
		Intraday_btn.click();
	}
	public void ClickOnMarketButton()
	{
		Market_btn.click();
	}
	public void ClickOnCustomLimitButton() 
	{
		CustomLimit_btn.click();
	}
	public void ClickOnLongTermButton() 
	{
		LongTerm_btn.click();
	}
	
	public void EnterPrice(String price) 
	{
		price_txt.sendKeys(price);
	}
//	public void ClickOnSellButton() {
//		
//			Sell_btn.click();	
//	}
	public String getOrderStatus() {
		String msg = status_smg.getText();
		return msg;
		
	}

	
	
}
