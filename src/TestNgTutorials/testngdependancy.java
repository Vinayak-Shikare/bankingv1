package TestNgTutorials;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testngdependancy {
	
	WebDriver driver;
	
/*testng allows us to create dependency (dependsonmethods & dependsongroups) over method or cases
 * i.e with this if 1 case fails all dependent cases fail
 * it also allows to have group dependency
 * i.e. in real time either it should skip or not get executed 
 * we can give multiple dependency also in testng
 * 
 * 
 * 
 * 
 */
	@Test(priority = -1)
	public void startapp()
	{
		
		Assert.assertEquals(12,13);//forcefully failing the case to check dependency 
		System.out.println("start the app");
	}
	
	@Test(dependsOnMethods = "startapp")//single dependency
	public void loginapp()
	{
		
		System.out.println("login the app");
	}
	
	@Test(dependsOnMethods = {"loginapp","startapp"})//multiple dependency
	public void logapp()
	{
		System.out.println("logout the app");
	}
	
	@AfterMethod //using this annotation the below method will run after every method
	public void closeapp()
	{
		driver.close();
	}
}

