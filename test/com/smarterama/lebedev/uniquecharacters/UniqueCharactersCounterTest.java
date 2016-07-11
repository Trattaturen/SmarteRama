package com.smarterama.lebedev.uniquecharacters;

import org.junit.Assert;
import org.junit.Test;

public class UniqueCharactersCounterTest {

	public static UniqueCharactersCounter counter = new UniqueCharactersCounter();

	@Test
	public void testUniqueText1() {
		Assert.assertEquals(5, counter.countUniqueCharacters("12345"));
	}

	@Test
	public void testUniqueText2() {
		Assert.assertEquals(23, counter.countUniqueCharacters(
				"Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented"));
	}

	@Test
	public void testUniqueText3() {
		Assert.assertEquals(10, counter.countUniqueCharacters("!@#$%^&*()"));
	}

	@Test
	public void testUniqueText4() {
		Assert.assertEquals(10, counter.countUniqueCharacters("qwertyuioppoiuytrewq"));
	}

	@Test
	public void testUniqueText5() {
		Assert.assertEquals(8, counter.countUniqueCharacters("AaBbCcDd"));
	}
	
	@Test
	public void testUniqueText6() {
		Assert.assertEquals(1, counter.countUniqueCharacters("                  "));
	}
	
	@Test
	public void testUniqueText7() {
		Assert.assertEquals(0, counter.countUniqueCharacters(""));
	}
	
	@Test
	public void testGotFromMap() {
		Assert.assertEquals(3, counter.countUniqueCharacters("sym"));
		Assert.assertEquals(3, counter.countUniqueCharacters("sym"));
	}
}
