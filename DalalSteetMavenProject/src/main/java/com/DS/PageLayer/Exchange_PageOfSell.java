package com.DS.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exchange_PageOfSell {
	
	public Exchange_PageOfSell(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Sell']")  private WebElement Sell_btn;
	
	@FindBy(xpath="(//label[text()='Intraday'])[2]")  private WebElement Intraday_btn2;
	
	@FindBy(xpath="//label[text()='Market']")  private WebElement Market_btn2;

	//@FindBy(xpath="//label[text()='Custom Limit'])[2]")  private WebElement CustomLimit_btn2;

	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[8]")  private WebElement CustomLimit_btn2;

	@FindBy(xpath="//label[text()='Long-term']")  private WebElement LongTerm_btn2;

	@FindBy(xpath="(//input[@class='form-control form-control'])[2]")  private WebElement price_txt2;
	
	@FindBy(xpath="//input[@id='quantity']")  private WebElement addQuantity_txt2;
	
	@FindBy(xpath="//button[text()='Sell']")  private WebElement Sell_btn2;
	
	@FindBy(xpath="(//div[contains(text(),'Order Created')])[2]") private WebElement status_smg;

	
	
	public void ClickOnSellButton() 
	{
		Sell_btn.click();
	}
	public void EnterQuantityForSell(String count)
	{
		addQuantity_txt2.sendKeys(count);
	}
	
	public void ClickOnIntradayButton() 
	{
		Intraday_btn2.click();
	}
	public void ClickOnMarketButton()
	{
		Market_btn2.click();
	}
	
	public void ClickOnLongTermButton() 
	{
		LongTerm_btn2.click();
	}
	
	public void EnterPrice(String price) 
	{
		price_txt2.click();
		price_txt2.sendKeys(price);
	}
	public void ClickOnSellButton2() 
	{
		Sell_btn2.click();
	}
	public void ClickOnCustomLimitButton2() 
	{
		CustomLimit_btn2.click();
		
	}
	public String getOrderStatus() {
		String msg = status_smg.getText();
		return msg;
		
	}
}
