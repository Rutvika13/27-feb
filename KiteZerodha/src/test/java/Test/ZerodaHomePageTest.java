package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodaHomePage;
import Utility.Parametrization;

public class ZerodaHomePageTest 
{

	WebDriver driver;
	
	@BeforeMethod
	
	public void browser() {
		driver =Browser.openBrowser();
		
	}
	@Test
	public void zerodaHomePage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodaHomePage zerodaHomePage =new ZerodaHomePage(driver);
		String username= Parametrization.getData("Sheet", 0,1 );
		zerodaHomePage.EnterUserId(username);
		String Password= Parametrization.getData("Sheet", 1, 1);
		zerodaHomePage.EnterPassword(Password);
		zerodaHomePage.ClickOnLogin();
		Thread.sleep(2000);
		String pinnumber= Parametrization.getData("Sheet", 2,1 );
		zerodaHomePage.EnterPin(pinnumber);
		zerodaHomePage.ClickOnSubmit();
		String ShareName= Parametrization.getData("Sheet", 5,2 );
		zerodaHomePage.EnterSearch(ShareName);
		Thread.sleep(2000);
		zerodaHomePage.SearchShare(driver);
		zerodaHomePage.ClickOnRegular();
		String Qty = Parametrization.getData("Sheet", 6,2 );
		zerodaHomePage.Enterqty(Qty);
		String price=  Parametrization.getData("Sheet", 7,2 );
        zerodaHomePage.Enterprice(price);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
