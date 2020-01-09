package FooBarQix;

import org.junit.Test;

import junit.framework.TestCase;

public class StringComputeTest extends TestCase{
	protected StringCompute compute = new StringCompute();
	
	@Test
	public void test_checkDivisor(){
		String result = compute.checkDivisor("3");
		assertEquals("Foo", result);
	}
	
	@Test
	public void test_numbers() {
		String result = compute.doMain("21");
		assertEquals("FooQix",result);
		result = compute.doMain("8");
		assertEquals("8", result);
		result = compute.doMain("13");
		assertEquals("Foo", result);
	}

}
