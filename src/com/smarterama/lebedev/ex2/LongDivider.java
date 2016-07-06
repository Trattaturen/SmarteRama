package com.smarterama.lebedev.ex2;

public class LongDivider {

	private long dividend;
	private long divisor;
	private String solution = "";

	public LongDivider(long dividend, long divisor) {

		this.dividend = dividend;
		this.divisor = divisor;

	}

	private boolean isDivisionPossible() {
		if (divisor == 0) {
			solution += "You cannot divide by 0!";
			return false;
		} else if (dividend < 0 || divisor < 0) {
			solution += "Division of only possitive numbers is supported!";
			return false;
		} else {
			return true;
		}
	}

	public void divide() {

		if (isDivisionPossible()) {

			String divisionResult = "";
			String graficsResult = "";
			String formatTempDividend = "";
			String formatTempNumb = "";
			String formatDelimiter = "";
			String firstDividend = "";

			long[] digitArray = numberToArray(dividend);
			long temporaryDividend = digitArray[0];
			long remainder = 0;

			int j = 0;
			while (temporaryDividend < divisor && temporaryDividend != dividend) {
				temporaryDividend = temporaryDividend * 10 + digitArray[j + 1];
				j++;
			}
			firstDividend = Long.toString(temporaryDividend);

			long tempNum = 0;
			boolean isFirst = false;
			while (j < digitArray.length) {
				divisionResult += temporaryDividend / divisor;
				if (temporaryDividend / divisor > 0) {
					tempNum = (temporaryDividend / divisor) * divisor;
					if (isFirst) {
						formatTempDividend = "\n" + tab(temporaryDividend, j) + " " + temporaryDividend;
					}
					formatTempNumb = "\n" + tab(tempNum, j) + "-" + tempNum;
					formatDelimiter = "\n" + tab(tempNum, j) + " " + "---";
					graficsResult += formatTempDividend + formatTempNumb + formatDelimiter;
				}
				remainder = temporaryDividend % divisor;
				temporaryDividend = (j == (digitArray.length - 1)) ? remainder * 10
						: remainder * 10 + digitArray[j + 1];
				j++;
				isFirst = true;
			}

			String formatReminder = tab(remainder, j + 1) + Long.toString(remainder);
			String firstTab = repeatString(" ", Long.toString(dividend).length() - firstDividend.length());
			if (remainder != 0) {
				solution += (dividend + "|" + divisor);
				solution += ("\n" + firstDividend + firstTab + "|" + divisionResult);
				solution += (graficsResult);
				solution += ("\n" + formatReminder);
			} else {
				solution += (dividend + "|" + divisor);
				solution += ("\n" + firstDividend + firstTab + "|" + divisionResult);
				solution += (graficsResult);

			}

		}
	}

	private long[] numberToArray(long num) {
		long tmpNum = num;
		long[] digitArray = new long[Long.toString(num).length()];
		for (int i = digitArray.length - 1; i >= 0; i--) {
			digitArray[i] = tmpNum % 10;
			tmpNum /= 10;
		}
		return digitArray;
	}

	private String tab(Object o, int width) {
		String tabStr = "";
		int length = o.toString().length();
		tabStr = repeatString(" ", width - length);
		return tabStr;
	}

	private String repeatString(String s, int j) {
		String resStr = "";
		if (s == null) {
			return "";
		}
		for (int i = 1; i <= j; i++) {
			resStr += s;
		}
		return resStr;
	}

	public String getSolution() {
		if (solution.isEmpty()) {
			return String.valueOf("You need to calculated first. Use divide() method!");
		}
		return solution;
	}
}
