package FooBarQix;

public class StringCompute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String getFoo(String input) {
		Integer number = Integer.parseInt(input);
		return (number % 3 == 0 ? "Foo" : input);
	}

}
