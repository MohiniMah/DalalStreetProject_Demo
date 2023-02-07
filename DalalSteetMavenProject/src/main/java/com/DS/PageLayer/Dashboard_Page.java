package com.DS.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dashboard_Page  {

	public Dashboard_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='form-control']") private WebElement Searchbox_txt;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]") private WebElement select_option;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-togglez arrow-none']") private WebElement Transection_link;
	
	@FindBy(xpath="//button[@id='page-header-user-dropdown']") private WebElement profile_btn;
	
	@FindBy(xpath="//span[text()='Power Off']") private WebElement powerOff_btn;

	
	public void EnterCompanyName(String Company_name) 
	{
		Searchbox_txt.sendKeys(Company_name);
	}
	
	public void ClickOnOption()
	{
		select_option.click();
	}
	public void ClickOnTransectionlink()
	{
		Transection_link.click();
	}
	public void ClickOnProfileButton()
	{
		profile_btn.click();
	}
	public void ClickOnPowerOffButton()
	{
		powerOff_btn.click();
	}
}
