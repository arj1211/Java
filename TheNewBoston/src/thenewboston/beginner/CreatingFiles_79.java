package thenewboston.beginner;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class CreatingFiles_79 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("You want to make file? yes/no");

		if (scan.nextLine().trim().equalsIgnoreCase("yes")) {
			System.out.print("Where? (Directory path):");
			File fil = new File(scan.nextLine() + "\\Me.txt");
			try {

				Formatter x = new Formatter(fil);
				System.out.printf("%s Created!", fil);

			} catch (Exception e) {
				System.out.println("exception!");
			}
		}
		scan.close();
	}

}
