package com.Mercury.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ObjectRepository {
	
	WebDriver ldriver;
	
	public ObjectRepository(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	////////Objects for "Sign On" ===========================================================
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	@CacheLookup
	WebElement clickSignOnLink;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPWD;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement clickSubmit;
	
	public void clickSignOn() {
		clickSignOnLink.click();
	}
	
	public void setUserID(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPWD(String pwd) {
		txtPWD.sendKeys(pwd);
	}
	
	public void sSubmit() {
		clickSubmit.click();
	}
	
//////////Objects for "Flight Finder"========================================================
@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]") ///
@CacheLookup
WebElement clickRadioButton;

@FindBy(name="passCount")
@CacheLookup
WebElement selectPassenger;

@FindBy(name="fromPort")
@CacheLookup
WebElement selectFrom;

@FindBy(name="fromMonth")
@CacheLookup
WebElement selectFromMonth;

@FindBy(name="fromDay")
@CacheLookup
WebElement selectFromDay;

@FindBy(name="toPort")
@CacheLookup
WebElement selectTo;

@FindBy(name="toMonth")
//@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]")
@CacheLookup
WebElement selectToMonth;  

@FindBy(name="toDay")
//@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]")
@CacheLookup
WebElement selectToDay;

@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")
@CacheLookup
WebElement selectServiceClass;

@FindBy(name="airline")
@CacheLookup
WebElement selectAirLines;


@FindBy(name="findFlights")
@CacheLookup
WebElement clickOnImageContinue;	

public void clickTripType() {
clickRadioButton.click();
}

public void selectNoOfPassenger(String passNo) {
Select sel = new Select(selectPassenger);
sel.selectByValue(passNo); 
}

public void fromAirport(String portName) {
Select sel1 = new Select(selectFrom);//selectFrom
sel1.selectByVisibleText(portName);
}

public void fromstartMonth(String fromMonthName) {
Select sel2=new Select(selectFromMonth);
sel2.selectByVisibleText(fromMonthName);
}

public void staringDay(String fromDayName) {
Select sel3 = new Select(selectFromDay);
sel3.selectByValue(fromDayName);
}

public void toDestination(String destinationPort) {
Select sel4 = new Select (selectTo);
sel4.selectByValue(destinationPort);
}

public void arrivingMonth(String toMonthName) {
Select sel5 = new Select(selectToMonth);
sel5.selectByVisibleText(toMonthName);
}

public void arrivingDay(String toDayName) {
Select sel6 = new Select(selectToDay);
sel6.selectByVisibleText(toDayName);
}

public void seatPreference() {
selectServiceClass.click();
}

public void selectAirLines(String airLineName) {
Select sel7 = new Select(selectAirLines);
sel7.selectByVisibleText(airLineName);
}

public void clickContinue() {
clickOnImageContinue.click();
}
	
//////////Objects for "SELECT FLIGT" page========================================================
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")
	@CacheLookup
	WebElement clickDepartFlight;
	
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")
	@CacheLookup
	WebElement clickReturnFlight;
	
	@FindBy(name = "reserveFlights" )
	@CacheLookup
	WebElement clickImageReserveFlight;
	
	
	public void selectDepartingFlight() {
		clickDepartFlight.click();
	}
	
	public void selectReturningFlight() {
		clickReturnFlight.click();
	}
	
	public void clickOnContinueReserve() {
		clickImageReserveFlight.click();
	}
	
	
	//Objects for "Book A Flight"==================================================
	//Passengers
	
	@FindBy(name = "passFirst0")
	WebElement txtpassFirst0;
	
	public void setFirstName1(String firstName1) {
		txtpassFirst0.sendKeys(firstName1);
	}
	
	@FindBy(name = "passLast0")
	WebElement txtpassLast0;
	
	@FindBy(name = "pass.0.meal")
	WebElement selectMeal0;
	
	public void selectMealFirstPass(String mealPreference0) {
		Select sel8 = new Select(selectMeal0);
		sel8.selectByVisibleText(mealPreference0);
	}
	
	@FindBy(name = "pass.1.meal")
	WebElement selectMeal1;
	
	public void selectMealSecPass(String mealPreference1) {
		Select sel9 = new Select(selectMeal1);
		sel9.selectByVisibleText(mealPreference1);
	}
	
	@FindBy(name = "pass.2.meal")
	WebElement selectMeal2;
	
	public void selectMealThirdPass(String mealPreference2) {
		Select sel10 = new Select(selectMeal2);
		sel10.selectByVisibleText(mealPreference2);
	}
	
	@FindBy(name = "pass.3.meal")
	WebElement selectMeal3;
	
	public void selectMealFourthPass(String mealPreference3) {
		Select sel11 = new Select(selectMeal3);
		sel11.selectByVisibleText(mealPreference3);
	}
	
	public void setLastName1(String lastName1) {
		txtpassLast0.sendKeys(lastName1);
	}
	
	@FindBy(name = "passFirst1")
	WebElement txtpassFirst1;
	
	public void setFirstName2(String firstName2) {
		txtpassFirst1.sendKeys(firstName2);
	}
	
	@FindBy(name = "passLast1")
	WebElement txtpassLast1;
	
	public void setLastName2(String lastName2) {
		txtpassLast1.sendKeys(lastName2);
	}
	
	
	@FindBy(name = "passFirst2")
	WebElement txtpassFirst2;
	
	public void setFirstName3(String firstName3) {
		txtpassFirst2.sendKeys(firstName3);
	}
	
	@FindBy(name = "passLast2")
	WebElement txtpassLast2;
	
	public void setLastName3(String lastName3) {
		txtpassLast2.sendKeys(lastName3);
	}
	
	@FindBy(name = "passFirst3")
	WebElement txtpassFirst3;
	
	
	public void setFirstName4(String firstName4) {
		txtpassFirst3.sendKeys(firstName4);
	}
	
	
	@FindBy(name = "passLast3")
	WebElement txtpassLast3;
	
	public void setLastName4(String lastName4) {
		txtpassLast3.sendKeys(lastName4);
	}
	
	//Objects for "Book A Flight"==================================================
	//Credit Card
	
	@FindBy(name = "creditCard")
	WebElement selectCard;
	
	public void selectCreditCard(String cardName) {
		Select sel12 = new Select(selectCard);
		sel12.selectByVisibleText(cardName);
	}
	
	@FindBy (name = "creditnumber")
	@CacheLookup
	WebElement txtCardNumber;
	
	public void setCreditNumber(String cardNumber) {
		txtCardNumber.sendKeys(cardNumber);
	}
	
	@FindBy(name="cc_exp_dt_mn")
	WebElement txtMonth;
	
	public void setExpMonth(String expMonth) {
		Select sel14=new Select(txtMonth);
		sel14.selectByVisibleText(expMonth);
	}
	
	@FindBy(name="cc_exp_dt_yr")
	WebElement txtYear;
	
	public void setExpYear(String expYear) {
		Select sel14=new Select(txtYear);
		sel14.selectByVisibleText(expYear);
	}
	
	//Objects for "Book A Flight"==================================================
    //Billing Address
	
	@FindBy(name="billAddress1")
	WebElement txtBillingAddress;
	
	public void setBilingAddress(String billingAddress) {
		txtBillingAddress.clear();
		txtBillingAddress.sendKeys(billingAddress);
	}
	
	@FindBy(name="billCity")
	WebElement txtBillingCity;
	
	public void setBillCity(String billingCity) {
		txtBillingCity.clear();
		txtBillingCity.sendKeys(billingCity);
	}
	
	@FindBy(name="billState")
	WebElement txtBillState;
	
	public void setBillingState(String billingState) {
		txtBillState.clear();
		txtBillState.sendKeys(billingState);
	}
	
	@FindBy(name="billZip")
	WebElement txtBillZip;
	
	public void setBillZip(String billingZipCode) {
		txtBillZip.clear();
		txtBillZip.sendKeys(billingZipCode);
	}
	
	@FindBy(name="billCountry")
	WebElement txtBillingCountry;
	
	public void selectBillCountry(String billCountry) {
		Select sel15=new Select(txtBillingCountry);
		sel15.selectByVisibleText(billCountry);
	}
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[1]/font/b")
	WebElement txtText;
	
	public void gettxtText() {
		String strTXT=txtText.getText();
	}
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input")
	WebElement checkBoxClick;
	
	public void clickCheckBox() {
//		String strText1=checkBoxClick.getText();
//		System.out.println(strText1);
//		if(strText1.equals("Same as Billing Address")) {
			//checkBoxClick.click();
	}
	
	@FindBy(name="delAddress1")
	WebElement txtDelAddrs;
	
	public void setDeliAddrs(String deliAddress) {
		txtDelAddrs.clear();
		txtDelAddrs.sendKeys(deliAddress);
	}
	
	@FindBy(name="delCity")
	WebElement txtDelCity;
	
	public void setDeliCity(String deliCity) {
		txtDelCity.clear();
		txtDelCity.sendKeys(deliCity);
	}
	
	@FindBy(name="delState")
	WebElement txtDelState;
	
	public void setDeliState(String deliState) {
		txtDelState.clear();
		txtDelState.sendKeys(deliState);
		
	}
	
	@FindBy(name="delZip")
	WebElement txtDelZip;
	
	public void setDeliZip(String deliZipCode) {
		txtDelZip.clear();
		txtDelZip.sendKeys(deliZipCode);
	}
	
	@FindBy(name="delCountry")
	WebElement txtDeliCountry;
	
	public void selectDeliCountry(String deliCountry) {
		Select sel16 = new Select(txtDeliCountry);
		sel16.selectByVisibleText(deliCountry);
	}
	
	@FindBy(name="buyFlights")
	WebElement imageSecurePurchase;
	
	public void clickOnSecurePurchase() {
		imageSecurePurchase.click();
	}
	
	//Flight Confirmation Page---------------------------------------
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")
	WebElement txtConfMsg;
	
	public void getConfText() {
		String strtxt=txtConfMsg.getText();
		//System.out.println(strtxt);
		if(strtxt.equals("Your itinerary has been booked!")) {
			System.out.println("Flight reservation is successful");
		}
		else {
			System.out.println("Flight reservation is unsuccessful");
		}
	}
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement iLogOut;
	
	public void clickLogOut() {
		//System.out.println("We are clicking on Logout button");
		iLogOut.click();
	}
	
}

//Logout from Mercury Demo--------------------------------------------------
	
