package com.insuranceProject.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class RegisterPage {
//     WebDriver ldriver; 
     
     WebDriver driver = null; 
     
     WebElement element = null ; 
    
//	public RegisterPage(WebDriver  rdriver)
//	{
//		ldriver = rdriver;
//		PageFactory.initElements(rdriver, this);
//	}
	
     public RegisterPage(WebDriver  driver)
     {
    	 this.driver = driver;
     }
     
 	By RegisterBtn1 = By.xpath("//a[@class='btn btn-default' or text()='Register']");
     
	By titlelstt = By.xpath("//select[@id='user_title']");
	
	By firstnameTxt = By.xpath("//input[@id='user_firstname']");
     
     
 	By surnameTxt = By.xpath("//input[@id='user_surname']");
 	
 	By phonenumberTxt = By.xpath("//input[@id='user_phone']");
 	
 	By DOBYr = By.xpath("//select[@id='user_dateofbirth_1i']");
 	
 	By DOBMth= By.xpath("//select[@id='user_dateofbirth_2i']");
 	
 	By DOBDys = By.xpath("//select[@id='user_dateofbirth_3i']");
 	
 	By insuranceTypesTxt = By.xpath("//input[@id='licencetype_t']");
 	
 	By occupationTxt = By.xpath("//select[@id='user_occupation_id']");
 	
 	By staddressTxt = By.xpath("//input[@id='user_address_attributes_street']");
 	
 	By cityTxt = By.xpath("//input[@id='user_address_attributes_city']");
 	
 	By countyTxt = By.xpath("//input[@id='user_address_attributes_county']");
 	
 	By postcodeTxt = By.xpath("//input[@id='user_address_attributes_postcode']");
 	
 	By emailTxt = By.xpath("//input[@id='user_user_detail_attributes_email']");
 	

 	By passwordTxt = By.xpath("//input[@id='user_user_detail_attributes_password']");
 	
 	

 	By confirmtxtpasswordTxt = By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']");
 	
 	
 	By createTxt = By.xpath("//input[@name='submit']");
     
     
     
     
     
     
  /*      
     
	@FindBy(how = How.XPATH, using ="//a[@class='btn btn-default' or text()='Register']")
	@CacheLookup
	WebElement RegisterBtn;
	
	
	@FindBy(how = How.XPATH, using ="//select[@id='user_title']")
	@CacheLookup
	WebElement titleBtn;
	
	@FindBy(how = How.XPATH, using ="//*[@id='user_title']/option")
	@CacheLookup
	WebElement titlelst;
	
	
	
	@FindBy(how = How.XPATH, using ="//input[@id='user_firstname']")
	@CacheLookup
	WebElement firstnameTxt;
	
	@FindBy(how = How.XPATH, using ="//input[@id='user_surname']")
	@CacheLookup
	WebElement surnameTxt;


	@FindBy(how = How.XPATH, using ="//input[@id='user_phone']")
	@CacheLookup
	WebElement txttelephoneno;
	
	
		*/
	@FindBy(how = How.XPATH, using ="//input[@class='button' or text()='Log In']")
	@CacheLookup
	WebElement loginBtn;
	
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Log Out')]")
	@CacheLookup
	WebElement logoutBtn;
	
	@FindBy(how = How.XPATH, using ="//b[contains(text(),'Welcome') or text()='Welcome' ]") 
	@CacheLookup
	WebElement WelcomeMessage;
//	 //b[text()='Welcome']  || //b[contains(text(),'Welcome')]
	
	//      //h3[text()='Register']
	

	
	public void userRegister() throws InterruptedException
	{
		WebElement RegisterBt = driver.findElement(RegisterBtn1);
		RegisterBt.click();
		Thread.sleep(1000);		
		
	}
	public void selectTitle(String tiletxt ) throws InterruptedException
	{
		System.out.println("Title started !!!!!!!!!!!!!!!!!!!!!!!");
		WebElement primUse = driver.findElement(titlelstt);
		
			
	
		if (primUse.getText().contains(tiletxt)) {
			System.out.println("Title  Selected>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			
			primUse.sendKeys(tiletxt);
			Thread.sleep(1100);

		}
		else {
			
		
//		System.out.println(tiletxt);
		System.out.println("Title NOT Selected?????????????????????????");
		}	
//		titleBtn.click();
//		WebElement ele = driver.findElement(By.xpath("//select[@id='user_title']"));
//		Select se = new Select(ele);
//		
//		List orgList = new ArrayList ();
//		
//		List<WebElement> options = se.getOptions();
//		
//		for (WebElement e : options)
//		{
//			
//			orgList.add(e.getText());
//		}
//		
		
		
//		titleBtn.click();
//		Thread.sleep(3000);		
//	List<WebElement> titlelist1 = driver.findElements(By.xpath("//*[@id='user_title']/option"));
//	for (WebElement titletx : titlelist1) {
//		String currentOption = titletx.getText();
		
//		System.out.println(currentOption);
//		titleBtn.click();
//		Thread.sleep(3000);	
//		if (currentOption.contains(tiletxt))
//		{
//			
//			System.out.println(tiletxt);
//			titletx.click();
//			Thread.sleep(1000);	
//			break;
//		
//		}
//		else 
//		{
//			//System.out.println(tiletxt);
//			System.out.println("Title NOT Selected !!!!!!!!!!!!!!!!!!!!!!");
//		}
	}	
	
	
	
	
	public void enterFirstName(String firstname) throws InterruptedException
	{	
		WebElement firstnameBtn = driver.findElement(firstnameTxt);
		firstnameBtn.click();
		Thread.sleep(1000);	
		firstnameBtn.sendKeys(firstname);
		Thread.sleep(1000);
	}
	public void enterSurName(String surname) throws InterruptedException
	{		
		
		WebElement surnameBtn = driver.findElement(surnameTxt);
		surnameBtn.click();
		Thread.sleep(1000);	
		surnameBtn.sendKeys(surname);
		Thread.sleep(1000);
	}
	
	public void customerphoneno(String ctelephoneno) throws InterruptedException {
		WebElement phoneNumber = driver.findElement(phonenumberTxt);
		phoneNumber.sendKeys(ctelephoneno);
		Thread.sleep(1000);
	}
	public void DOB(String year, String Month, String Days) throws InterruptedException 
	{
		WebElement DOBYear = driver.findElement(DOBYr);
		WebElement DOBMonth= driver.findElement(DOBMth);
		WebElement DOBDays= driver.findElement(DOBDys);
		
		DOBYear.sendKeys(year);		
		Thread.sleep(1500);
		DOBMonth.sendKeys(Month);	
		Thread.sleep(1500);
		DOBDays.sendKeys(Days);	
		Thread.sleep(1500);
	}
	
	public void insuranceType(String types) throws InterruptedException {
		WebElement insTypes = driver.findElement(insuranceTypesTxt);
		if (insTypes.getText().contains(types)) {
			System.out.println("Insurance Type   Selected>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			
			insTypes.click();
			Thread.sleep(1500);

		}		
		
	}
	
	public void occupationTypes(String ocutypes) throws InterruptedException {
		WebElement occupTypes = driver.findElement(occupationTxt);
		
		if (occupTypes.getText().contains(ocutypes)) {
			System.out.println("OccupationType  Selected>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			
			occupTypes.sendKeys(ocutypes);
			Thread.sleep(1500);
		}
		
	}
	
	public void streetAddress(String StAddress) throws InterruptedException 
	{
		WebElement stAdd = driver.findElement(staddressTxt);
		stAdd.sendKeys(StAddress);
		Thread.sleep(1500);
	}
	
	public void cityName(String CityNm) throws InterruptedException 
	{
		WebElement city = driver.findElement(cityTxt);
		city.sendKeys(CityNm);
		Thread.sleep(1500);
	}
	public void countyName(String CountyNm) throws InterruptedException
	{
		WebElement county = driver.findElement(countyTxt);
		county.sendKeys(CountyNm);
		Thread.sleep(1500);
	}
	
	public void postCode(String PostCd) throws InterruptedException
{
		WebElement PstCode = driver.findElement(postcodeTxt);
		PstCode.sendKeys(PostCd);
		Thread.sleep(1500);
	}
	public void emailAddress(String emailadd) throws InterruptedException 
	{
		WebElement email = driver.findElement(emailTxt);
		email.sendKeys(emailadd);
		Thread.sleep(1500);
	}
	
public void custpassword(String cpassword, String confirmPass) throws InterruptedException {
		
	    WebElement txtpassword = driver.findElement(passwordTxt);
	    WebElement confirmtxtpassword = driver.findElement(confirmtxtpasswordTxt);
		txtpassword.sendKeys(cpassword);
		Thread.sleep(1500);
		confirmtxtpassword.sendKeys(confirmPass);
		
		Thread.sleep(2500);
		
	}
	public void clickCreate()
	{
		WebElement createBtn = driver.findElement(createTxt);
		createBtn.click();
	}	
	
	public void clickLogout()
	{
		logoutBtn.click();
	}
	
	public  String message()
	{

		String WelcomeTxt = WelcomeMessage.getText();		
		return (WelcomeTxt);
		

	}
}
