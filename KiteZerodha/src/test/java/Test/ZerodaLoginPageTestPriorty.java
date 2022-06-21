package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZerodaLoginPageTestPriorty {
	@Test(priority =1,timeOut=1000)
	public void test1() throws InterruptedException
	{
		//Thread.sleep(2000);
	 System.out.println("Test1 Executed");
	}

	@Test (invocationCount=2)
	public void test2()
	{
	 System.out.println("Test2 Executed");
	}
	@Test (enabled = false)
	public void test3()
	{
	 System.out.println("Test3 Executed");
	}
	@Test (dependsOnMethods={"test1"})
	public void test4()
	{
	 System.out.println("Test4 Executed");
	}
	
	@BeforeMethod
	public void beforementhod()
	{
		System.out.println("Before method Executed");
	}
	
	
	@AfterMethod
	public void Afterementhod()
	{
		System.out.println("Aefore method Executed");
	}
}
