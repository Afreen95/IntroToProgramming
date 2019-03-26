
public class classVariables {
	static final double pi = 3.14;
	static final double r = 3;
	
	public static void main(String[] args) {
		getArea();
		getCircumference();
	}
	private static void getCircumference() {
		System.out.println(2*pi*r);
		
	}
	private static void getArea() {
		System.out.println(pi*r*r);
	}

}
