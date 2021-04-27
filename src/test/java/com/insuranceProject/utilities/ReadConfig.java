package com.insuranceProject.utilities;

import java.io.File; 
import java.io.FileInputStream;
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
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getFirstName()
	{
	String firstname=pro.getProperty("firstname");
	return firstname;
	}
	
	public String getSurName()
	{
	String surname=pro.getProperty("surname");
	return surname;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

	public String getOperaPath()
	{
	String operapath=pro.getProperty("operapath");
	return operapath;
	}

	public String getUserEmail()
	{
	String usEmail=pro.getProperty("userEmail");
	return usEmail;
	}
	public String getUserPassword()
	{
	String userPass=pro.getProperty("password");
	return userPass;
	}

	
	
	
	
	
	
	
	
	
}
