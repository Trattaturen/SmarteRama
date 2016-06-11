package com.smarterama.lebedev.ex1;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

	@Test
	public void testSimpleReverse() {
		Assert.assertEquals("drW10_l0e1H!", Anagram.simpleReverse("Hel10_W0r1d!"));
		Assert.assertEquals("!@#$%ba", Anagram.simpleReverse("!@#$%ab"));
		Assert.assertEquals("_amiD_", Anagram.simpleReverse("_Dima_"));
		Assert.assertEquals(" ", Anagram.simpleReverse(" "));
	}

}
