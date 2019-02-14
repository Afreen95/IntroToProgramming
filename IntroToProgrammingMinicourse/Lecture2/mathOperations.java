
public class mathOperations {

	public static void main(String[] args) {
		int answerToLife = 42;
		double pi = 3.14;
		boolean isClassAwesome = true;
		String className = "Introduction to Programming";
		char chr = 'A';
		
		// Adding 2 integers
		System.out.println( 4 + 3);
		
		//Adding double and integer
		System.out.println(4.0 + 3);
		
		// Dividing integer by integer
		System.out.println(4/3);
		
		// Dividing double with integer
		System.out.println(4.0/3);
		
		// Subtracting double with integer
		System.out.println(4.0 -3);
		
		// multiplying double with integer
		System.out.println(4.0 * 3);
		
		// Get remainder of the number
		System.out.println(17 % 10);
		
		// Adding double to a string becomes a string
		System.out.println(pi + className);
		
		// OR Operator
		System.out.println((6 > 7) || (5 > 6 ));
		
		// AND Operator
		System.out.println((6 > 7) && (5 > 6 ));
		
		// not Operator
		System.out.println(!((6 > 7) || (5 > 6 )));
	}

}
