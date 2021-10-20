package TestNgTutorial2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Sequence if more than 1 cases 
 * @BeforeMethod
 * @Test >>1
 * @AfterMethod
 * 
 *  @BeforeMethod
 * @Test >>2
 * @AfterMethod
 * 
 */
public class anotations {

	//pre-conditions annotation -- starting with before
	@BeforeSuite//in testng suite first preference
	public void setup()
	{
		System.out.println("setup system property forchrome");
	}
	
	@BeforeClass// 3rd preference
	public void launch()
	{
	
		System.out.println("launch the browser");
	}
	
	@BeforeTest// 2nd preference
	public void login()
	{
	
		System.out.println("login to app");
	}
	
	@BeforeMethod// 4th preference
	public void enterrul()
	{
	
		System.out.println("enter url");
	}
	
	//test cases --> test cases starting with @Test
	@Test (priority = 1, groups = "title") // 5th preference
	public void googletitile()
	{
	
		System.out.println("google titile test");
		
	}
	
	@Test(priority = 2, groups = "search")
	public void googlesearch()
	{
	
		System.out.println("google search");
		
	}
	//post conditions --> starting with @After
	@AfterMethod
	public void logout()
	{
		System.out.println("log off app");
	}
	
	@AfterTest 
	public void deletecookies()
	{
		System.out.println("cookies deleted");
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		System.out.println("browser closed");
	}
	
	@AfterSuite
	public void generatereport()
	{
		System.out.println("report generated");
	}
}











