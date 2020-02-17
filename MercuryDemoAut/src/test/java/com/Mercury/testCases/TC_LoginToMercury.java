package com.Mercury.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Mercury.pageObjects.ObjectRepository;

public class TC_LoginToMercury extends BaseClass{
	
	@Test (priority=1)
	public void login() {
		
			//driver.get(baseURL);
			
			ObjectRepository or = new ObjectRepository(driver);
			or.clickSignOn();
			or.setUserID(uname);
			or.setPWD(pwd);
			or.sSubmit();
			logger.info("Login is successful");
	}	
	
			
	@Test (priority = 2)		
	public void flightFinderselector() throws InterruptedException {
	if(driver.getCurrentUrl().equals("http://newtours.demoaut.com/mercuryreservation.php")) {
			System.out.println("We are in Flight finder page");
				}
			else {
				Assert.assertTrue(false);			
				}
		ObjectRepository or = new ObjectRepository(driver);
		
		try {
			or.clickTripType();
			or.selectNoOfPassenger(passNo);
			or.fromAirport(portName);
			or.fromstartMonth(fromMonthName);
			or.staringDay(fromDayName);
			or.toDestination(destinationPort);
			or.arrivingMonth(toMonthName);
			or.arrivingDay(toDayName);
			or.selectAirLines(airLineName);
			Thread.sleep(2000);
			or.clickContinue();
			logger.info("Flight finder selector is successful");
		} catch (org.openqa.selenium.NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 3)
	public void selectFlight() throws InterruptedException {
		if(driver.getCurrentUrl().equals("http://newtours.demoaut.com/mercuryreservation2.php")) {
			System.out.println("We are in SELECT FLIGHT page");
				}
			else {
				Assert.assertTrue(false);			
				}
		
		ObjectRepository or = new ObjectRepository(driver);
		or.selectDepartingFlight();
		or.selectReturningFlight();
		Thread.sleep(2000);
		or.clickOnContinueReserve();
		logger.info("Select flight is successful");
	}
	
	
	@Test(priority = 4)
	public void bookAFlight() throws InterruptedException {
		ObjectRepository or = new ObjectRepository(driver);
		String currentTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		
		if(currentTitle =="Book a Flight: Mercury Tours" ) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false, "Wrong page");
		}
		Assert.assertEquals(currentTitle, "Book a Flight: Mercury Tours");
		or.setFirstName1(firstName1);
		or.setLastName1(lastName1);
		or.selectMealFirstPass(mealPreference0);
		Thread.sleep(1000);
		
		or.setFirstName2(firstName2);
		or.setLastName2(lastName2);
		or.selectMealSecPass(mealPreference1);
		Thread.sleep(1000);
		
		or.setFirstName3(firstName3);
		or.setLastName3(lastName3);
		or.selectMealThirdPass(mealPreference2);
		Thread.sleep(1000);
		
		or.setFirstName4(firstName4);
		or.setLastName4(lastName4);
		or.selectMealFourthPass(mealPreference3);
		Thread.sleep(1000);
		
		or.selectCreditCard(cardName);
		or.setCreditNumber(cardNumber);
		or.setExpMonth(expMonth);
		or.setExpYear(expYear);
		Thread.sleep(2000);
		
		
		or.setBilingAddress(billingAddress);
		or.setBillCity(billingCity);
		or.setBillingState(billingState);
		or.setBillZip(billingZipCode);
		or.selectBillCountry(billCountry);
		
		//or.clickCheckBox();
		Thread.sleep(3000);
		or.setDeliAddrs(deliAddress);
		or.setDeliCity(deliCity);
		or.setDeliState(deliState);
		or.setDeliZip(deliZipCode);
		or.selectDeliCountry(deliCountry);
		Thread.sleep(2000);
		
		or.clickOnSecurePurchase();
		
		
		logger.info("Flight booking is successful");
		
		
	}
	@Test (priority = 5)
	public void logOut() throws InterruptedException {
		ObjectRepository or = new ObjectRepository(driver);
		or.getConfText();
		Thread.sleep(1000);
		//or.clickLogOut();
		logger.info("Logout is successful");
	}
	
	
}
