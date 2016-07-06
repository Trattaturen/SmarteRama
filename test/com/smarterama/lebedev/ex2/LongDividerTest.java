package com.smarterama.lebedev.ex2;

import org.junit.Assert;
import org.junit.Test;

public class LongDividerTest {

	public static LongDivider divider;

	@Test
	public void testDivide_CorrectNumbers_Period1() {
		divider = new LongDivider(788, 22);
		divider.divide(true);
		Assert.assertEquals(
				"788|22\n78 |35.(81)\n-66\n ---\n 128\n-110\n ---\n 180\n-176\n ---\n   40\n  -22\n   ---\n   180\n  -176\n   ---\n     4",
				divider.getSolution());

	}
	@Test
	public void testDivide_NoPeriod1() {
		divider = new LongDivider(788, 22);
		divider.divide(false);
		Assert.assertEquals("788|22\n78 |35\n-66\n ---\n 128\n-110\n ---\n  18", divider.getSolution());

	}

	@Test
	public void testDivide_Period2() {
		divider = new LongDivider(12345, 7);
		divider.divide(true);
		Assert.assertEquals(
				"12345|7\n12   |1763.(571428)\n-7\n ---\n 53\n-49\n ---\n  44\n -42\n  ---\n   25\n  -21\n   ---\n    40\n   -35\n    ---\n     50\n    -49\n     ---\n      10\n      -7\n       ---\n       30\n      -28\n       ---\n        20\n       -14\n        ---\n         60\n        -56\n         ---\n          40\n         -35\n          ---\n           5",
				divider.getSolution());

	}
	
	@Test
	public void testDivide_NoPeriod2() {
		divider = new LongDivider(12345, 7);
		divider.divide(false);
		Assert.assertEquals(
				"12345|7\n12   |1763\n-7\n ---\n 53\n-49\n ---\n  44\n -42\n  ---\n   25\n  -21\n   ---\n     4", divider.getSolution());

	}

	@Test
	public void testDivide_Period3() {
		divider = new LongDivider(1460613045640559889L, 13);
		divider.divide(true);
		Assert.assertEquals(
				"1460613045640559889|13\n14                 |112354849664658453\n-13\n ---\n 16\n-13\n ---\n  30\n -26\n  ---\n   46\n  -39\n   ---\n    71\n   -65\n    ---\n     63\n    -52\n     ---\n     110\n    -104\n     ---\n       64\n      -52\n       ---\n       125\n      -117\n       ---\n         86\n        -78\n         ---\n          84\n         -78\n          ---\n           60\n          -52\n           ---\n            85\n           -78\n            ---\n             75\n            -65\n             ---\n             109\n            -104\n             ---\n               58\n              -52\n               ---\n                68\n               -65\n                ---\n                 39\n                -39\n                 ---",
				divider.getSolution());

	}
	
	@Test
	public void testDivide_NoPeriod3() {
		divider = new LongDivider(1460613045640559889L, 13);
		divider.divide(false);
		Assert.assertEquals(
				"1460613045640559889|13\n14                 |112354849664658453\n-13\n ---\n 16\n-13\n ---\n  30\n -26\n  ---\n   46\n  -39\n   ---\n    71\n   -65\n    ---\n     63\n    -52\n     ---\n     110\n    -104\n     ---\n       64\n      -52\n       ---\n       125\n      -117\n       ---\n         86\n        -78\n         ---\n          84\n         -78\n          ---\n           60\n          -52\n           ---\n            85\n           -78\n            ---\n             75\n            -65\n             ---\n             109\n            -104\n             ---\n               58\n              -52\n               ---\n                68\n               -65\n                ---\n                 39\n                -39\n                 ---",
				divider.getSolution());

	}

	@Test
	public void testDivide_Period4() {
		divider = new LongDivider(100000, 2);
		divider.divide(true);
		Assert.assertEquals("100000|2\n10    |50000\n-10\n ---", divider.getSolution());

	}
	
	@Test
	public void testDivide_NoPeriod4() {
		divider = new LongDivider(100000, 2);
		divider.divide(true);
		Assert.assertEquals("100000|2\n10    |50000\n-10\n ---", divider.getSolution());

	}
	
	@Test
	public void testDivide_Period5() {
		divider = new LongDivider(25, 39);
		divider.divide(true);
		Assert.assertEquals("25|39\n25|0.(641025)\n 250\n-234\n ---\n 160\n-156\n ---\n   40\n  -39\n   ---\n    100\n    -78\n     ---\n     220\n    -195\n     ---\n      250\n     -234\n      ---\n       16", divider.getSolution());

	}
	
	@Test
	public void testDivide_NoPeriod5() {
		divider = new LongDivider(25, 39);
		divider.divide(false);
		Assert.assertEquals("Dividend is less then divisor. Result is always 0. Try enabling period calculation", divider.getSolution());

	}
	
	@Test
	public void testDivide_Period6() {
		divider = new LongDivider(17, 11);
		divider.divide(true);
		Assert.assertEquals("17|11\n17|1.(54)\n -11\n ---\n 60\n-55\n ---\n  50\n -44\n  ---\n   60\n  -55\n   ---\n    5", divider.getSolution());

	}
	
	@Test
	public void testDivide_NoPeriod6() {
		divider = new LongDivider(17, 11);
		divider.divide(false);
		Assert.assertEquals("17|11\n17|1\n-11\n ---\n  6", divider.getSolution());

	}
	
	@Test
	public void testDivide_Period7() {
		divider = new LongDivider(100, 67);
		divider.divide(true);
		Assert.assertEquals("100| 67\n100|1.4925373134\n-67\n ---\n 330\n-268\n ---\n  620\n -603\n  ---\n   170\n  -134\n   ---\n    360\n   -335\n    ---\n     250\n    -201\n     ---\n      490\n     -469\n      ---\n       210\n      -201\n       ---\n         90\n        -67\n         ---\n         230\n        -201\n         ---\n          290\n         -268\n          ---", divider.getSolution());

	}
	
	@Test
	public void testDivide_NoPeriod7() {
		divider = new LongDivider(100, 67);
		divider.divide(false);
		Assert.assertEquals("100|67\n100|1\n-67\n ---\n  33", divider.getSolution());

	}

	@Test
	public void testDivide_NegativeNumber() {
		divider = new LongDivider(-17, 5);
		divider.divide(false);
		Assert.assertEquals("Division of only possitive numbers is supported!", divider.getSolution());

	}

	@Test
	public void testDivide_ZeroDevidend() {
		divider = new LongDivider(35548, 0);
		divider.divide(false);
		Assert.assertEquals("You cannot divide by 0!", divider.getSolution());
	}

	@Test
	public void testDivide_NotCalculated() {
		divider = new LongDivider(16, 4);
		Assert.assertEquals("You need to calculated first. Use divide() method!", divider.getSolution());
	}
}
