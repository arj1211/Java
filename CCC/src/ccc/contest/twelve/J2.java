package ccc.contest.twelve;

import java.util.Scanner;

 public class J2{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int one = scan.nextInt();
		int two = scan.nextInt();
		int three = scan.nextInt();
		int four= scan.nextInt();
		
		scan.close();
		
		if (one == two && two == three && three == four && four == one)
			System.out.println(" Fish At Constant Depth");
		else if (one>two && two>three && three>four)
			System.out.println("Fish Diving");
		else if (one<two && two<three && three<four)
			System.out.println("Fish Rising");
		else System.out.println("No Fish");
		
	}

}
