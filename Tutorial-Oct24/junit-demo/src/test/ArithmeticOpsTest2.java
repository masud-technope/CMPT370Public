package test;

import static org.junit.Assert.*;
import jdk.nashorn.internal.ir.annotations.Ignore;
import main.ArithmeticOps;

import org.junit.Test;

public class ArithmeticOpsTest2 {

	@Test
	public void testAdd() {
		ArithmeticOps tester = new ArithmeticOps();
		assertEquals("5 + 5 should be 10", 10, tester.add(5, 5));
	}

	@Test
	public void testSubtract() {
		ArithmeticOps tester = new ArithmeticOps();
		assertEquals("5 - 5 should be 0", 0, tester.subtract(5, 5));
	}

	
	@Test
	public void testMultiply() {
		ArithmeticOps tester = new ArithmeticOps();
		assertEquals("5 * 5 should be 25", 25, tester.multiply(5, 5));
	}

	@Test
	public void testDivide() {
		ArithmeticOps tester = new ArithmeticOps();
		assertEquals("5 / 5 should be 1", 1, tester.divide(5, 5));
	}

}
