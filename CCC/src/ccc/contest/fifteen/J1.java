import java.util.Scanner;


 class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		scan.close();
		
		
		if (month<2)
			System.out.println("Before");
		else if (month==2 && day<18)
			System.out.println("Before");
		else if (month==2 && day==18)
			System.out.println("Special");
		else if (month>=2 && day>18)
			System.out.println("After");
		else if(month>2)
			System.out.println("After");
		
		
		
	}

}
