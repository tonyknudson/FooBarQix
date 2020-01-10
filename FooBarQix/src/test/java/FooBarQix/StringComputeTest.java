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
	
	public void test_stars() {
		assertEquals("1*1", compute.calculateOutput(101));
		assertEquals("Foo*FooFoo", compute.calculateOutput(303));
		assertEquals("FooBarQix*Bar", compute.calculateOutput(105));
		assertEquals("FooQix**", compute.calculateOutput(10101));
	}
	
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
		assertEquals("Foo", compute.calculateOutput(9));
		assertEquals("Bar*", compute.calculateOutput(10));
		assertEquals("Foo", compute.calculateOutput(13));
		assertEquals("FooBarBar", compute.calculateOutput(15));
		assertEquals("FooQix", compute.calculateOutput(21));
		assertEquals("FooFooFoo", compute.calculateOutput(33));
		assertEquals("FooBar", compute.calculateOutput(51));
		assertEquals("BarFoo", compute.calculateOutput(53));
	}

}
