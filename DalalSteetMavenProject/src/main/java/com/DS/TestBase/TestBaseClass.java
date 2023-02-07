package com.DS.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.DS.PageLayer.Dashboard_Page;
import com.DS.PageLayer.Exchange_PageOfBuy;
import com.DS.PageLayer.Exchange_PageOfSell;
import com.DS.PageLayer.LoginPage;
import com.DS.PageLayer.Transection_Page;
import com.DS.Utilities.ReadConfig;
import com.DS.Utilities.UtilClass;


import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBaseClass {
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	public LoginPage login_obj ;
	public Dashboard_Page dash_Obj;
	public Exchange_PageOfBuy exch_obj;
	public Exchange_PageOfSell sell_obj;
	public Transection_Page trans_obj;
	public UtilClass util_obj;
	
	
	@BeforeTest
	public void start() {
		logger=Logger.getLogger("DalalStreet Automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework Execution Started.. ");
	}
	@AfterTest
	public void end()
	{
		logger.info("Framework execution stopped");
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void Setup(String br) throws InterruptedException 
	{
			
		if(br.equalsIgnoreCase("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		
		ReadConfig read_config = new ReadConfig();
		
		driver.get(read_config.getApplicationUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("browser launches, url , maximize window");
		
		//----------------------Object Creation------------------
		
		login_obj = new LoginPage(driver);
		dash_Obj = new Dashboard_Page(driver);
		exch_obj = new Exchange_PageOfBuy(driver);
		sell_obj = new Exchange_PageOfSell(driver);
		trans_obj = new Transection_Page(driver);
		util_obj = new UtilClass();
		logger.info("Object Creation ");
		
		//-----------------------login Steps---------------
		
		login_obj.EnterEmailId(read_config.getEmailAddress());
		login_obj.EnterPassword(read_config.getPassword());
		login_obj.ClickOnLogin();
		Thread.sleep(2000);
		logger.info("Login the application");
	}
	
	@AfterMethod
	public void shutDown()
	{
//		driver.quit();
	}
	
}
