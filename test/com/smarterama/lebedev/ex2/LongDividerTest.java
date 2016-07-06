package com.smarterama.lebedev.ex2;

import org.junit.Assert;
import org.junit.Test;

public class LongDividerTest {

	public static LongDivider divider;

	@Test
	public void testDivide_CorrectNumbers1() {
		divider = new LongDivider(788, 22);
		divider.divide();
		Assert.assertEquals("788|22\n78 |35\n-66\n ---\n 128\n-110\n ---\n  18", divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers2() {
		divider = new LongDivider(12345, 7);
		divider.divide();
		Assert.assertEquals(
				"12345|7\n12   |1763\n-7\n ---\n 53\n-49\n ---\n  44\n -42\n  ---\n   25\n  -21\n   ---\n     4",
				divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers3() {
		divider = new LongDivider(1460613045640559889L, 13);
		divider.divide();
		Assert.assertEquals(
				"1460613045640559889|13\n14                 |112354849664658453\n-13\n ---\n 16\n-13\n ---\n  30\n -26\n  ---\n   46\n  -39\n   ---\n    71\n   -65\n    ---\n     63\n    -52\n     ---\n     110\n    -104\n     ---\n       64\n      -52\n       ---\n       125\n      -117\n       ---\n         86\n        -78\n         ---\n          84\n         -78\n          ---\n           60\n          -52\n           ---\n            85\n           -78\n            ---\n             75\n            -65\n             ---\n             109\n            -104\n             ---\n               58\n              -52\n               ---\n                68\n               -65\n                ---\n                 39\n                -39\n                 ---",
				divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers4() {
		divider = new LongDivider(100000, 2);
		divider.divide();
		Assert.assertEquals("100000|2\n10    |50000\n-10\n ---", divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers5() {
		divider = new LongDivider(632, 11);
		divider.divide();
		Assert.assertEquals("632|11\n63 |57\n-55\n ---\n 82\n-77\n ---\n   5", divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers6() {
		divider = new LongDivider(113, 17);
		divider.divide();
		Assert.assertEquals("113|17\n113|6\n-102\n ---\n  11", divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers7() {
		divider = new LongDivider(1000, 3);
		divider.divide();
		Assert.assertEquals("1000|3\n10  |333\n-9\n ---\n 10\n -9\n  ---\n  10\n  -9\n   ---\n    1",
				divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers8() {
		divider = new LongDivider(120, 11);
		divider.divide();
		Assert.assertEquals("120|11\n12 |10\n-11\n ---\n  10", divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers9() {
		divider = new LongDivider(319, 9);
		divider.divide();
		Assert.assertEquals("319|9\n31 |35\n-27\n ---\n 49\n-45\n ---\n   4", divider.getSolution());

	}

	@Test
	public void testDivide_CorrectNumbers10() {
		divider = new LongDivider(0, 9);
		divider.divide();
		Assert.assertEquals("0|9\n0|0", divider.getSolution());

	}

	@Test
	public void testDivide_NegativeNumber() {
		divider = new LongDivider(-17, 5);
		divider.divide();
		Assert.assertEquals("Division of only possitive numbers is supported!", divider.getSolution());

	}

	@Test
	public void testDivide_ZeroDevidend() {
		divider = new LongDivider(35548, 0);
		divider.divide();
		Assert.assertEquals("You cannot divide by 0!", divider.getSolution());
	}

	@Test
	public void testDivide_NotCalculated() {
		divider = new LongDivider(16, 4);
		Assert.assertEquals("You need to calculated first. Use divide() method!", divider.getSolution());
	}
}
