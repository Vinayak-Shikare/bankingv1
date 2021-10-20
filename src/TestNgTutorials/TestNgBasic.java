package TestNgTutorials;

import org.testng.annotations.Test;

/*Notes on TestNg
 * TestNG provide default report
 * Test is a class in TestNg
 * Here TestNg test run internal XML file
 * @test scripts are run by TESTNG whereas normal java code is run on JVM
 * In TestNG we can give priority to methods to run in particular sequence
 * by default priority is zero & follows alphabetic manner
 * here 3 cases are created in 1 java class 
 * TestNg will have default suite if not mentioned
 * In testng we can give negative priority as well example -3
 * we can give description in testng using description keyword as well
 * A separate folder will created with naming output in testng
 * emailable-report file is consolidated report
 * In default suite folder or folder suite every time script is run a new report is generated
 * Index.html file is used for self analysis of execution status
 * 
 * 
 */
public class TestNgBasic {

	
	@Test(priority = -3, description = " welcome user")
	public void welcometoapps()
	{
		System.out.println("welcome to app");
	}
	
	@Test(priority = 2, description = " login user ")
	public void logintoapps()
	{
		System.out.println("login to app");
	}
	@Test (priority = 3, description = " logout user ")
	public void logoutofapps()
	{
		System.out.println("logoff to app");
	}
}
	
