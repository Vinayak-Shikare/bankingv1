package TestNgTutorial2;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class testngfeatures {
 //invocation count is used to run case number of times
//without try and catch block we can handle exceptions by using "expectedException" key word
	@Test(invocationCount = 10)//here TC runs 10 times
	public void logintest()
	{
		System.out.println("login the application");
	}
	
	@Test(dependsOnMethods = "logintest")
	public void homepage()
	{
		System.out.println("homepage");
	}
	
	@Test(expectedExceptions = ElementNotFoundException.class)//handling exception
	public void page()
	{
		System.out.println("homepage");
	}
}
