package com.guru.utilities;

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
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception is: " + e.getMessage());
		}
	}
	
	public String getAppURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getIE()
	{
		String iePath = pro.getProperty("iepath");
		return iePath;
	}
	
	public String getChrome()
	{
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}

	public String getFF()
	{
		String ffPath = pro.getProperty("ffpath");
		return ffPath;
	}
	
	public String getUsername()
	{
		String userName = pro.getProperty("uname");
		return userName;
	}
	
	public String getPasword()
	{
		String password = pro.getProperty("pwd");
		return password;
	}
	
	public String getCustName()
	{
		String custName = pro.getProperty("name");
		return custName;
	}
	
	public String getbirthMonth()
	{
		String birthMonth = pro.getProperty("mm");
		return birthMonth;
	}
	
	public String getbirthDate()
	{
		String birthDate = pro.getProperty("dd");
		return birthDate;
	}
	
	public String getbirthYear()
	{
		String birthYear = pro.getProperty("yyyy");
		return birthYear;
	}
	
	public String getcustAddrs()
	{
		String custAddrs = pro.getProperty("addrs");
		return custAddrs;
	}
	
	public String getcustCity()
	{
		String city = pro.getProperty("custCity");
		return city;
	}
	
	public String getCustState()
	{
		String custoState = pro.getProperty("custState");
		return custoState;
	}
	
	public String getCustPIN()
	{
		String pin = pro.getProperty("custPIN");
		return pin;
	}
	
	public String getCustCell()
	{
		String phone = pro.getProperty("custCell");
		return phone;
	}
	
	public String getEmail()
	{
		String email = pro.getProperty("emailID");
		return email;
	}
	
	public String getCustPassword()
	{
		String custPWD = pro.getProperty("custPass");
		return custPWD;
	}
	
	public String getCustID()
	{
		String custId = pro.getProperty("cID");
		return custId;
	}
}
