package com.smarterama.lebedev.uniquecharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharactersCounter {

	private Map<Integer, Integer> previousResults = new HashMap<Integer, Integer>();

	public int countUniqueCharacters(String initialText) {

		if (previousResults.containsKey(initialText.hashCode())) {
			System.out.println("Got from map");
			return previousResults.get(initialText.hashCode());
		}

		System.out.println("Not in map");
		Set<Character> uniqueCharacters = new HashSet<Character>();

		for (int i = 0; i < initialText.length(); i++) {
			uniqueCharacters.add(initialText.charAt(i));
		}
		int result = uniqueCharacters.size();
		previousResults.put(initialText.hashCode(), result);

		return result;

	}
}
