package TestNgTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifytitle {

	@Test
	
	public void verifyapp() { 
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String my_title = driver.getTitle();
		System.out.println("title is " + my_title);
		
		String expected_title = "Google";
		//Assert.assertEquals(my_title, expected_title); one way to verify
		Assert.assertTrue(my_title.contains(expected_title)); //second way of verifying title
		System.out.println("test completed");
		driver.quit();
	}
}
