package listners;

import java.lang.reflect.Constructor; 
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class mytransformer implements IAnnotationTransformer{

	//maintain this format for method creation because this is overridden method
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testmethod) {
		
		annotation.setRetryAnalyzer(listnerretryanalyser.class);
		
	}
}
