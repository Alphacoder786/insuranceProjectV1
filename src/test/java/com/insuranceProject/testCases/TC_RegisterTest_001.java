package com.insuranceProject.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.insuranceProject.pageObjects.RegisterPage;

public class TC_RegisterTest_001 extends BaseClass{
	


	@Test
	public void RegisterTest() throws IOException, InterruptedException 
	{
		
		logger.info("URL is Opened");  
        driver.navigate().refresh();
		
		RegisterPage rg = new RegisterPage(driver);
		rg.userRegister();
		logger.info("Register Page Opened");
		rg.selectTitle("Sir");
		rg.enterFirstName("Arbin");
		rg.enterSurName("Pradhan");
		rg.customerphoneno("404-285-8899");
		rg.DOB("1986", "July", "24");
		rg.insuranceType("Full");
		rg.occupationTypes("Doctor");
		rg.streetAddress("425 Wallst");
		rg.cityName("New York");
		rg.countyName("NY County");
		rg.postCode("20020");
//		String email=randomestring()+"@gmail.com";
		rg.emailAddress("Testyou@gmail.com");
		rg.custpassword("Test1234", "Test1234");
		rg.clickCreate();
		
		
	
	}

}
