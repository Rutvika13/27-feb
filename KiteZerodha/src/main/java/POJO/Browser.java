package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Browser {

	public static WebDriver openBrowser()
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","E:\\\\Kalyani\\\\chromedriver_win32 (2) update\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		return driver;
	}
	
}