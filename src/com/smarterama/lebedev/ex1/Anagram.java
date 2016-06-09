package com.smarterama.lebedev.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Anagram {

	public static void main(String[] args) {

		System.out.println("Enter sentence to convert");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		input.close();

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
				//'L' is for Letter
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
