package TestNgTutorials;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyerrormsg {

	/*using getText() we can capture text & it will return in string format
	 * using getAttribute() method also we can capture inner HTML which will return the 
	 * inner text & will return string message
	 * 
	 * 
	 */

	
	WebDriver driver; 
	@Test
	public void errormsg() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\"][1]")).click();
		Thread.sleep(2000);
		
		String actual_error = driver.findElement(By.className("o6cuMc")).getText();
		//String actual_error = driver.findElement(By.className("o6cuMc")).getAttribute("innerHTML");
		String expected_error = "Enter an email or phone number";
		assertEquals(actual_error, expected_error);
		System.out.println("inner html is " + actual_error);
		driver.close();
	}
	
	/*@AfterMethod
	public void run() 
	{
		
	}*/
}
