package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZerodaLoginPageTest
{
	@Test //2
	public void test1()
	{
	 System.out.println("Test1 Executed");
	}
	
	@Test//
	public void test2()
	{
		System.out.println("test2 Executed");
	}
	@BeforeClass//
	public void beforeclass()
	{
		System.out.println("Beforeclass Executed");
	}
	@AfterClass//
	public void afterclass()
	{
		System.out.println("Afterclass Executed");
	}

	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test Executed");
	}
	
	@AfterTest//4
	public void aftertest()
	{
		System.out.println("After test Executed ");
	}
   @BeforeMethod
   public void beforemethod()
   {
	   System.out.println("Before Method Executed");
   }
   @AfterMethod
   public void aftermethod()
   {
	   System.out.println("After method Executed");
   }

}
