package com.smarterama.lebedev.uniquecharacters;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharactersCounter {

	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public int countUniqueCharacters(String initialText) {

		if (map.containsKey(initialText.hashCode())) {
			System.out.println("Got from map");
			return map.get(initialText.hashCode());
		}

		System.out.println("Not in map");
		String uniqueCharacters = "";
		for (int i = 0; i < initialText.length(); i++) {
			if (!uniqueCharacters.contains(String.valueOf(initialText.charAt(i)))) {
				uniqueCharacters += initialText.charAt(i);
			}
		}
		int result = uniqueCharacters.length();
		map.put(initialText.hashCode(), result);

		return result;

	}
}
