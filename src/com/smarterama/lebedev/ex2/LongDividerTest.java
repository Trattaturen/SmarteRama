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
	public void testDivideSimpleNumbers() {
		Assert.assertEquals("170", divider.divide(512, 3));
		
	}
	@Test
	public void testDivideSimpleNumbers2() {
		Assert.assertEquals("1763", divider.divide(12345, 7));
		
	}
	
	public void testDivideSimpleNumbers3() {
		Assert.assertEquals("4994001", divider.divide(99880020, 20));
		
	}
	public void testDivideSimpleNumbers4() {
		Assert.assertEquals("112354849664658453", divider.divide(1460613045640559889L, 13));
		
	}
	

}
