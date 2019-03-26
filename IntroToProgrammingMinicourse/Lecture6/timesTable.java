
public class timesTable {

	public static void main(String[] args) {
		int[][] timesTableArray = new int[10][10];
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				timesTableArray[i-1][j-1] = i*j;
				System.out.print(i*j + " ");
			}
			System.out.println();
		}

	}

}
