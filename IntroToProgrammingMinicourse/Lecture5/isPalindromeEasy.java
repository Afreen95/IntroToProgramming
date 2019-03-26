
public class isPalindromeEasy {

	public static void main(String[] args) {
	System.out.println(isStringRotation("hello", "llohe"));

	}

	private static boolean isStringRotation(String str1, String str2) {
		String newStr = str1 + str1;
		return newStr.contains(str2);
	}

}
