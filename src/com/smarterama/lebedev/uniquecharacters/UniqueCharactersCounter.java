package com.smarterama.lebedev.uniquecharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharactersCounter {

	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public int countUniqueCharacters(String initialText) {

		if (map.containsKey(initialText.hashCode())) {
			System.out.println("Got from map");
			return map.get(initialText.hashCode());
		}

		System.out.println("Not in map");
		Set<Character> uniqueCharacters = new HashSet<Character>();
		
		//String uniqueCharacters = "";
		for (int i = 0; i < initialText.length(); i++) {
			uniqueCharacters.add(initialText.charAt(i));
		}
		int result = uniqueCharacters.size();
		map.put(initialText.hashCode(), result);

		return result;

	}
}
