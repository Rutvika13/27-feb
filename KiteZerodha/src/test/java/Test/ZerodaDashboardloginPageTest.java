package Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;


import POJO.Browser;
import POM.ZerodaDashboardloginPage;
import POM.ZerodaLoginPage;
import POM.ZerodaPinPage;



import Utility.Parametrization;


public class ZerodaDashboardloginPageTest {
WebDriver driver;
	@BeforeMethod
	public void browser() {
		 driver = Browser.openBrowser();	
	}
	@Test
	public void purchaseShareACC() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodaLoginPage zerodhaloginPage = new ZerodaLoginPage(driver);
		String userName= Parametrization.getData("Sheet",0, 1);
		String password = Parametrization.getData("Sheet",1, 1);
		zerodhaloginPage.enterUserId(userName);
		zerodhaloginPage.enterpassword(password);;
		zerodhaloginPage.ClickOnLogin();
		Thread.sleep(2000);
		ZerodaPinPage zerodhaPinpage = new ZerodaPinPage(driver);
		String pinSubmit =	Parametrization.getData("Sheet",2, 1);
	    zerodhaPinpage.enterPin(pinSubmit);
		zerodhaPinpage.ClickOnContinue();
		Thread.sleep(2000);
		ZerodaDashboardloginPage dashboardZerodha = new ZerodaDashboardloginPage(driver);
		String shares =Parametrization.getData("Sheet",5, 1);
		dashboardZerodha.EnterShareName(shares);;
		Thread.sleep(2000);
		dashboardZerodha.SelectShare(driver);
		Thread.sleep(2000);
		dashboardZerodha.SelectRegularShare();
		
		String QTY = Parametrization.getData("Sheet",6, 1);
		dashboardZerodha.ShareQuantity(QTY);
		
		String pricee = Parametrization.getData("Sheet",7, 1);
		dashboardZerodha.enterPrice(pricee);
		dashboardZerodha.BUYshare();
		

	}
	
}

