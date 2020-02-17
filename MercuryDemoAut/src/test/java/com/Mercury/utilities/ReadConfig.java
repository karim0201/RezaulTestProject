package com.Mercury.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() 
	{
		File src = new File("./Configuration/config.properties");
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(src);
		} 
		catch (FileNotFoundException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		pro = new Properties();
		try 
		{
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception is" +e.getMessage());
		}
	}
	
	public String getAppURL () {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String userName() {
		String name = pro.getProperty("uname");
		return name;
	}
	
	public String passWord() {
		String sPWD = pro.getProperty("pwd");
		return sPWD;
		
	}
	
	public String chromePath() {
		String path = pro.getProperty("chromepath");
		return path;
	}
	
	public String IEPath() {
		String IEpath=pro.getProperty("IEpath");
		return IEpath;
	}
	
	public String getFireFox()
	{
		String FireFoxpath = pro.getProperty("ffpath");
		return FireFoxpath;
	}
	
	public String passengerNo() {
		String passNo=pro.getProperty("passNo");
		return passNo;
	}
	
	public String departurePort() {
		String portName=pro.getProperty("portName");
		return portName;
	}
	
	public String departureMonth() {
		String fromMonthName=pro.getProperty("fromMonthName");
		return fromMonthName;
	}
	
	public String departureDate() {
		String toDayName=pro.getProperty("toDayName");
		return toDayName;
	}
	
	public String arrivingPort() {
		String destinationPort=pro.getProperty("destinationPort");
		return destinationPort;
		
	}
	
	public String arrivingMonth() {
		String toMonthName=pro.getProperty("toMonthName");
		return toMonthName;
		
	}
	
	public String arrivingDate() {
		String toDayName=pro.getProperty("toDayName");
		return toDayName;
	}
	
	public String airlineName() {
		String airLineName=pro.getProperty("airLineName");
		return airLineName;
	}
	
	public String firstname1() {
		String firstName1=pro.getProperty("firstName1");
		return firstName1;
	}
	
	public String lastname1() {
		String lastName1=pro.getProperty("lastName1");
		return lastName1;
	}
	
	public String firstname2() {
		String firstName2=pro.getProperty("firstName2");
		return firstName2;
	}
	
	public String lastname2() {
		String lastName2=pro.getProperty("lastName2");
		return lastName2;
	}
	
	public String firstname3() {
		String firstName3=pro.getProperty("firstName3");
		return firstName3;
	}
	
	public String lastname3() {
		String lastName3=pro.getProperty("lastName3");
		return lastName3;
	}
	
	public String firstname4() {
		String firstName4=pro.getProperty("firstName4");
		return firstName4;
	}
	
	public String lastname4() {
		String lastName4=pro.getProperty("lastName4");
		return lastName4;
	}
	
	public String mealpreference0() {
		String mealPreference0=pro.getProperty("mealPreference0");
		return mealPreference0;
	}
	
	public String mealpreference1() {
		String mealPreference1=pro.getProperty("mealPreference1");
		return mealPreference1;
	}
	
	public String mealpreference2() {
		String mealPreference2=pro.getProperty("mealPreference2");
		return mealPreference2;
	}
	
	public String mealpreference3() {
		String mealPreference3=pro.getProperty("mealPreference3");
		return mealPreference3;
	}
	
	public String cardname() {
		String cardName=pro.getProperty("cardName");
		return cardName;
	}
	
	public String cardnumber() {
		String cardNumber=pro.getProperty("cardNumber");
		return cardNumber;
	}
	
	public String expmonth() {
		String expMonth=pro.getProperty("expMonth");
		return expMonth;
	}
	
	public String expyear() {
		String expYear=pro.getProperty("expYear");
		return expYear;
	}
	
	public String billAddress() {
		String billAddress=pro.getProperty("billingAddress");
		return billAddress;
	}
	
	public String billCity() {
		String billCity=pro.getProperty("billingCity");
		return billCity;
	}
	
	public String billState() {
		String billState=pro.getProperty("billingState");
		return billState;
	}
	
	public String billZip() {
		String billZip=pro.getProperty("billingZipCode");
		return billZip;
	}
	
	public String billCountry() {
		String billCountry=pro.getProperty("billCountry");
		return billCountry;
	}
	
	public String getdeliverAddrs() {
		String deliverAddrs1=pro.getProperty("deliAddress");
		return deliverAddrs1;
	}
	
	public String getdeliverCity() {
		String deliverCity1=pro.getProperty("deliCity");
		return deliverCity1;
	}
	
	public String getdeliverState() {
		String deliverState1=pro.getProperty("deliState");
		return deliverState1;
	}
	
	public String getdeliveryZip() {
		String deliveryZip=pro.getProperty("deliZipCode");
		return deliveryZip;
	}
	
	public String getdeliverCountry() {
		String deliverCountry1=pro.getProperty("deliCountry");
		return deliverCountry1;
	}
}
