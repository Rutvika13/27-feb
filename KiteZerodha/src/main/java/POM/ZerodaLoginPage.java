package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaLoginPage 
{
 @FindBy(xpath="//input[@id='userid']") private WebElement userId;
 @FindBy(xpath="//input[@id='password']") private WebElement password;
 @FindBy(xpath ="//button[@type='submit']")private WebElement Login;
 @FindBy(xpath ="//a[text()='Forgot user ID or password?']")private WebElement Forgot;
 @FindBy(xpath ="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement SignUp;


public ZerodaLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void enterUserId(String user) {
	userId.sendKeys(user);
}

public void enterpassword(String pass) {
	password.sendKeys(pass);
}

public void ClickOnLogin() {
	Login.click();
}

public void ClickOnForgotpassword() {
	Forgot.click();
}

public void ClickOnSignUp() {
	SignUp.click();
}

}