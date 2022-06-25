package ExcelReader;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleClass {
@AfterSuite
public void aftersuite()
{
	System.out.println("after suite");
}
@BeforeSuite
public void beforesuite()
{
	System.out.println("before suite");
}
@AfterTest
public void aftertest()
{
	System.out.println("after test");
}
@BeforeTest
public void beforetest()
{
	System.out.println("before test");
}
@AfterClass
public void afterclass()
{
	System.out.println("during class closing");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("during class loading");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("after every test method");
}
@BeforeMethod 
public void beforemethod()
{
	System.out.println("before every test method");
}
@Test
public void testmethod()
{
	System.out.println("test method");
}
@Test
public void testmethod2()
{
	System.out.println("test method2");
	
}
}
