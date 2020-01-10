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
		StringBuffer buffer = new StringBuffer();
		buffer.append(checkDivisor(input));
		buffer.append(checkContains(input));

		if (buffer.length() == 0) {
			buffer.append(input);
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

	public String checkContains(Integer input) {
		String inputString = input.toString();
		StringBuffer buffer = new StringBuffer();
		if (null != input) {
			if (inputString.contains("3")) {
				buffer.append("Foo");
			} else if (inputString.contains("5")) {
				buffer.append("Bar");
			} else if (inputString.contains("7")) {
				buffer.append("Qix");
			}
		}
		return buffer.toString();
	}
	
	public String checkZeroes(Integer input) {
		return "";
	}

}
