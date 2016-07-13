package com.smarterama.lebedev.ex2;

public class LongDivider {

	private final int PERIOD_CALCULATION_LIMIT = 10;
	private long dividend;
	private long divisor;
	private StringBuilder solution;

	public LongDivider(long dividend, long divisor) {

		this.dividend = dividend;
		this.divisor = divisor;
		solution = new StringBuilder();

	}

	private boolean isDivisionPossible(boolean periodEnabled) {
		if (divisor == 0) {
			solution.append("You cannot divide by 0!");
			return false;
		} else if (dividend < 0 || divisor < 0) {
			solution.append("Division of only possitive numbers is supported!");
			return false;
		} else if (!periodEnabled && dividend < divisor) {
			solution.append("Dividend is less then divisor. Result is always 0. Try enabling period calculation");
			return false;
		} else {
			return true;
		}
	}

	public void divide(boolean periodEnabled) {

		if (isDivisionPossible(periodEnabled)) {

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

			if (!periodEnabled) {

				String formatReminder = tab(remainder, j + 1) + Long.toString(remainder);
				String firstTab = repeatString(" ", Long.toString(dividend).length() - firstDividend.length());
				if (remainder != 0) {
					solution.append(dividend + "|" + divisor);
					solution.append("\n" + firstDividend + firstTab + "|" + divisionResult);
					solution.append(graficsResult);
					solution.append("\n" + formatReminder);
				} else {
					solution.append(dividend + "|" + divisor);
					solution.append("\n" + firstDividend + firstTab + "|" + divisionResult);
					solution.append(graficsResult);

				}
			} else if (periodEnabled) {
				if (remainder != 0) {
					divisionResult += ".";
				}
				boolean isPeriod = false;
				long[] reminderArray = new long[PERIOD_CALCULATION_LIMIT];
				int fraction = 0;
				int i = 0;
				int periodIndex = 0;
				while (remainder != 0 && fraction < PERIOD_CALCULATION_LIMIT && !isPeriod) {
					for (int k = 0; k < reminderArray.length; k++) {
						if (remainder == reminderArray[k]) {
							isPeriod = true;
							periodIndex = k - 1;
							break;
						}
					}
					if (temporaryDividend / divisor > 0) {
						tempNum = (temporaryDividend / divisor) * divisor;
						formatTempDividend = "\n" + tab(temporaryDividend, j) + " " + temporaryDividend;
						formatTempNumb = "\n" + tab(tempNum, j) + "-" + tempNum;
						formatDelimiter = "\n" + tab(tempNum, j) + " " + "---";
						graficsResult += formatTempDividend + formatTempNumb + formatDelimiter;
					}
					reminderArray[i] = remainder;
					remainder = temporaryDividend % divisor;
					if (isPeriod == false) {
						divisionResult += temporaryDividend / divisor;
						temporaryDividend = remainder * 10;
						fraction++;
						i++;
						j++;
					}
				}

				String formatReminder = tab(remainder, j + 1) + Long.toString(remainder);
				String firstTab = repeatString(" ", Long.toString(dividend).length() - firstDividend.length());
				if (isPeriod && remainder != 0) {
					solution.append(dividend + "|" + divisor);
					solution.append(
							"\n" + firstDividend + firstTab + "|" + formatPeriodResult(periodIndex, divisionResult));
					solution.append(graficsResult);
					solution.append("\n" + formatReminder);
				} else {
					solution.append(dividend + "|" + divisor);
					solution.append("\n" + firstDividend + firstTab + "|" + divisionResult);
					solution.append(graficsResult);
				}

			}
		}
	}

	public static String formatPeriodResult(int index, String res) {
		int dotIndex = res.indexOf(".");
		String bSubStr = res.substring(0, index + dotIndex + 2);
		String eSubStr = res.substring(index + dotIndex + 2, res.length());
		bSubStr += "(";
		eSubStr += ")";
		return bSubStr + eSubStr;
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
		if (String.valueOf(solution).equals("")) {
			return String.valueOf("You need to calculated first. Use divide() method!");
		}
		return String.valueOf(solution);
	}
}
