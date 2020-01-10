package FooBarQix;

import org.junit.Test;

import junit.framework.TestCase;

public class StringComputeTest extends TestCase {
	protected StringCompute compute = new StringCompute();

	@Test
	public void test_checkDivisor() {
		String result = compute.checkDivisor(3);
		assertEquals("Foo", result);
	}
	
	/*
	 * 0, null, negatives
	 */
	
	@Test
	public void test_numbers() {
		assertEquals("1",compute.calculateOutput(1));
		assertEquals("2",compute.calculateOutput(2));
		assertEquals("FooFoo", compute.calculateOutput(3));
		assertEquals("4", compute.calculateOutput(4));
		assertEquals("BarBar", compute.calculateOutput(5));
		assertEquals("Foo", compute.calculateOutput(6));
		assertEquals("QixQix", compute.calculateOutput(7));
		assertEquals("8", compute.calculateOutput(8));
		assertEquals("Foo", compute.calculateOutput(13));
		assertEquals("FooQix", compute.calculateOutput(21));
	}

}
