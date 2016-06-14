package com.smarterama.lebedev.ex2;
public class LongDivider {

	public static void main(String[] args) {

		int dividentNumber = 100;
		int divisor = 10;
		int[] dividendDigits = convertToDigitsArray(dividentNumber);
		StringBuilder result = new StringBuilder();
		int index = String.valueOf(divisor).length() - 1;
		int currentDividend = getInitialDividend(divisor, dividendDigits);
		System.out.println(dividentNumber + " | " + divisor);

		while (index <= dividendDigits.length) {
			int tempResult;
			if (currentDividend >= divisor) {
				tempResult = currentDividend / divisor;
				currentDividend = currentDividend % divisor;
				result.append(tempResult);

			} else if (currentDividend < divisor && index < dividendDigits.length - 1) {
				index++;
				currentDividend = currentDividend * 10 + dividendDigits[index];
				if (currentDividend < divisor) {
					while (currentDividend < divisor && index < dividendDigits.length - 1) {
						index++;
						currentDividend = currentDividend * 10 + dividendDigits[index];
						result.append(0);
					}
				}
				tempResult = currentDividend / divisor;
				currentDividend = currentDividend % divisor;
				result.append(tempResult);

			} else {
				System.out.println("Leftover = " + currentDividend);
				break;
			}
		}
		System.out.println("Result = " + result);
	}

	private static int getInitialDividend(int divisor, int[] dividendDigits) {
		int initialDividend = 0;
		int divisorLength = String.valueOf(divisor).length();
		for (int i = 0; i < divisorLength; i++) {
			initialDividend = initialDividend * 10 + dividendDigits[i];

		}
		return initialDividend;
	}

	private static int[] convertToDigitsArray(int dividentNumber) {
		int dividentNumberLength = Integer.toString(dividentNumber).length();
		int[] dividentDigits = new int[dividentNumberLength];
		int i = dividentNumberLength - 1;
		do {
			dividentDigits[i] = dividentNumber % 10;
			dividentNumber /= 10;
			i--;
		} while (dividentNumber != 0);
		return dividentDigits;
	}
}