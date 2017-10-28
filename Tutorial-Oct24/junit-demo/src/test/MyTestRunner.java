package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(ArithmeticOpsTest.class, RelationalOpsTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.getMessage());
		}
		
		/*Result result2 = JUnitCore.runClasses(RelationalOpsTest.class);
		for (Failure failure : result2.getFailures()) {
			System.out.println(failure.getMessage());
		}*/
	}
}
