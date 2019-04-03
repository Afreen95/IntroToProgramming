
public class funWithRationalNumbers {

	public static void main(String[] args) {
		RationalNumbers r = new RationalNumbers(10, 100);
	
		System.out.println(r.getReducedForm());
		getStaticReducedForm(r);
	}
	
	public static void getStaticReducedForm(RationalNumbers r) {
		System.out.println((double)r.getNum()/r.getDem());
	}
	
}
