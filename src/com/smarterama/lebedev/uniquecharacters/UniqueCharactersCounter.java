package com.smarterama.lebedev.uniquecharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UniqueCharactersCounter {

	private Map<String, Map<Character, Integer>> cachedResults = new HashMap<>();

	public Map<Character, Integer> countUniqueCharacters(String initialString) {

		if (cachedResults.containsKey(initialString)) {

			System.out.println("Got from cache");
			return cachedResults.get(initialString);

		}

		Map<Character, Integer> currentResult = new TreeMap<>();

		for (int i = 0; i < initialString.length(); i++) {

			char currentChar = initialString.charAt(i);

			if (currentResult.containsKey(currentChar)) {

				currentResult.put(currentChar, currentResult.get(currentChar) + 1);
			} else {

				currentResult.put(currentChar, 1);
			}
		}

		cachedResults.put(initialString, currentResult);
		return currentResult;

	}
}
