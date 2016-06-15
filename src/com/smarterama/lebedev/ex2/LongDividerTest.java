package com.smarterama.lebedev.ex2;

import org.junit.Assert;
import org.junit.Test;

public class LongDividerTest {

	@Test
	public void testDivide() {
		Assert.assertEquals(170, LongDivider.divide(512, 3));
		Assert.assertEquals(260, LongDivider.divide(1040, 4));
	}

}
