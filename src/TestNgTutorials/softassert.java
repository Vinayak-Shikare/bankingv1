package TestNgTutorials;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {

	/*soft assert-->if any validation fails it will continue the rest of the script & once script 
	 * completes then it fails test
	 * it means even if single validation fails script will be failed at last but execution will not 
	 * stop
	 * do not forget to call assertAll() method at last
	 * for soft assert we have separate class called soft assert 
	 * To use soft assert we need to create object for it
	 * 
	 * Examples of Assert Command
	 * 	1.assertTitle
	 * 	2.assertAttribute
	 * 	3.assertElementPresent
	 */
	
	@Test//(enabled = false)
	public void testsoft() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test started");
		assertion.assertEquals(12,13, "dropdown cout does not match" );//soft assertion
		System.out.println("Test completed");
		assertion.assertAll();//important
		
	}
}
