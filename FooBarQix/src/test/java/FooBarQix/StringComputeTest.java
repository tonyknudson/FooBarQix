package FooBarQix;

import org.junit.Test;

import junit.framework.TestCase;

public class StringComputeTest extends TestCase {
	protected StringCompute compute = new StringCompute();

	@Test
	public void test_checkDivisor() {
		String result = compute.checkDivisor("3");
		assertEquals("Foo", result);
	}
	
	@Test
	public void test_numbers() {
		assertEquals("1", compute.doMain("1"));
		assertEquals("2", compute.doMain("2"));
		assertEquals("FooFoo", compute.doMain("3"));
		assertEquals("4", compute.doMain("4"));
		assertEquals("BarBar", compute.doMain("5"));
		assertEquals("Foo", compute.doMain("6"));
		assertEquals("QixQix", compute.doMain("7"));
		assertEquals("8", compute.doMain("8"));
		assertEquals("Foo", compute.doMain("13"));
		assertEquals("FooQix", compute.doMain("21"));
	}

}
