package com.smarterama.lebedev.anagram;

import org.junit.Assert;
import org.junit.Test;

import com.smarterama.lebedev.anagram.Anagram;

public class AnagramTest {

	@Test
	public void testSimpleReverse() {
		Assert.assertEquals("drW10_l0e1H!", Anagram.simpleReverse("Hel10_W0r1d!"));
		Assert.assertEquals("!@#$%ba", Anagram.simpleReverse("!@#$%ab"));
		Assert.assertEquals("_amiD_", Anagram.simpleReverse("_Dima_"));
		Assert.assertEquals(" ", Anagram.simpleReverse(" "));
		Assert.assertEquals("!!!!!!", Anagram.simpleReverse("!!!!!!"));
		Assert.assertEquals("!c!b!a!", Anagram.simpleReverse("!a!b!c!"));
		Assert.assertEquals("!!!!!a!!!", Anagram.simpleReverse("!!!!!a!!!"));
	}

}
