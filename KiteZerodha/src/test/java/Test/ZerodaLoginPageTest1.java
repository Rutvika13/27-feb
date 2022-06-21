package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodaLoginPage;
import Utility.Parametrization;

public class ZerodaLoginPageTest1
{
	WebDriver driver;

@BeforeMethod
public void browser() {
	driver =Browser.openBrowser();
}
@Test
public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException
{
	ZerodaLoginPage zerodaLoginPage= new ZerodaLoginPage(driver);
	String username=Parametrization.getData("Sheet",0, 1);
	String password=Parametrization.getData("Sheet",1, 1);
	zerodaLoginPage.enterUserId(username);
	zerodaLoginPage.enterpassword(password);
	zerodaLoginPage.ClickOnLogin();
}
@Test
public void ForgotpasswordTest()
{
	ZerodaLoginPage zerodaLoginPage= new ZerodaLoginPage(driver);
	zerodaLoginPage.ClickOnForgotpassword();
	
}
@Test
public void SignupLinkTest() {
ZerodaLoginPage zerodaLoginPage= new ZerodaLoginPage(driver);
zerodaLoginPage.ClickOnSignUp();

}


























}
