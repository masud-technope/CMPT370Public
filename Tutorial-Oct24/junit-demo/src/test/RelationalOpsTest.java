package test;

import static org.junit.Assert.assertTrue;
import jdk.nashorn.internal.ir.annotations.Ignore;
import main.RelationalOps;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RelationalOpsTest {

	@Test
	public void testEqual() {
		RelationalOps tested = new RelationalOps();
		assertTrue("5==5 should be true", tested.isEqual(5, 5));
		assertTrue("5!=6 should be true", tested.isNotEqual(5, 6));
	}

	@Test
	public void testLessOrGreater() {
		RelationalOps tested = new RelationalOps();
		assertTrue("5<10 should be true", tested.isLess(5, 10));
		assertTrue("50>10 should be true", tested.isGreater(50, 10));
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("This should run before RelationalOpsTest");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("This should run after RelationalOpsTest");
	}
}
