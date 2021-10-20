package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static void initialization() {
		

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String my_title = driver.getTitle();
		System.out.println("title is " + my_title);
	}
	
	public static void screenshots(WebDriver driver, String image)
	
	{
		
		TakesScreenshot ts =  (TakesScreenshot)  driver;
	      	
	      	File source = ts.getScreenshotAs(OutputType.FILE);
	      	
	      	try {
				FileUtils.copyFile(source,new File("./evidence/" + image+ ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      	
	      	System.out.println("Screenshots is taken successfully");
	}
}
