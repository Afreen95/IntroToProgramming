public class methodParameters {

	public static void main(String[] args) {
		String name = "Anna";
		System.out.println(getLetter(name, 3));
	}
	
	private static char getLetter(String i, int j) {
		return i.charAt(j);
	}
}
