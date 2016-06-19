package com.smarterama.lebedev.ex2;

public class LongDivider {

	private StringBuilder task;
	private StringBuilder solution;
	private StringBuilder result;
	private StringBuilder gap;
	private StringBuilder resultGap;
	private StringBuilder line;
	private long dividend;
	private long divisor;

	public LongDivider(long dividend, long divisor) {

		this.dividend = dividend;
		this.divisor = divisor;
		task = new StringBuilder();
		solution = new StringBuilder();
		result = new StringBuilder();
		gap = new StringBuilder();
		resultGap = new StringBuilder();
		line = new StringBuilder();
		
		for (int i = 0; i < String.valueOf(dividend).length(); i++) {
			resultGap.append(" ");
			line.append("-");
		}
	}

	public String divide() {

		if (!isGivenParametersCorrect(dividend, divisor)) {
			return String.valueOf(result);
		}

		task.append(dividend + "|" + divisor);

		long[] dividendDigits = convertToDigitsArray(dividend);
		long currentDividend = getInitialDividend(divisor, dividendDigits);

		int index = String.valueOf(divisor).length() - 1;

		while (index <= dividendDigits.length) {

			long localResult;

			if (currentDividend == 0) {
				gap.append(" ");
			}

			if (currentDividend >= divisor) {

				solution.append(gap + String.valueOf(currentDividend) + "\n");
				
				localResult = currentDividend / divisor;
				currentDividend = currentDividend % divisor;
				
				solution.append(gap + String.valueOf((localResult * divisor)) + "\n");
				solution.append(line + "\n");
				result.append(localResult);

			} else if (currentDividend < divisor && index < dividendDigits.length - 1) {

				index++;
				currentDividend = currentDividend * 10 + dividendDigits[index];

				if (currentDividend < divisor) {

					while (currentDividend < divisor && index < dividendDigits.length - 1) {

						index++;
						currentDividend = currentDividend * 10 + dividendDigits[index];
						
						result.append(0);
						gap.append(" ");
					}
				}

				if (index > 1) {
					gap.append(" ");
				}
				solution.append(gap + String.valueOf(currentDividend) + "\n");
				
				localResult = currentDividend / divisor;
				currentDividend = currentDividend % divisor;
				
				solution.append(gap + String.valueOf((localResult * divisor)) + "\n");
				solution.append(line + "\n");
				result.append(localResult);

			} else {

				solution.append(gap + String.valueOf(currentDividend));
				break;
			}
		}
		draw();
		return String.valueOf(result);
	}

	private boolean isGivenParametersCorrect(long dividend, long divisor) {
		try {
			if (dividend < 0) {
				throw new NumberFormatException("");
			}

			if (dividend == 0) {
				result.append("Divident is zero. That makes no sense." + "\n");
				return false;
			}

		} catch (NumberFormatException e) {
			result.append("Dividend \"" + dividend + "\" must be an positive integer." + "\n");
			return false;
		}

		try {

			if (divisor < 0) {
				throw new NumberFormatException("");
			}

			if (divisor == 0) {
				result.append("Divisor is zero. Division by zero not allowed." + "\n");
				return false;
			}

		} catch (NumberFormatException e) {
			result.append("Divisor \"" + divisor + "\" must be an positive integer." + "\n");
			return false;
		}

		if (dividend < divisor) {
			result.append(("The dividend is less than the divisor (" + dividend + " < " + divisor + ")" + "\n"
					+ "That makes no sense. The result is always zero." + "\n"));
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

	private void draw() {

		System.out.println(task);
		System.out.println(resultGap + "|" + result);
		System.out.println(solution);

	}
}