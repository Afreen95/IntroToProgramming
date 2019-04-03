
public class factorial10 {

	public static void main(String[] args) {
		int result = 1;
		for(int i = 1; i < 11; i++) {
			result *= i;
		}
		//System.out.println(result);
		 System.out.println(getAnswer(10));
		 System.out.println(getFib(10));
	}
	
	public static int getAnswer(int number) {
		if (number == 1) return 1;
		return getAnswer(number - 1)*number;
	}
	
	public static int getFib(int n) {
		if(n < 1) return 1;
		return getFib(n - 1) + getFib(n - 2);
	}
}
