import java.util.Scanner;
public class classmates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[4];
		for(int i = 0; i < 4; i++) {
			names[i] = sc.nextLine();
		}
		System.out.println(names[0]);
	}

}
