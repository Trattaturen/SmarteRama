package com.smarterama.lebedev.ex2;

public class LongDivider {

	private static final String NL = "\n";
	private static final String WHITE_SPACE = " ";

	StringBuilder task = new StringBuilder(WHITE_SPACE);
	StringBuilder solution = new StringBuilder();
	StringBuilder result = new StringBuilder();
	StringBuilder gap = new StringBuilder(WHITE_SPACE);

	public String divide(long dividend, long divisor) {

		if (!areParametersCorrect(dividend, divisor)) {
			return String.valueOf(result);
		}

		task.append(dividend + "|" + divisor);

		long[] dividendDigits = convertToDigitsArray(dividend);
		int index = String.valueOf(divisor).length() - 1;
		long currentDividend = getInitialDividend(divisor, dividendDigits);

		while (index <= dividendDigits.length) {

			long localResult;

			if (currentDividend == 0) {
				gap.append("*");
			}

			if (currentDividend >= divisor) {

				if (index > 1) {
					gap.append(WHITE_SPACE);
				}
				solution.append(gap + String.valueOf(currentDividend) + NL);
				solution.append("-" + NL);
				localResult = currentDividend / divisor;
				currentDividend = currentDividend % divisor;
				solution.append(gap + String.valueOf((localResult * divisor)) + NL);
				solution.append(gap + "---" + NL);
				result.append(localResult);

			} else if (currentDividend < divisor && index < dividendDigits.length - 1) {

				index++;
				currentDividend = currentDividend * 10 + dividendDigits[index];

				if (currentDividend < divisor) {

					while (currentDividend < divisor && index < dividendDigits.length - 1) {

						index++;
						currentDividend = currentDividend * 10 + dividendDigits[index];
						result.append(0);
						gap.append(WHITE_SPACE);
					}
				}

				if (index > 1) {
					gap.append(WHITE_SPACE);
				}

				solution.append(gap + String.valueOf(currentDividend) + NL);
				solution.append("-" + NL);
				localResult = currentDividend / divisor;
				currentDividend = currentDividend % divisor;
				solution.append(gap + String.valueOf((localResult * divisor)) + NL);
				solution.append(gap + "---" + NL);
				result.append(localResult);

			} else {

				solution.append(gap + String.valueOf(currentDividend));
				break;
			}
		}
		System.out.println(task);
		System.out.println(gap + "  |" + result);
		System.out.println(solution);

		return String.valueOf(result);
	}

	private boolean areParametersCorrect(long dividend, long divisor) {
		try {
			if (dividend < 0) {
				throw new NumberFormatException("");
			}

			if (dividend == 0) {
				result.append("Divident is zero. That makes no sense." + NL);
				return false;
			}

		} catch (NumberFormatException e) {
			result.append("Dividend \"" + dividend + "\" must be an positive integer." + NL);
			return false;
		}

		try {

			if (divisor < 0) {
				throw new NumberFormatException("");
			}

			if (divisor == 0) {
				result.append("Divisor is zero. Division by zero not allowed." + NL);
				return false;
			}

		} catch (NumberFormatException e) {
			result.append("Divisor \"" + divisor + "\" must be an positive integer." + NL);
			return false;
		}

		if (dividend < divisor) {
			result.append(("The dividend is less than the divisor (" + dividend + " < " + divisor + ")" + NL
					+ "That makes no sense. The result is always zero." + NL));
			return false;
		}

		return true;
	}

	private long getInitialDividend(long divisor, long[] dividendDigits) {

		long initialDividend = 0;
		int divisorLength = String.valueOf(divisor).length();

		for (int i = 0; i < divisorLength; i++) {
			initialDividend = initialDividend * 10 + dividendDigits[i];

		}
		return initialDividend;
	}

	private long[] convertToDigitsArray(long dividentNumber) {

		int dividentNumberLength = Long.toString(dividentNumber).length();
		long[] dividentDigits = new long[dividentNumberLength];
		int i = dividentNumberLength - 1;

		while (dividentNumber != 0) {
			dividentDigits[i] = dividentNumber % 10;
			dividentNumber /= 10;
			i--;
		}

		return dividentDigits;
	}
}