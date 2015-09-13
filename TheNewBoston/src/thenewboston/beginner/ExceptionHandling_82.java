package thenewboston.beginner;

import java.util.Scanner;

public class ExceptionHandling_82 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x = 1;

		do {
			try {

				System.out.println("First num: ");

				int n1 = input.nextInt();
				System.out.println("Second num: ");

				int n2 = input.nextInt();

				int div = n1 / n2;
				System.out.println(div);
				x++;
			} catch (Exception e) {
				System.out.println("Error!");
				continue;
			}
		} while (x == 1);

	}
}
