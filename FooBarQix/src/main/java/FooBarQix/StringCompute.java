package FooBarQix;

public class StringCompute {

	public static void main(String[] args) {
		String input = "21";
		// Accept input
		// Tokenize string
		// Loop tokens through divisor and contains methods
		// Add results to stringBuffer
		// Output string buffer
		// System.out.println(StringCompute.doMain(input));
	}

	public String doMain(String input) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(checkDivisor(input));
		buffer.append(checkContains(input));
		
		if (buffer.length() == 0) {
			buffer.append(input);
		}

		return buffer.toString();
	}

	public String checkDivisor(String input) {
		StringBuffer buffer = new StringBuffer();
		if (null != input) {
			Integer number = Integer.parseInt(input);
			if (number % 3 == 0) {
				buffer.append("Foo");
			}
			if (number % 5 == 0) {
				buffer.append("Bar");
			}
			if (number % 7 == 0) {
				buffer.append("Qix");
			}
		}
		return buffer.toString();
	}

	public String checkContains(String input) {
		if (null != input) {
			if (input.contains("3")) {
				return "Foo";
			} else if (input.contains("5")) {
				return "Bar";
			} else if (input.contains("7")) {
				return "Qix";
			}
		}
		return "";
	}

}
