package com.smarterama.lebedev.uniquecharacters;

import org.junit.Assert;
import org.junit.Test;

public class UniqueCharactersCounterTest {

	public static UniqueCharactersCounter counter = new UniqueCharactersCounter();

	@Test
	public void testUniqueText1() {
		Assert.assertEquals("{1=1, 2=1, 3=1, 4=1, 5=1}", counter.countUniqueCharacters("12345").toString());
	}

	@Test
	public void testUniqueText2() {
		Assert.assertEquals("{ =11, ,=2, -=3, J=1, a=10, b=2, c=5, d=2, e=10, g=5, h=1, i=4, j=1, l=3, m=3, n=6, o=6, p=4, r=8, s=6, t=6, u=4, v=1}", counter.countUniqueCharacters(
				"Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented").toString());
	}
	
	@Test
	public void testUniqueText3() {
		Assert.assertEquals("{!=1, #=1, $=1, %=1, &=1, (=1, )=1, *=1, @=1, ^=1}", counter.countUniqueCharacters("!@#$%^&*()").toString());
	}

	@Test
	public void testUniqueText4() {
		Assert.assertEquals("{e=2, i=2, o=2, p=2, q=2, r=2, t=2, u=2, w=2, y=2}", counter.countUniqueCharacters("qwertyuioppoiuytrewq").toString());
	}

	@Test
	public void testUniqueText5() {
		Assert.assertEquals("{A=1, B=1, C=1, D=1, a=1, b=1, c=1, d=1}", counter.countUniqueCharacters("AaBbCcDd").toString());
	}

	@Test
	public void testUniqueText6() {
		Assert.assertEquals("{ =18}", counter.countUniqueCharacters("                  ").toString());
	}

	@Test
	public void testUniqueText7() {
		Assert.assertEquals("{}", counter.countUniqueCharacters("").toString());
	}

	@Test
	public void testGotFromMap() {
		Assert.assertEquals("{m=1, s=1, y=1}", counter.countUniqueCharacters("sym").toString());
		Assert.assertEquals("{m=1, s=1, y=1}", counter.countUniqueCharacters("sym").toString());
	}
}


