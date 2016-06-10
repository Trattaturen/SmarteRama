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
		char[] origin = word.toCharArray();
		char[] reversed = new char[origin.length];
		int right = origin.length - 1;
		
		for (int i = 0; i < origin.length; i++) {
			if (!Character.isLetter(origin[i])) {
				reversed[i] = origin[i];
			}
		}
		
		for (int j = 0; j < origin.length; j++) {
			if (Character.isLetter(origin[j])) {
				if (reversed[right] == '\0') {
					reversed[right] = origin[j];
				} else {
					while (reversed[right] != '\0') {
						right--;
					}
					reversed[right] = origin[j];
				}
			}
		}
		
		return new String(reversed);
	}
}
