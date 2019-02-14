
public class methodReturns {

	public static void main(String[] args) {
		System.out.println("We will return values from different functions");
		
		int x = getInt();
		double y = getDouble();
		Boolean b = getBoolean();
		String s = getString();
		char c = getChar();
		
		returnNothing();
		System.out.println(x);
		System.out.println(y);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
	}

	private static char getChar() {
		return 'A';
	}

	private static String getString() {
		return "This is a String";
	}

	private static Boolean getBoolean() {
		return false;
	}

	private static double getDouble() {
		return 3.14;
	}

	private static int getInt() {
		return 42;
	}
	
	private static void returnNothing() {
		System.out.println("This method returns nothing");
	}

}
