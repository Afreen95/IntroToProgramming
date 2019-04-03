
public class RationalNumbers {
	private int numerator;
	private int denomenator;
	public int randomNumber;
	
	RationalNumbers(int num, int dem){
		numerator = num;
		denomenator = dem;
		randomNumber = 10;
	}
	
	public double getReducedForm() {
		return (double)numerator/denomenator;
	}
	
	public int getNum() {
		return numerator;	
	}
	
	public int getDem() {
		return denomenator;
	}
	
	
}
