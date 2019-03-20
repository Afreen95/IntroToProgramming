
public class christmasTree {

	public static void main(String[] args) {
		for (int row = 0; row < 10; row++) {
			for (int space = 0; space < 10 - row; space++) {
				System.out.print(" ");
			}
			for (int stars = 0; stars < (2 * row + 1); stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
