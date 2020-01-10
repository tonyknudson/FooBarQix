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
		assertEquals("CheckZeroes input <empty>, false","", compute.checkZeroes("", false));
		assertEquals("CheckZeroes input 1, false","1", compute.checkZeroes("1", false));
		assertEquals("CheckZeroes input 10, false","1*", compute.checkZeroes("10", false));
		assertEquals("CheckZeroes input 100, false","1**", compute.checkZeroes("100", false));
		assertEquals("CheckZeroes input 1000, false","1***", compute.checkZeroes("1000", false));
		assertEquals("CheckZeroes input 1001, false","1**1", compute.checkZeroes("1001", false));
		assertEquals("CheckZeroes input 10101, false","1*1*1", compute.checkZeroes("10101", false));
		assertEquals("CheckZeroes input <empty>, false","", compute.checkZeroes("", true));
		assertEquals("CheckZeroes input 1, true","", compute.checkZeroes("1", true));
		assertEquals("CheckZeroes input 10, true","*", compute.checkZeroes("10", true));
		assertEquals("CheckZeroes input 100, true","**", compute.checkZeroes("100", true));	
		assertEquals("CheckZeroes input 1000, true","***", compute.checkZeroes("1000", true));
		assertEquals("CheckZeroes input 1001, true","**", compute.checkZeroes("1001", true));
		assertEquals("CheckZeroes input 1001, true","**", compute.checkZeroes("10101", true));
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
