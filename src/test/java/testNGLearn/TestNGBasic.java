package testNGLearn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	
	@BeforeClass
	public void bClass()
	{
		System.out.println("This is before class");
	}
	
	@AfterClass
	public void AClass()
	{
		System.out.println("This is after class");
	}
	
	
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("This is before metohd");
	}
	
	@AfterMethod
	public void aMethod()
	{
		System.out.println("This is after metohd");
	}
	
	
	@Test(priority = 1)
	public void testBaisc()
	{
		System.out.println("THis is testNG method 1");
	}
	
	
	@Test(priority = 2)
	public void testBaisc1()
	{
		System.out.println("THis is testNG method 2");
	}
	
	
	@Test(priority = 3)
	public void testBaisc11()
	{
		System.out.println("THis is testNG method 3");
	}
	
	
	@Test(priority = 4)
	public void testBaisc2()
	{
		System.out.println("THis is testNG method 4");
	}
	
	
	
	

}
