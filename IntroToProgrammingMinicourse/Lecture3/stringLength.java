
public class stringLength {

	public static void main(String[] args) {
		String name = "Feynman";
		int length = name.length();
		
		char firstLetter = name.charAt(0);
		char lastLetter = name.charAt(length - 1);
		
		System.out.println(firstLetter);
		System.out.println(lastLetter);
	}
}
