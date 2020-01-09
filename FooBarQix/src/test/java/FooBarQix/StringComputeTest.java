package FooBarQix;

import org.junit.Test;

import junit.framework.TestCase;

public class StringComputeTest extends TestCase{
	protected StringCompute compute = new StringCompute();
	
	@Test
	public void testExample(){
		String result = compute.getFoo("3");
		assertEquals("Foo", result);
	}

}
