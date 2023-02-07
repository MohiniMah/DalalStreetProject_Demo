package com.DS.PageLayer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------------obj repository
	@FindBy(xpath="//input[@name='email']") private WebElement email_txtBox;
	
	@FindBy(xpath="//input[@name='password']") private WebElement pass_txtBox;
	
	@FindBy(xpath="//button[text()='Log In']") private WebElement Login_Btn;
	
	@FindBy(xpath="//a[text()='Signup now']") private WebElement SignUp_btn;
	
	//-----------------------------action method
	public void EnterEmailId(String Email) {
		email_txtBox.sendKeys(Email);
		
	}

	public void EnterPassword(String Pass) {
		pass_txtBox.sendKeys(Pass);
	}

	public void ClickOnLogin() {
		Login_Btn.click();
	}

	public void ClickOnSignUp_btn() {
		SignUp_btn.click();
	}
}
