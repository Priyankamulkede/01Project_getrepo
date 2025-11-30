package d1_1sep2025;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void bsuit()
	{
		System.out.println("B4 Suite method");
	}
	@BeforeTest
	public void btest()
	{
		System.out.println("B4 test method");
	}
	@BeforeClass
	public void bclass()
	{
		System.out.println("B4 Class method");
	}
	
	public void test()
	{
		System.out.println("test1 method");
	}
	@Test
	public void test2()
	{
		System.out.println("test2 method");
	}
	@Test
	public void test3()
	{
		System.out.println("test3 method");	
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void aclass()
	{
		System.out.println("After class");
	}
	@AfterTest
	public void atest()
	{
		System.out.println("After test");
	}
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("B4 method method");
	}
	@Test
	@AfterSuite
	public void asuite()
	{
		System.out.println("After test");
	}
}
