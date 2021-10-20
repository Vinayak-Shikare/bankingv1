package TestNgTutorials;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionintestng {

	/*Assert is a simple class in Selenium which helps to validate our results
	 * Assert help for assertion in selenium
	 * if assertion fails it throws assertion error not exception
	 * there are two types 1. hard assert & 2.soft assert
	 * hard assert ->>If even 1 assert statement  is failing it will stop execution
	 *  & terminate program & rest of line are not executed
	 *  Assert.assertTrue(true) is used to test on condition base also
	 *  below is Hard assert example
	 */
	
	@Test 
	public void test1()
	{	
		System.out.println("Test1 started");
		Assert.assertEquals(12,13, "dropdown cout does not match" );
		System.out.println("Test1 completed");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 started");
		Assert.assertEquals("hello","hello", "words does not match" );
		System.out.println("Test2 completed");

	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3 started");
		String mystr = "vinay";
		Assert.assertTrue(mystr.contains("s"));
		System.out.println("mystr verified");
		System.out.println("Test2 completed");
	}
}
