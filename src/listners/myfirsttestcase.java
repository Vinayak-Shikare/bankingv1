package listners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
/*here we are implementing listeners at class level
 * Listeners help to generate logs for the test cases
 * Recommended to implement listeners are at suite level
 * at suite level we can do it by using xml
 * 
 */
//@Listeners(listners.testnglistners.class)
public class myfirsttestcase {

	 
	@Test(priority = -1)
	public void googletitle() 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String my_title = driver.getTitle();
		System.out.println("title is " + my_title);
		driver.close();
		
	}
	
	@Test
	public void dummy()
	{
		System.out.println("dummy");
		Assert.assertTrue(false);
	}
}
