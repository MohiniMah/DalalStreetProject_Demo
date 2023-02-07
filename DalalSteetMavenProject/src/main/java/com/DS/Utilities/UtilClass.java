package com.DS.Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.DS.TestBase.TestBaseClass;

public class UtilClass extends TestBaseClass {
		
		public UtilClass()
		{
			PageFactory.initElements(driver, this);
		}

		//get url 
		
		public String getWebPageUrl()
		{
			String url = driver.getCurrentUrl();
			return url;
		}
		
		public static void takeSS(String filename) throws IOException
		{
			String path="C:\\Users\\Shivanshu\\eclipse-workspace\\DalalSteetMavenProject\\Screenshots\\";
			try {
				//screenshot
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File des = new File(path+filename+ ".png");
				FileHandler.copy(src, des);
			}
			catch(IOException e){
				System.out.println("file path is not correct");
				e.printStackTrace();
			}
		
		}
}
                          