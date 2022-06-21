package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaPinPage 
{
	@FindBy(xpath="//input[@id='pin']")private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement Submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement Forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement SignUp;

public ZerodaPinPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void enterPin(String pin) {
Pin.sendKeys(pin);
}
 

public void ClickOnContinue() {
Submit.click();
}

public void ClickOnForgot() {
Forgot.click();
}

public void ClickOnSignUp() {
SignUp.click();
}

}