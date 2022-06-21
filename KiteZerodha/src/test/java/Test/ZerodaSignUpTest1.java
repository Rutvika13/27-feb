
package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodaSignUpPage;
import Utility.Parametrization;

public class ZerodaSignUpTest1 
{


	WebDriver driver;

@BeforeMethod
public void Launchbrowser() 
{
	driver =Browser.openBrowser();
}

  @Test
  public void SignupTest1() throws InterruptedException, EncryptedDocumentException, IOException	{
 ZerodaSignUpPage zerodaSignUpPage1= new  ZerodaSignUpPage(driver);
 zerodaSignUpPage1.ClickOnSignUp();
 zerodaSignUpPage1.SwitchWindow(driver);
 Thread.sleep(5000);
String number=Parametrization.getData("Sheet", 3, 1);
Thread.sleep(5000);
 zerodaSignUpPage1.EnterMobileNumber(number);
 System.out.println(number);
 zerodaSignUpPage1.ClickOnContinue();
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
// 
// 
// String number=Parametrization.getData("Sheet", 3, 1);
// zerodaSignUpPage1.ClickOnSignUpPage();
// Thread.sleep(2000);
// String SignUpNow =driver.getWindowHandle();
// zerodaSignUpPage1.entersignUpNow(number);
// zerodaSignUpPage1.entersignUpNow(SignUpNow);
//zerodaSignUpPage1.ClickOnContinue();
  }
	
	
	
	



}
