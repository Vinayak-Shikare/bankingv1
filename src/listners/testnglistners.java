package listners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

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
















