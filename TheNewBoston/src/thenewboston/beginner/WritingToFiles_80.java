package thenewboston.beginner;

import java.util.Formatter;
import java.util.Scanner;

public class WritingToFiles_80 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CreateFile fil = new CreateFile();
		System.out.print("Full filepath?:");

		fil.openFile(scan.nextLine());

		System.out.println("Enter text:");
		fil.addRecords(scan.nextLine());
		fil.closeFile();
		scan.close();
	}

}

class CreateFile {
	private Formatter x;
	private String fullPathName;

	public void openFile(String fullPathName) {
		this.fullPathName = fullPathName;
		try {
			x = new Formatter(fullPathName);

		} catch (Exception e) {
			System.out.println("exception!");
		}
	}

	public void addRecords(String a) {
		x.format(a);
		System.out.printf("Written to %s!", fullPathName);
	}

	public void closeFile() {
		x.close();
	}

}