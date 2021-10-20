package TestNgTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting {
	WebDriver driver;//global variable

	/*we can perform cross browser testing and parallel execution using testng xml file
	 * to generate testng xml right click project>testng>convert to testng
	 * with xml file pass the parameter and can perform cross browser testig
	 * @parameters annotation is used to pass parameters
	 * Syntax to pass multiple parameter:
	 * @parameters({"parameter 1", " parameter 2"})
	 */
	@Test
	@Parameters("browser")
	public void verifypagetitle(String browser) {
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String my_title = driver.getTitle();
	System.out.println("title is " + my_title);
	driver.quit();
	
}
}


