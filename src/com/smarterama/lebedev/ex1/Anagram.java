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
		char[] array = word.toCharArray();
		int lIndex = 0;
		int rIndex = array.length - 1;
		
		while (lIndex < rIndex) {
			
			if (Character.isLetter(array[lIndex])) {
				if (Character.isLetter(array[rIndex])) {
					char temp = array[rIndex];
					array[rIndex] = array[lIndex];
					array[lIndex] = temp;
					lIndex++;
					rIndex--;
				} else {
					rIndex--;
				}
			} else {
				lIndex++;
			}
		}

		return new String(array);
	}

}
