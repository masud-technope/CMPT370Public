package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import main.ArithmeticOps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamterizedTest {

	@Parameter(0)
	public int m1;
	@Parameter(1)
	public int m2;
	@Parameter(2)
	public int result;

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] datacoll = new Object[][] { { 1, 2, 2 }, { 5, 2, 10 },
				{ 8, 9, 72 }, { 10, 2, 20 } };
		return Arrays.asList(datacoll);
	}
	
	@Test
	public void testMultiply()
	{
		ArithmeticOps tester=new ArithmeticOps();
		assertEquals(m1+"*"+m2+" should be "+m1*m2, result, tester.multiply(m1, m2));
	}

}
