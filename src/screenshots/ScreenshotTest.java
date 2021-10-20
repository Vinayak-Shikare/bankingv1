package screenshots;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	
@Listeners(customlistner.class)

public class ScreenshotTest  extends Base{

	
	@BeforeMethod
	public void Setup()
	{
		initialization();
	}
	
	@AfterMethod(enabled = false)
	public void teardown() {
	
		driver.quit();
	}
	
	@Test
	public void test1() {
		
		Assert.assertEquals(true, true);
	}
}
