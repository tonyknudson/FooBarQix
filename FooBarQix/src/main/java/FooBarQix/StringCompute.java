package FooBarQix;

import java.util.Scanner;

public class StringCompute {

	public static void main(String[] args) {
		Boolean shouldContinue = true;
		try (Scanner in = new Scanner(System.in)) {
			while (shouldContinue) {
				StringCompute compute = new StringCompute();
				Integer input = getInput(in);
				String output = compute.calculateOutput(input);
				System.out.println(output);
				shouldContinue = getShouldContinue(in);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong:\n");
			e.printStackTrace();
		}
	}

	private static Boolean getShouldContinue(Scanner in) {
		String exitMessage = "\nExiting \nThank you for using StringCompute";
		try {
			System.out.println("\nWould you like to parse another number (y/n)?");
			Boolean shouldContinue = in.nextLine().equals("y");
			if (!shouldContinue) {
				System.out.println(exitMessage);
			}
			return shouldContinue;
		} catch (Exception e) {
			System.out.println(exitMessage);
			return false;
		}
	}

	private static Integer getInput(Scanner in) {
		Integer input = -1;
		while (input == -1) {
			try {
				System.out.println("Please enter a positive number and press enter");
				input = Integer.parseInt(in.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("That doesn't appear to be valid\n");
			}
		}
		return input;
	}

	public String calculateOutput(Integer input) {
		String divisor = checkDivisor(input);
		String contains = checkContains(input);

		if (divisor.length() == 0 && contains.length() == 0) {
			return checkZeroes(input.toString(), false);
		} else {
			return divisor + checkZeroes(input.toString(), true) + contains;
		}
	}

	public String checkZeroes(String input, Boolean replaceNonZeroChars) {
		if (replaceNonZeroChars) {
			input = input.replaceAll("[^0]", "");
		}
		return input.replace('0', '*');
	}

	public String checkContains(Integer input) {
		String inputString = input.toString();

		StringBuffer buffer = new StringBuffer();
		char[] numChars = new char[inputString.length()];

		for (int i = 0; i < inputString.length(); i++) {
			numChars[i] = inputString.charAt(i);
		}

		for (char num : numChars) {
			if (num == '3') {
				buffer.append("Foo");
			}
			if (num == '5') {
				buffer.append("Bar");
			}
			if (num == '7') {
				buffer.append("Qix");
			}

		}
		return buffer.toString();
	}

	public String checkDivisor(Integer input) {
		StringBuffer buffer = new StringBuffer();
		if (null != input) {
			if (input % 3 == 0) {
				buffer.append("Foo");
			}
			if (input % 5 == 0) {
				buffer.append("Bar");
			}
			if (input % 7 == 0) {
				buffer.append("Qix");
			}
		}
		return buffer.toString();
	}

}
