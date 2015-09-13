package thenewboston.beginner;

import java.io.File;
import java.util.Scanner;

public class ReadingFromFiles_81 {

	private static File file;
	private static Scanner x;

	public static void main(String[] args) {

		Scanner y = new Scanner(System.in);

		System.out.print("Full filepath?:");
		file = new File(y.nextLine());
		y.close();
		if (file.exists()) {

			openFile(file);
			System.out.println("Line/Word in file:\n↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");
			readFile(file);

		} else
			System.out.println("File not found!");

	}

	public static void openFile(File file) {
		try {

			x = new Scanner(file);

		} catch (Exception e) {
			System.out.println("couldnt find file");
		}
	}

	public static void readFile(File file) {
		String[] arr = new String[(int) file.length()];
		int q = 0;
		while (x.hasNext()) {
			arr[q] = x.next();
			System.out.println(arr[q]);
			q++;
		}
	}

}
