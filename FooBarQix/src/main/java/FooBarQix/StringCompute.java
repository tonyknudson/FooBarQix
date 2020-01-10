package FooBarQix;

import java.util.Scanner;

public class StringCompute {

	public static void main(String[] args) {
		try {
			StringCompute compute = new StringCompute();
			Integer input = getInput();
			String output = compute.calculateOutput(input);
			System.out.println(output);
		} catch (Exception e) {
			System.out.println("Something went wrong:\n");
			e.printStackTrace();
		}
	}

	private static Integer getInput() {
		Integer input = 0;
		try (Scanner in = new Scanner(System.in)) {
			while (input == 0) {
				try {
					System.out.println("Please enter a positive number and press enter");
					String inputString = (in.nextLine());
					input = Integer.parseInt(inputString);
				} catch (NumberFormatException e) {
					System.out.println("That doesn't appear to be valid\n");
				}
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
		if (null != input) {
			if (inputString.contains("3")) {
				return "Foo";
			} else if (inputString.contains("5")) {
				return "Bar";
			} else if (inputString.contains("7")) {
				return "Qix";
			}
		}
		return "";
	}

}
