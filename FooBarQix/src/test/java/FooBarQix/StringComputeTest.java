package FooBarQix;

import org.junit.Test;

import junit.framework.TestCase;

public class StringComputeTest extends TestCase {
	protected StringCompute compute = new StringCompute();

	@Test
	public void test_checkDivisor() {
		assertEquals("CheckDivisor input 1","", compute.checkDivisor(1));
		assertEquals("CheckDivisor input 3","Foo", compute.checkDivisor(3));
		assertEquals("CheckDivisor input 5","Bar", compute.checkDivisor(5));
		assertEquals("CheckDivisor input 7","Qix", compute.checkDivisor(7));
	}
	
	@Test
	public void test_contains() {
		assertEquals("CheckDivisor input 1","", compute.checkContains(1));
		assertEquals("CheckDivisor input 3","Foo", compute.checkContains(3));
		assertEquals("CheckDivisor input 5","Bar", compute.checkContains(5));
		assertEquals("CheckDivisor input 7","Qix", compute.checkContains(7));	
		assertEquals("CheckDivisor input 33","FooFoo", compute.checkContains(33));
		assertEquals("CheckDivisor input 55","BarBar", compute.checkContains(55));
		assertEquals("CheckDivisor input 77","QixQix", compute.checkContains(77));	
	
	}
	
	@Test
	public void test_zeroes() {
		assertEquals("CheckZeroes input 30, false","3*", compute.checkZeroes("30", false));
		assertEquals("CheckZeroes input 50, false","5*", compute.checkZeroes("50", false));
		assertEquals("CheckZeroes input 70, false","7*", compute.checkZeroes("70", false));	
		assertEquals("CheckZeroes input 100, false","1**", compute.checkZeroes("100", false));
		assertEquals("CheckZeroes input 30, true","*", compute.checkZeroes("30", true));
		assertEquals("CheckZeroes input 50, true","*", compute.checkZeroes("50", true));
		assertEquals("CheckZeroes input 70, true","*", compute.checkZeroes("70", true));	
		assertEquals("CheckZeroes input 100, true","**", compute.checkZeroes("100", true));	
	}
	
	public void test_stars() {
		assertEquals("Test input 101","1*1", compute.calculateOutput(101));
		assertEquals("Test input 303","Foo*FooFoo", compute.calculateOutput(303));
		assertEquals("Test input 105","FooBarQix*Bar", compute.calculateOutput(105));
		assertEquals("Test input 10101","FooQix**", compute.calculateOutput(10101));
	}
	
	@Test
	public void test_numbers() {
		assertEquals("Test input 0","FooBarQix*", compute.calculateOutput(0));
		assertEquals("Test input 1","1",compute.calculateOutput(1));
		assertEquals("Test input 2","2",compute.calculateOutput(2));
		assertEquals("Test input 3","FooFoo", compute.calculateOutput(3));
		assertEquals("Test input 4","4", compute.calculateOutput(4));
		assertEquals("Test input 5","BarBar", compute.calculateOutput(5));
		assertEquals("Test input 6","Foo", compute.calculateOutput(6));
		assertEquals("Test input 7","QixQix", compute.calculateOutput(7));
		assertEquals("Test input 8","8", compute.calculateOutput(8));
		assertEquals("Test input 9","Foo", compute.calculateOutput(9));
		assertEquals("Test input 10","Bar*", compute.calculateOutput(10));
		assertEquals("Test input 13","Foo", compute.calculateOutput(13));
		assertEquals("Test input 15","FooBarBar", compute.calculateOutput(15));
		assertEquals("Test input 21","FooQix", compute.calculateOutput(21));
		assertEquals("Test input 33","FooFooFoo", compute.calculateOutput(33));
		assertEquals("Test input 51","FooBar", compute.calculateOutput(51));
		assertEquals("Test input 53","BarFoo", compute.calculateOutput(53));
	}

}
