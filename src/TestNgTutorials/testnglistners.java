package TestNgTutorials;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*Listeners are the very important features of testng which allows you to customize logs
 * or reports of testng
 * as the name says it listen to certain events and behave accordingly
 * we can fully customize the log using listeners
 */

/*Types of listeners in testng
 * there are several interfaces that allows you to modify TESTNG BEHAVIOUR
 * these interfaces are broadly called "testng listeners" 
 * examples:
 * 1. |Annotation Transformer
 * 2. |Annotation Transformer2
 * 3. |Hookable
 * 4. |InvokeMethodListener
 * 5. |reporter
 * 6. |SuiteListner
 * 7. |TestListener(doc, JavaDoc)
 */

/*Different ways to implement
 * 1. we can either extend "TestListnerAdapter" Class
 * 2.We can implement interface "ITestListner" which has certain methods
 * which we have to implement
 */

/*ITestListner Implementation Two Ways:
 * 1. We can implement on class level
 * 2. we can implement on suite level
 */
public class testnglistners implements ITestListener{

	@Override
	public void onFinish(ITestContext results) {
		
		
	}

	@Override
	public void onStart(ITestContext results) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult results) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult results) {
		
		System.out.println("test failed & details are" + results.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult results) {
		System.out.println("test skipped & details are" + results.getName());
		
	}

	@Override
	public void onTestStart(ITestResult results) {
		System.out.println("test started & details are" + results.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult results) {
		
		System.out.println("test success & details are" + results.getName());
	}
	
	

	
}
















