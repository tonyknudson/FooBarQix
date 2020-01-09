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
		System.out.println(result);
	}

}
