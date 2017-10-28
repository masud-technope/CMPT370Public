package test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestFields {

	// @Parameter(0)
	public int m1;
	// @Parameter(1)
	public int m2;
	// @Parameter(2)
	public int result;

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2, 2 }, { 5, 2, 10 },
				{ 8, 9, 72 } };
		return Arrays.asList(data);
	}

	public ParameterizedTestFields(int m1, int m2, int result) {
		// TODO Auto-generated constructor stub
		this.m1 = m1;
		this.m2 = m2;
		this.result = result;
	}

	@Test
	public void testMultiplyException() {
		MyClass tester = new MyClass();
		assertEquals("Result", result, tester.multiply(m1, m2));
	}

	class MyClass {
		public int multiply(int i, int j) {
			return i * j;
		}
	}
}
