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
		int lBorder = 0;
		int rBorder = array.length - 1;
		
		while (lBorder < rBorder) {
			
			if (Character.isLetter(array[lBorder])) {
				if (Character.isLetter(array[rBorder])) {
					char temp = array[rBorder];
					array[rBorder] = array[lBorder];
					array[lBorder] = temp;
					lBorder++;
					rBorder--;
				} else {
					rBorder--;
				}
			} else {
				lBorder++;
			}
		}

		return new String(array);
	}

}
