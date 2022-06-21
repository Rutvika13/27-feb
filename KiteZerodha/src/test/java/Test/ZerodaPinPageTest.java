package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodaLoginPage;
import POM.ZerodaPinPage;
import Utility.Parametrization;

public class ZerodaPinPageTest {
	
		WebDriver driver;

	@BeforeMethod
	public void Launchbrowser() {
		driver =Browser.openBrowser();
	}
	@Test
	public void LoginWithzerodaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		ZerodaLoginPage zerodaLoginPage= new ZerodaLoginPage(driver);
		String username=Parametrization.getData("Sheet",0, 1);
		String password=Parametrization.getData("Sheet",1, 1);
		zerodaLoginPage.enterUserId(username);
		zerodaLoginPage.enterpassword(password);
		zerodaLoginPage.ClickOnLogin();
		Thread.sleep(5000);
		ZerodaPinPage zerodaPinPage= new ZerodaPinPage(driver);
		String pinnumber=Parametrization.getData("Sheet",2, 1);
		zerodaPinPage.enterPin(pinnumber);
		zerodaPinPage.ClickOnContinue();
		
		
}
}
