package com.smarterama.lebedev.ex2;

import org.junit.Assert;
import org.junit.Test;

public class LongDividerTest {

	public static LongDivider divider;

	@Test
	public void testDivide_CorrectNumbers() {
		divider = new LongDivider(512, 3);
		Assert.assertEquals("170.(6)", divider.divide());

	}

	@Test
	public void testDivide_CorrectNumbers2() {
		divider = new LongDivider(12345, 7);
		Assert.assertEquals("1763.(571428)", divider.divide());

	}

	@Test
	public void testDivide_CorrectNumbers4() {
		divider = new LongDivider(1460613045640559889L, 13);
		Assert.assertEquals("112354849664658453", divider.divide());

	}

	@Test
	public void testDivide_CorrectNumbers5() {
		divider = new LongDivider(100000, 2);
		Assert.assertEquals("50000", divider.divide());

	}

	@Test
	public void testDivide_CorrectNumbers6() {
		divider = new LongDivider(632, 11);
		Assert.assertEquals("57.(45)", divider.divide());

	}
	
	@Test
	public void testDivide_CorrectNumbers7() {
		divider = new LongDivider(113, 17);
		Assert.assertEquals("6.(6470588235)", divider.divide());

	}

	@Test
	public void testDivide_CorrectNumbers8() {
		divider = new LongDivider(1000, 3);
		Assert.assertEquals("333.(3)", divider.divide());

	}
	
	@Test
	public void testDivide_CorrectNumbers9() {
		divider = new LongDivider(120, 11);
		Assert.assertEquals("10.(90)", divider.divide());

	}
	
	@Test
	public void testDivide_CorrectNumbers10() {
		divider = new LongDivider(319, 9);
		Assert.assertEquals("35.(4)", divider.divide());

	}

	@Test
	public void testDivideDividendIsZero() {
		divider = new LongDivider(0, 500);
		Assert.assertEquals("Divident is zero. That makes no sense.\n", divider.divide());

	}

	@Test
	public void testDivideDivisorIsZero() {
		divider = new LongDivider(7, 0);
		Assert.assertEquals("Divisor is zero. Division by zero not allowed.\n", divider.divide());

	}

	@Test
	public void testDivideDividendLessThanDivisor() {
		divider = new LongDivider(157, 230);
		Assert.assertEquals(
				"The dividend is less than the divisor (157 < 230)\nThat makes no sense. The result is always zero.\n",
				divider.divide());

	}

	@Test
	public void testCorrectDrawing() {
		divider = new LongDivider(313, 2);
		divider.divide();
		Assert.assertNotNull(divider.draw());

	}

	@Test
	public void testIncorrectDrawing() {
		divider = new LongDivider(700, 254);
		Assert.assertEquals("You need to calculate first!", divider.draw());

	}

}
