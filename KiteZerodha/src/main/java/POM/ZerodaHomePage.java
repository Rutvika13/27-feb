package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaHomePage 
{

	 @FindBy(xpath="//input[@id='userid']") private WebElement userId;
	 @FindBy(xpath="//input[@id='password']") private WebElement password;
	 @FindBy(xpath ="//button[@type='submit']")private WebElement Login;
	 @FindBy(xpath="//input[@id='pin']")private WebElement Pin;
	 @FindBy(xpath="//button[@type='submit']")private WebElement Submit;
	 @FindBy(xpath="//input[@type=\"text\"]") private WebElement searchShare;
	 @FindBy(xpath ="(//span[text()='TATAMOTORS'])[1]")private WebElement TATA;
	 @FindBy(xpath="(//button[@type=\"button\"])[1]")private WebElement Buy;
	 @FindBy(xpath ="//span[text()='RELIANCE']")private WebElement Reliance ;
	 @FindBy(xpath ="//label[text()='Regular']")private WebElement Regular; 
	 @FindBy(xpath ="(//input[@type='number'])[1]")private WebElement Qty; 
	 @FindBy(xpath ="(//input[@type='number'])[2]")private WebElement Price;
	 
	 public ZerodaHomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void EnterUserId(String user)
	 {
		 userId.sendKeys(user);
	 }
	 
	 public void EnterPassword(String pass)
	 {
		 password.sendKeys(pass);
	 }
	 
	 public void ClickOnLogin()
	 {
		 Login.click();
	 }
	 
	public void EnterPin(String pin)
	 {
		 Pin.sendKeys(pin);
	 }
	public void ClickOnSubmit()
	 {
		Submit.click();
	 }
	 
	public void EnterSearch(String search)
	 {
		searchShare.sendKeys(search);
	 }
	 
	public void EnterShareName(String Name)
	 {
		TATA.sendKeys(Name);
	 }
	 
	public void ClickOnBuy(String buy)
	 {
		Buy.sendKeys(buy);
	 }

	 public void SearchShare(WebDriver driver)
	 {
		 Actions action= new Actions(driver);
		 action.moveToElement(Reliance);
		 action.perform();
		 action.moveToElement(Buy);
		 action.click();
		 action.perform();
		 
	 }
	 
	 public void ClickOnRegular()
	 {
		Regular.click();
	 }
	 
	 public void Enterqty(String qty)
	 {
		Qty.sendKeys(qty);
	 }
	 
	 public void Enterprice(String price)
	 {
		 Price.clear();
		 Price.sendKeys(price);
		
	 }
	 
}
