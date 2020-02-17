package com.Mercury.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderObject {
	WebDriver ldriver;
	
	public FlightFinderObject(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
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

}
