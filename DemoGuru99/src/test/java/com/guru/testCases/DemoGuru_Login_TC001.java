package com.guru.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru.pageObjects.PageObjects_DemoGuru;

public class DemoGuru_Login_TC001 extends BaseClass{
	
	@Test
	public void demoLogin() throws InterruptedException, IOException
	{
		PageObjects_DemoGuru po = new PageObjects_DemoGuru(driver);
		po.setUserName(uname);
		logger.info("Entered User name");
		
		po.setPassword(pwd);
		logger.info("Password entered");
		
		po.clickLogin();
		logger.info("Clicked on Login button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login is successful");
		}
		else
		{
			captureScreen(driver, "demoLogin");
			Assert.assertTrue(false);
			logger.info("Login failed");
		}
		
		po.clickLogout();
		Thread.sleep(1000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			
			logger.info("Alert closed successfully");
		}
	}
	
	public boolean isAlertPresent()
	{
		try 
		{
			driver.switchTo().alert();
			return true;
		} 
		catch (NoAlertPresentException e) 
		{
			return false;
		}
	}

}
