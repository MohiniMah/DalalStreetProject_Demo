package com.DS.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {

	public SignUp_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='formrow-firstname-Input']") private WebElement FName_txt;
	
	@FindBy(xpath="//input[@id='formrow-lastname-Input']") private WebElement LName_txt;

	@FindBy(xpath="//input[@name='email']") private WebElement EnterEmail_txt;

	@FindBy(xpath="//input[@name='password']") private WebElement Password_txt;

	@FindBy(xpath="//input[@id='customControlInline']") private WebElement Check_Box;
	
    @FindBy(xpath="//div[@class='mt-3 d-grid']") private WebElement StartJourny_btn;
	
	public void EnterFirstName(String FirstName) {
		FName_txt.sendKeys(FirstName);
	}

	public void EnterLastName(String LastName) {
		LName_txt.sendKeys(LastName);
	}

	public void EnterEmail(String email) {
		EnterEmail_txt.sendKeys(email);
	}
	
	public void EnterPassword(String Pass) {
		Password_txt.sendKeys(Pass);
	}
	public void tikOnCheck_box() {
		Check_Box.click();
	}

	public void clickOnStartJourny() {
		StartJourny_btn.click();
	}

}
