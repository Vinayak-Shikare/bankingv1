package listners;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class retrylist {
	
	//test case 1
	@Test()
	public void testsoft() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test started");
		assertion.assertEquals(12,13, "dropdown cout does not match" );//soft assertion
		System.out.println("Test completed");
		assertion.assertAll();//important
		
	}
	
	
	//test case 2
	/*here test case 2 will fail
	 * so retry analyser is used to give chance to test case to run it again
	 * 
	 * @Test(retryAnalyzer = listners.listnerretryanalyser.class) --> Syntax
	 * Annotation(Interface from testng = packagename.classname.class)
	 * but the drawback is we need to right above syntax for all cases if there are around 100 cases
	 */
	@Test//(retryAnalyzer = listners.listnerretryanalyser.class)
	public void testhard()
	{	
		System.out.println("Test1 started");
		Assert.assertEquals(12,13, "dropdown cout does not match" );
		System.out.println("Test1 completed");
	}
	
/* to over come draw back we use annotation transformer which applied on run time 
 * 
 */
	
	
	
}
