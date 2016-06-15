package com.smarterama.lebedev.ex2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongDividerTest {
	
	public static LongDivider divider;
	
	@Before
	public void setUpBeforeTest() throws Exception {
		   divider = new LongDivider();
	}

	
	@Test
	public void testDivide_CorrectNumbers() {
		Assert.assertEquals("170", divider.divide(512, 3));
		
	}
	@Test
	public void testDivide_CorrectNumbers2() {
		Assert.assertEquals("1763", divider.divide(12345, 7));
		
	}
	@Test
	public void testDivide_CorrectNumbers3() {
		Assert.assertEquals("4994001", divider.divide(99880020, 20));
		
	}
	@Test
	public void testDivide_CorrectNumbers4() {
		Assert.assertEquals("112354849664658453", divider.divide(1460613045640559889L, 13));
		
	}
	@Test
	public void testDivide_CorrectNumbers5() {
		Assert.assertEquals("50000", divider.divide(100000, 2));
		
	}
	@Test
	public void testDivideDividendIsZero() {
		Assert.assertEquals("Divident is zero. That makes no sense.\n", divider.divide(0, 500));
		
	}
	
	@Test
	public void testDivideDivisorIsZero() {
		Assert.assertEquals("Divisor is zero. Division by zero not allowed.\n", divider.divide(7, 0));
		
	}
	@Test
	public void testDivideDividendLessThanDivisor() {
		Assert.assertEquals("The dividend is less than the divisor (157 < 230)\nThat makes no sense. The result is always zero.\n", divider.divide(157, 230));
		
	}

}
