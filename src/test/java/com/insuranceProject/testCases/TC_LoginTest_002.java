package com.insuranceProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.insuranceProject.pageObjects.LoginPage;



public class TC_LoginTest_002 extends BaseClass{
	
	
	
	
	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			logger.info("URL is Opened");  
			driver.navigate().refresh();
			
			 LoginPage lp = new LoginPage(driver);  //creating object of Login Page      
		        
			 lp.setUseremail(userEmail);
			 logger.info("Entered username");
			 lp.setPassword(password);
			 logger.info("Entered password");
			 lp.clickSubmit();
			 Thread.sleep(2000);
    

			 if (lp.message()== true){
					Assert.assertTrue(true);			
					logger.info("Login test passed");					
				} else {					
					captureScreen(driver, "loginTest");
					Assert.assertTrue(false);
					logger.info("Login test failed");
					
				}
				
    
	}

}
