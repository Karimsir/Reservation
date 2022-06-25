package ExcelReader;

import org.testng.annotations.Test;

public class TestNGPro {
@Test(priority=1,groups="Smoke")
public void test_setup()
{
	System.out.println("setup");
}
@Test(priority=2,groups="Regression")
public void test_login()
{
	System.out.println("login");
}
@Test(priority=3,groups="Smoke")
public void test_logout()
{
	System.out.println("logout");
}
@Test(priority=4,groups="Regression")
public void test_exit()
{
	System.out.println("exit");
}
}


			
