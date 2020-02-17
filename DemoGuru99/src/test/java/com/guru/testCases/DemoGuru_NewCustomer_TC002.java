package com.guru.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru.pageObjects.PageObjects_DemoGuru;

public class DemoGuru_NewCustomer_TC002 extends BaseClass
{
	
	@Test
	public void newCustomer() throws InterruptedException, IOException
	{
		PageObjects_DemoGuru obj = new PageObjects_DemoGuru(driver);
		
		obj.setUserName(uname);
		logger.info("Entered User name");
		
		obj.setPassword(pwd);
		logger.info("Password entered");
		
		obj.clickLogin();
		logger.info("Clicked on Login button");
	
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("Login is successful");
	}
	else
	{
		captureScreen(driver, "newCustomer");
		Assert.assertTrue(false);
		logger.info("Login failed");
	}
	
	Thread.sleep(1000);
	
	
	obj.clickNewCustLink();
	logger.info("Clicked on new customer link");
	Thread.sleep(000);
	
	if(driver.getTitle().equals("Guru99 Bank New Customer Entry Page")) 
	{
		obj.setCustName(name);
		logger.info("Customer name entered");
	}
	
	obj.selectGender();
	logger.info("Customer gender selected");
	
	obj.setDOB(mm, dd, yyyy);
	logger.info("Customer DOB entered");
	
	obj.setCustAddress(addrs);
	
	obj.setCustCity(custCity);
	obj.setCustState(custState);
	obj.setPin(custPIN);
	obj.setPhone(custCell);
	
	String email = randomEmail()+"@gmail.com";
	obj.setEmail(email);
	logger.info("Random email got generated");
	
	obj.setCustPass(custPass);
	
	//obj.closeAdds();
	//Thread.sleep(1000);
	obj.clickSubmitButton();
	logger.info("Clicked on submit button after entering customer info");
	Thread.sleep(1000);
	
	if(driver.getPageSource().contains("Customer Registered Successfully!!!"))
	{
		logger.info("Customer Registered Successfully!!!");
		//obj.clickLogout();
	}
	else
	{
		logger.info("Customer Registration failed!!!");
	}
		
	Thread.sleep(2000);
	
	//obj.clickLogout();
	//logger.info("Clicked on Logout button");
	//Thread.sleep(3000);
	
	if(isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		logger.info("Alert closed successfully");
	}
	
	
}
	
	public String randomEmail()
	{
		String newEmail = RandomStringUtils.randomAlphabetic(5);
		return newEmail;
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
