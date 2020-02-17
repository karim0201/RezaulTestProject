package com.Mercury.testCases;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Mercury.utilities.ReadConfig;

public class BaseClass {
	public WebDriver driver;
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getAppURL();
	public String uname = readconfig.userName();
	public String pwd = readconfig.passWord();
	//public String trip = "";
	public String passNo = readconfig.passengerNo();
	public String portName = readconfig.departurePort();
	public String fromMonthName = readconfig.departureMonth();
	public String fromDayName = readconfig.departureDate();
	public String destinationPort = readconfig.arrivingPort();
	public String toMonthName = readconfig.arrivingMonth();
	public String toDayName = readconfig.arrivingDate();
	public String airLineName = readconfig.airlineName();
	public String firstName1 = readconfig.firstname1();
	public String lastName1 = readconfig.lastname1();
	
	public String firstName2 = readconfig.firstname2();
	public String lastName2 = readconfig.lastname2();
	
	public String firstName3 = readconfig.firstname3();
	public String lastName3 = readconfig.lastname3();
	
	public String firstName4 = readconfig.firstname4();
	public String lastName4 = readconfig.lastname4();
	public String mealPreference0 = readconfig.mealpreference0();
	public String mealPreference1 = readconfig.mealpreference1();
	public String mealPreference2 = readconfig.mealpreference2();
	public String mealPreference3 = readconfig.mealpreference3();
	public String cardName = readconfig.cardname();
	public String cardNumber = readconfig.cardnumber();
	//int cardNo=Integer.parseInt(cardNumber);
	public String expMonth=readconfig.expmonth();
	public String expYear=readconfig.expyear();
	public String billingAddress = readconfig.billAddress(); 
	public String billingCity=readconfig.billCity();
	public String billingState=readconfig.billState();
	public String billingZipCode=readconfig.billZip();
	public String billCountry=readconfig.billCountry();
	public String deliAddress=readconfig.getdeliverAddrs();
	public String deliCity=readconfig.getdeliverCity();
	public String deliState=readconfig.getdeliverState();
	public String deliZipCode=readconfig.getdeliveryZip();
	public String deliCountry=readconfig.getdeliverCountry();
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setUP(String br) {
		//System.setProperty("webdriver.chrome.driver", readconfig.chromePath());
		//driver = new ChromeDriver();
		
		logger = Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("log4j.properties");

		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.chromePath());
			driver = new ChromeDriver();
		}
		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.IEPath());
			driver = new InternetExplorerDriver();
		}
		driver.get(baseURL);
		
	}
	
	@AfterClass
	public void tearDown() {
		if (driver!=null) {
			//driver.quit();
			//System.out.println("We logged out successfully!!!");
			//logger.info("We closed the browser successfully");
		}
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+ "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot is taken");
	}
}






