package com.smarterama.lebedev.ex1;

import java.util.Scanner;

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
		char[] original = word.toCharArray();
		char[] reversed = new char[original.length];
		int rightBorder = original.length - 1;
		
		for (int i = 0; i < original.length; i++) {
			if (!Character.isLetter(original[i])) {
				reversed[i] = original[i];
			}
		}
		
		for (int j = 0; j < original.length; j++) {
			if (Character.isLetter(original[j])) {
				if (reversed[rightBorder] == '\0') {
					reversed[rightBorder] = original[j];
				} else {
					while (reversed[rightBorder] != '\0') {
						rightBorder--;
					}
					reversed[rightBorder] = original[j];
				}
			}
		}
		
		return new String(reversed);
	}
}
