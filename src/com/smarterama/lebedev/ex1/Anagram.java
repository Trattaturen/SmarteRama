package com.smarterama.lebedev.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Anagram {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sentence to convert");
		String sentence = input.nextLine();
		StringBuilder anagram = new StringBuilder();

		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++) {
			anagram.append(reverseLetters(words[i]) + " ");
		}

		System.out.println(anagram);

	}

	public static String reverseLetters(String word) {

		StringBuilder reversed = new StringBuilder();
		List<Character> symbols = new ArrayList<Character>();
		Stack<Character> letters = new Stack<Character>();
		for (int j = 0; j < word.length(); j++) {
			char current = word.charAt(j);

			if (Character.isLetter(current)) {
				letters.push(current);
				symbols.add('L');

			} else {
				symbols.add(current);
			}
		}

		for (char current : symbols) {
			if (current == 'L') {
				reversed.append(letters.pop());
			} else {
				reversed.append(current);
			}
		}
		return reversed.toString();
	}
}
