package ccc.contest.twelve;

import java.util.Scanner;

class J1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the speed limit: ");
		int limit = scan.nextInt();
		System.out.print("Enter the recorded speed of the car: ");
		int recorded = scan.nextInt();
		scan.close();
		if (limit >= recorded)
			
			
			
			
			
			
			System.out
					.println("Congratulations, you are within the speed limit!");
		else if (recorded > limit && recorded <= limit + 20)
			System.out.println("You are speeding and your fine is $100.");
		else if (recorded > limit && recorded > limit + 20
				&& recorded <= limit + 30)
			System.out.println("You are speeding and your fine is $270");
		else
			System.out.println("You are speeding and your fine is $500.");

	}

}
