package thenewboston.intermediate;

public class GenericMethods_17_18 {

	public static void main(String[] args) {

		Integer[] iRay = { 1, 2, 3, 4 };
		Character[] cRay = { 'b', 'u', 'c', 'k', 'y' };

		printMe(iRay);
		printMe(cRay);

	}

	// generic method
	public static <T> void printMe(T[] x) {
		for (T b : x)
			System.out.printf("%s ", b);
		System.out.println();
	}

}
