package com.Mercury.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Mercury.pageObjects.ObjectRepository;
import com.Mercury.utilities.XLUtils;

public class TC_Login_DDT extends BaseClass
	{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String uname, String pwd, String passNo, String portName, String fromMonthName, String fromDayName,String destinationPort, String toMonthName, String toDayName, 
			String airLineName, String firstName1,String lastName1,String firstName2, String lastName2, String firstName3, String lastName3, String firstName4, String lastName4,
			String mealPreference0, String mealPreference1,String mealPreference2, String mealPreference3, String cardName,String cardNumber,String expMonth, String expYear,
			String billingAddress,String billingCity, String billingState,String billingZipCode, String billCountry, String deliAddress, String deliCity, String deliState, 
			String deliZipCode, String deliCountry ) throws InterruptedException 
	{
		ObjectRepository or = new ObjectRepository(driver);
		
		or.clickSignOn();
		logger.info("Clicked on Sign on button");
		or.setUserID(uname);
		or.setPWD(pwd);
		or.sSubmit();
		logger.info("Clicked on Login on button");
		
		Thread.sleep(1000);
		
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
		
		Thread.sleep(2000);
		
		or.selectDepartingFlight();
		or.selectReturningFlight();
		Thread.sleep(1000);
		or.clickOnContinueReserve();
		logger.info("Select flight is successful");
		//or.clickLogOut();
		//logger.info("Clicked on Log off on button");
		
		Thread.sleep(2000);
		
//		String currentTitle = driver.getTitle();
//	System.out.println(driver.getTitle());
//	
//	if(currentTitle =="Book a Flight: Mercury Tours" ) {
//		Assert.assertTrue(true);
//	}
//	else {
//		Assert.assertTrue(false, "Wrong page");
//	}
//	Assert.assertEquals(currentTitle, "Book a Flight: Mercury Tours");
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
	
	or.getConfText();
	Thread.sleep(1000);
	//or.clickLogOut();
	//logger.info("Logout is successful");	
	}
	
//	@Test (dataProvider="LoginData", priority = 2)
//	public void flightFinderselector_DDT(String passNo, String portName, String fromMonthName, String fromDayName,String destinationPort, String toMonthName, String toDayName, String airLineName) throws InterruptedException 
//	{
////		if(driver.getCurrentUrl().equals("http://newtours.demoaut.com/mercuryreservation.php")) 
////		{
////			System.out.println("We are in Flight finder page");
////				}
////			else {
////				Assert.assertTrue(false);			
////				}
//		ObjectRepository or = new ObjectRepository(driver);
//		
//		try {
//			or.clickTripType();
//			or.selectNoOfPassenger(passNo);
//			or.fromAirport(portName);
//			or.fromstartMonth(fromMonthName);
//			or.staringDay(fromDayName);
//			or.toDestination(destinationPort);
//			or.arrivingMonth(toMonthName);
//			or.arrivingDay(toDayName);
//			or.selectAirLines(airLineName);
//			Thread.sleep(2000);
//			or.clickContinue();
//			logger.info("Flight finder selector is successful");
//		} catch (org.openqa.selenium.NoSuchElementException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test(dataProvider="LoginData", priority = 3)
//	public void selectFlight_DDT() throws InterruptedException {
//		if(driver.getCurrentUrl().equals("http://newtours.demoaut.com/mercuryreservation2.php")) {
//			System.out.println("We are in SELECT FLIGHT page");
//				}
//			else {
//				Assert.assertTrue(false);			
//				}
//		
//		ObjectRepository or = new ObjectRepository(driver);
//		or.selectDepartingFlight();
//		or.selectReturningFlight();
//		Thread.sleep(2000);
//		or.clickOnContinueReserve();
//		logger.info("Select flight is successful");
//	}
//	
//	@Test(dataProvider="LoginData", priority = 4)
//	public void bookAFlight_DDT() throws InterruptedException 
//		{
//		ObjectRepository or = new ObjectRepository(driver);
//		String currentTitle = driver.getTitle();
////		System.out.println(driver.getTitle());
//		
////		if(currentTitle =="Book a Flight: Mercury Tours" ) {
////			Assert.assertTrue(true);
////		}
////		else {
////			Assert.assertTrue(false, "Wrong page");
////		}
//		Assert.assertEquals(currentTitle, "Book a Flight: Mercury Tours");
//		or.setFirstName1(firstName1);
//		or.setLastName1(lastName1);
//		or.selectMealFirstPass(mealPreference0);
//		Thread.sleep(1000);
//		
//		or.setFirstName2(firstName2);
//		or.setLastName2(lastName2);
//		or.selectMealSecPass(mealPreference1);
//		Thread.sleep(1000);
//		
//		or.setFirstName3(firstName3);
//		or.setLastName3(lastName3);
//		or.selectMealThirdPass(mealPreference2);
//		Thread.sleep(1000);
//		
//		or.setFirstName4(firstName4);
//		or.setLastName4(lastName4);
//		or.selectMealFourthPass(mealPreference3);
//		Thread.sleep(1000);
//		
//		or.selectCreditCard(cardName);
//		or.setCreditNumber(cardNumber);
//		or.setExpMonth(expMonth);
//		or.setExpYear(expYear);
//		Thread.sleep(2000);
//		
//		
//		or.setBilingAddress(billingAddress);
//		or.setBillCity(billingCity);
//		or.setBillingState(billingState);
//		or.setBillZip(billingZipCode);
//		or.selectBillCountry(billCountry);
//		
//		//or.clickCheckBox();
//		Thread.sleep(3000);
//		or.setDeliAddrs(deliAddress);
//		or.setDeliCity(deliCity);
//		or.setDeliState(deliState);
//		or.setDeliZip(deliZipCode);
//		or.selectDeliCountry(deliCountry);
//		Thread.sleep(2000);
//		
//		or.clickOnSecurePurchase();
//		
//		logger.info("Flight booking is successful");
//		}
//	
//	
//	@Test (dataProvider="LoginData", priority = 5)
//	public void logOut_DDT() throws InterruptedException {
//		ObjectRepository or = new ObjectRepository(driver);
//		or.getConfText();
//		Thread.sleep(1000);
//		//or.clickLogOut();
//		logger.info("Logout is successful");
//	}
//	
//		
////	if(isAlertPresent()==true) {
////			driver.switchTo().alert().accept();
////		driver.switchTo().defaultContent();
////			Assert.assertTrue(false);
////		}
////		else {
////			Assert.assertTrue(true);
////			or.clickLogOut();
////	}
//		
//	//}
////	driver.switchTo().alert().accept(); //close alert
////	driver.switchTo().defaultContent();
////	}
////		public boolean isAlertPresent() {
////		try {
////			driver.switchTo().alert();
////			return true;
////		} catch (NoAlertPresentException e) {
////		return false;
////		}
////		}
//	
//	
//	
//	//}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
		{
		//String path =  "C:/Users/bafka/Desktop/NewTours.xlsx"; //"C:/Users/bafka/Desktop/LoginData.xlsx";
		String path = System.getProperty("user.dir")+"/src/test/java/com/Mercury/testData/NewTours_Copy.xlsx";
		//String path = System.getProperty("user.dir")+"/src/test/java/com/Mercury/testData/TestData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colnum = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String loginData [][] = new String [rownum][colnum]; 
		
		for (int i=1; i<=rownum; i++) 
		{
			for(int j=0; j<colnum; j++) 
			{
				loginData [i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;
	}
}
