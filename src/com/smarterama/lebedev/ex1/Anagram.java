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
			anagram.append(simpleReverse(words[i]) + " ");
		}
		System.out.println(anagram);
	}

	public static String simpleReverse(String word) {
		char[] letters = word.toCharArray();
		int lIndex = 0;
		int rIndex = letters.length - 1;
		
		while (lIndex < rIndex) {
			
			if (Character.isLetter(letters[lIndex])) {
				if (Character.isLetter(letters[rIndex])) {
					char temp = letters[rIndex];
					letters[rIndex] = letters[lIndex];
					letters[lIndex] = temp;
					lIndex++;
					rIndex--;
				} else {
					rIndex--;
				}
			} else {
				lIndex++;
			}
		}

		return new String(letters);
	}

}
