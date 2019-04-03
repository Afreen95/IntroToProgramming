import java.io.*;

public class readingAndWriting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
		String currLine = br.readLine();
		while (currLine != null) {
			System.out.println(currLine);
			currLine = br.readLine();
		}
		br.close();
		writeToFile();
	}

	private static void writeToFile() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("input2.txt"));
		
		bw.write("Hello It is me new line");
		bw.newLine();
		bw.write("This is me too! line");
		bw.close();
	}
	
	

}
