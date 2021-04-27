package com.insuranceProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver; 
	

	public LoginPage(WebDriver  rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how = How.XPATH, using ="//input[@id='email']")
	@CacheLookup
	WebElement UserEmailTxt;
	
	@FindBy(how = How.XPATH, using ="//input[@name='password']")
	@CacheLookup
	WebElement passwordTxt;
	
	
	@FindBy(how = How.XPATH, using ="//input[@name='submit'] ")
	@CacheLookup
	WebElement loginBtn;	
	
	
	@FindBy(how = How.XPATH, using ="//input[@class='btn btn-danger']") 
	@CacheLookup
	WebElement LoginMessage;
//	 //b[text()='Welcome']  || //b[contains(text(),'Welcome')]
	
	//       //input[@class='btn btn-danger'  or text()='Log out']
	
	// using ="//b[contains(text(),'Signed in as')or text()='Signed in as']") 
	
	
	public void setUseremail(String uemail) throws InterruptedException
	{
		UserEmailTxt.click();
		Thread.sleep(1200);		
		UserEmailTxt.sendKeys(uemail);
	}
	
	public void setPassword(String pwd) throws InterruptedException
	{
		passwordTxt.click();
		Thread.sleep(1200);
		passwordTxt.sendKeys(pwd);
	}
	
	
	public void clickSubmit() throws InterruptedException
	{
		loginBtn.click();
		Thread.sleep(3000);
	}
	
	public  boolean message()
	{
	
		if(LoginMessage.isDisplayed()) {
			return true;
		}
		return false;
		
		
		
		

	}
}
