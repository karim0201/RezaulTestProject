package com.guru.testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru.pageObjects.PageObjects_DemoGuru;
import com.guru.utilities.XLUtils;

public class DemoGuru_NewCust_DDT_TC003 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void DemoGuru_DDT(String uname, String pwd, String name, String mm, String dd, String yyyy, 
			String addrs, String custCity, String custState, String  custPIN, String custCell,
			String custPass, String cID) throws InterruptedException, IOException
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
			captureScreen(driver, "DemoGuru_DDT");
			Assert.assertTrue(false);
			logger.info("Login failed");
		}
		
		Thread.sleep(1000);
		
		po.clickNewCustLink();
		logger.info("Clicked on new customer link");
		
		Thread.sleep(000);
		if(driver.getTitle().equals("Guru99 Bank New Customer Entry Page")) 
		{
			po.setCustName(name);
			logger.info("Customer name entered");
		}
		
		po.selectGender();
		logger.info("Customer gender selected");
		
		po.setDOB(mm, dd, yyyy);
		logger.info("Customer DOB entered");
		
		po.setCustAddress(addrs);
		po.setCustCity(custCity);
		logger.info("Customer City entered as - "+ custCity);
		po.setCustState(custState);
		po.setPin(custPIN);
		po.setPhone(custCell);
		//po.setEmail(custPass);
		String email = randomEmail()+"@gmail.com";
		po.setEmail(email);
		logger.info("Random email got generated");
		
		po.setCustPass(custPass);
		po.clickSubmitButton();
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
		
		
		po.clickDelCustomer();
		po.setCustID(cID);
		
		po.clickDelCustID();
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			//driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			
			//logger.info("Alert closed successfully");
		}	
		else
		{
			Assert.assertTrue(true);
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
	
	@DataProvider(name="LoginData")
	String [] [] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/guru/testData/Demo_Guru_DDT.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String loginData [][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				loginData [i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;
	}
	
}
