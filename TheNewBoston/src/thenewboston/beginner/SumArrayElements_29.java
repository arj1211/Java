package thenewboston.beginner;

public class SumArrayElements_29 {

	public static void main(String[] args) {
		int sumA[] = { 65, 65, 6, 252, 12 };
		int total = 0;

		for (int counter = 0; counter < sumA.length; counter++) {
			total += sumA[counter];
		}
		System.out.println("Sum of these elements= " + total);
	}

}
