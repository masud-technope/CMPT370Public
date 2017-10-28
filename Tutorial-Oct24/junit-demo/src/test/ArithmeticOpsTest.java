package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import jdk.nashorn.internal.ir.annotations.Ignore;
import main.ArithmeticOps;
import main.RelationalOps;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmeticOpsTest {

	ArithmeticOps tested;
	ArithmeticOps tester2;// = new ArithmeticOps();
	RelationalOps tested3;
	
	public void setUp() {
		this.tested = new ArithmeticOps();
	}

	public void tearDown() {
		System.gc();
	}

	public void testadd() {
		assertEquals("10 + 10 must be 20", 20, tested.add(10, 10));
	}

	@Before
	public void beforeMethod() {
		System.out.println("This should run before each test");
		this.tested=new ArithmeticOps();
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This should run before each test class");
	}

	@After
	public void afterMethod() {
		System.out.println("This should run after each test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("This should run after each test class");
	}

	@Ignore
	//@Test(expected = Exception.class)
	public void testExceptionThrows() {
		ArithmeticOps tested = new ArithmeticOps();
		tested.dividePoor(10, 0);
	}

	@Ignore
	// @Test(timeout = 100)
	public void testDelay() {
		ArithmeticOps tested = new ArithmeticOps();
		tested.makeDelay();
	}

	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {
		// assert statements
		ArithmeticOps tested = new ArithmeticOps();
		assertEquals("10 x 0 must be 0", 0, tested.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, tested.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, tested.multiply(0, 0));
	}

	@Test
	public void divideByZeroShouldReturnNothing() {
		ArithmeticOps tested = new ArithmeticOps();
		assertEquals("10 / 0 must be ", 10, tested.divide(10, 0));
		assertEquals("0 / 10 must be ", 0, tested.divide(0, 10));
		assertEquals("2 / 5 must be ", 0, tested.divide(2, 5));
	}

	@Test
	public void testMiscellaneousOperations() {
		// fail("This method will be failed automatically!");
		assertTrue(5 != 6);
		assertFalse(5 != 5);
		assertNull(tester2);
		assertNotNull(tested);
		assertSame("They are the same", tester2, tester2);
		assertNotSame("They are not the same",tested, tester2);
	}
}
