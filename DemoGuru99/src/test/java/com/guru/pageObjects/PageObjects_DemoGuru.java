package com.guru.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjects_DemoGuru {
	WebDriver ldriver;
	
	public PageObjects_DemoGuru(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.NAME, using="uid")
	@CacheLookup
	WebElement txtUserName;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement txtPassword;
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement clickNewCust;
	
	public void clickNewCustLink()
	{
		clickNewCust.click();
	}
	
	@FindBy(name = "name")
	@CacheLookup
	WebElement txtName;
	
	public void setCustName(String name)
	{
		txtName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement clickrdoButton;
	
	public void selectGender()
	{
		clickrdoButton.click();
	}
	
	@FindBy(how=How.ID_OR_NAME,using = "dob")
	WebElement txtDOB;
	
	public void setDOB(String mm, String dd, String yyyy)
	{
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(yyyy);
	}
	
	@FindBy(name="addr")
	WebElement txtAddress;
	
	public void setCustAddress(String addrs)
	{
		txtAddress.sendKeys(addrs);
	}
	
	@FindBy(name="city")
	WebElement txtCity;
	
	public void setCustCity(String custCity)
	{
		txtCity.sendKeys(custCity);
	}
	
	@FindBy(name="state")
	WebElement txtState;
	
	public void setCustState(String custState)
	{
		txtState.sendKeys(custState);
	}
	
	@FindBy(name="pinno")
	WebElement txtPIN;
	
	public void setPin(String custPIN)
	{
		txtPIN.sendKeys(String.valueOf(custPIN));
	}
	
	@FindBy(name="telephoneno")
	WebElement txtPhone;
	
	public void setPhone(String custCell)
	{
		txtPhone.sendKeys(custCell);
	}
	
	@FindBy(name="emailid")
	WebElement txtEmail;
	
	public void setEmail(String emailID)
	{
		txtEmail.sendKeys(emailID);
	}
	
	@FindBy(name="password")
	WebElement txtPass;
	
	public void setCustPass(String custPass)
	{
		txtPass.sendKeys(custPass);
	}
	
	@FindBy(name="sub")
	WebElement clickSubmit;
	
	public void clickSubmitButton()
	{
		clickSubmit.click();
	}
	
	@FindBy(xpath = "//*[@id=\"closeBtn\"]")
	WebElement clickAdds;
	
	public void closeAdds()
	{
		clickAdds.click();
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[15]/a")  
	WebElement btnLogout;
	
	public void clickLogout()
	{
		btnLogout.click();
	}
	
	@FindBy(xpath = "//*[@id=\"customer\"]/tbody/tr[4]/td[2]")
	WebElement txtID;
	
	public void getID(String cid)
	{
		txtID.getAttribute(cid);
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/div[3]/div/ul/li[4]/a")
	WebElement clickDelCust;
	
	public void clickDelCustomer()
	{
		clickDelCust.click();
	}
	
	@FindBy(name="cusid")
	@CacheLookup
	WebElement txtCustID;
	
	public void setCustID(String cID)
	{
		txtCustID.sendKeys(cID);
	}
	
	@FindBy(name="AccSubmit")
	WebElement clickDelSub;
	
	public void clickDelCustID()
	{
		clickDelSub.click();
	}
	
	
	
}
