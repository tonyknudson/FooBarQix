package FooBarQix;

public class StringCompute {

	public static void main(String[] args) {
		String input = "21";
		//Accept input
		//Tokenize string
		//Loop tokens through divisor and contains methods
		//Add results to stringBuffer
		//Output string buffer
		//System.out.println(StringCompute.doMain(input));
	}
	
	public String doMain(String input) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(checkDivisor(input));
		buffer.append(checkContains(input));
		
		return buffer.toString();
	}

	public String checkDivisor(String input) {
		
		if (null != input) {
			Integer number = Integer.parseInt(input);
			System.out.println(input);
			System.out.println(number % 3);
			System.out.println(number % 7);
			if (number % 3 == 0) {
				return "Foo";
			} else if (number % 5 == 0) {
				return "Bar";
			} else if (number % 7 == 0) {
				return "Qix";
			} else {
				return input;
			}
		} else {
			return "";
		}
	}
	
	public String checkContains(String input) {
		if (null != input) {
			if (input.contains("3")) {
				return "Foo";
			} else if (input.contains("5")) {
				return "Bar";
			} else if (input.contains("7")) {
				return "Qix";
			} else {
				return input;
			}
		} else {
			return "";
		}
	}

}
