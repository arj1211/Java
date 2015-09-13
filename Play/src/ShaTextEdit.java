import java.io.*;

public class ShaTextEdit {

	public static void main(String[] args) {

		try {

			File in = new File("C:/Users/Arjun/Desktop/shailEdit.txt");
			File out = new File("C:/Users/Arjun/Desktop/shailEditWRITTEN.txt");

			BufferedReader br = new BufferedReader(new FileReader(in));
			PrintWriter bw = new PrintWriter(new FileWriter(out));
			String currentLine;

			while ((currentLine = br.readLine()) != null) {

				currentLine = currentLine.replace('-', ' ');
				currentLine = currentLine.replace('|', ' ');
				currentLine = currentLine.replace('*', 'x');
				System.out.println(currentLine);
				bw.println(currentLine);

			}
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();

			System.out.println("File Not Found! name it 'AaTextEdit.txt'");

		}

	}
}
