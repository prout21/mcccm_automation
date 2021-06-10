package Mccm.Pega.DMP.RealTime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mccm.Pega.Outbound.PegaTestBase.TestBase;

public class LoginPageDMPRealTime extends TestBase {
	//page factory - OR:
	
	@FindBy(xpath="//input[@id='txtUserID']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath="//span[@class='loginButtonText']")
	WebElement loginbtm;
	
	@FindBy(xpath="//a[@id='appview-nav-toggle-one']")
	WebElement Homepage;
	//@FindBy(xpath="(//i[@class='pi pi-caret-down'])[2]")
	@FindBy(xpath="//a[@title='Launch web interface']")
	WebElement Pegalunch;

  
	 
    public LoginPageDMPRealTime()
    {
    	PageFactory.initElements(driver, this);
    }
    			
   
    public PegaMarktDMPRealTime login(String uid,String pwd)
    {
    	username.sendKeys(uid);
    	password.sendKeys(pwd);
    	loginbtm.click();
    	return new PegaMarktDMPRealTime();    	
    	    }
    
    public PegaMarktDMPRealTime Pegamrklunch3()throws InterruptedException {
		
	     Actions  action = new Actions(driver);
	     action.moveToElement(Pegalunch).click().build().perform();
	     Thread.sleep(2000);
	   	  return new PegaMarktDMPRealTime();
	   }
    
}
