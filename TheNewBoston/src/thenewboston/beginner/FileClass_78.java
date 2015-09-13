package thenewboston.beginner;

import java.io.File;
import java.util.Scanner;

public class FileClass_78 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Where is the file? (entire filepath please):");
		File x = new File(scan.nextLine().trim());
		scan.close();
		if (x.exists())
			System.out.printf("%s Exists!", x);
		else
			System.out.println("Whoops, it's not there!");

	}

}
