package com.guru.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.guru.utilities.ReadConfig;


//import com.Mercury.utilities.ReadConfig;

	public class BaseClass {
		
	public static WebDriver driver;
	public static Logger logger;
	
	ReadConfig rconfig = new ReadConfig();
	
	public String baseURL = rconfig.getAppURL();
	public String uname = rconfig.getUsername();
	public String pwd = rconfig.getPasword();
	public String name = rconfig.getCustName();
	public String mm = rconfig.getbirthMonth();
	public String dd = rconfig.getbirthDate();
	public String yyyy = rconfig.getbirthYear();
	public String addrs = rconfig.getcustAddrs();
	public String custCity = rconfig.getcustCity();
	public String custState = rconfig.getCustState();
	public String custPIN = rconfig.getCustPIN();
	public String custCell = rconfig.getCustCell();
	//public String emailID = rconfig.getEmail();
	public String custPass = rconfig.getCustPassword();
	public String cID = rconfig.getCustID();
	
	
	
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUP(String br) 
	{
		logger = Logger.getLogger("DemoGuru99");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","C:/Users/bafka/Desktop/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",rconfig.getChrome());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if(br.equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", rconfig.getFF());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if (br.equals("ie"))
		{
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", rconfig.getIE());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown() 
	{
		if(driver!=null)
		{
			//driver.quit();
			//System.out.println("We closed the driver successfully");
			//logger.info("We closed the driver successfully");
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
