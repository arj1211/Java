public class AsteriksInitials {

	public static void main(String[] args) {
		makeA(star, space);
	}

	private static char space = '-';
	private static char star = '$';
	private final int HEIGHT = 9;
	private final int WIDTH = HEIGHT * 2;

	private static void printThis(char c_whtspc) {
		System.out.print(c_whtspc);
	}

	private static void newLine() {
		System.out.print("\n");
	}

	private static void makeA(char c, char whtspc) {
		int lCount = 8;

		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		printThis(c);
		printThis(c);

		lCount = 8;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}

		newLine();

		lCount = 7;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		printThis(c);
		printThis(c);
		printThis(c);
		printThis(c);
		lCount = 7;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}

		newLine();
		lCount = 6;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		printThis(c);
		printThis(c);
		printThis(whtspc);
		printThis(whtspc);
		printThis(c);
		printThis(c);
		lCount = 6;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}

		newLine();
		lCount = 5;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		printThis(c);
		printThis(c);
		printThis(whtspc);
		printThis(whtspc);
		printThis(whtspc);
		printThis(whtspc);
		printThis(c);
		printThis(c);
		lCount = 5;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		newLine();
		lCount = 4;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		lCount = 10;
		while (lCount > 0) {
			printThis(c);
			lCount--;
		}
		lCount = 4;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		newLine();

		lCount = 3;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		lCount = 12;
		while (lCount > 0) {
			printThis(c);
			lCount--;
		}
		lCount = 3;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		newLine();

		lCount = 2;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		lCount = 2;
		while (lCount > 0) {
			printThis(c);
			lCount--;
		}

		lCount = 10;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}

		lCount = 2;
		while (lCount > 0) {
			printThis(c);
			lCount--;
		}
		lCount = 2;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}

		newLine();

		lCount = 1;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}
		lCount = 2;
		while (lCount > 0) {
			printThis(c);
			lCount--;
		}

		lCount = 12;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}

		lCount = 2;
		while (lCount > 0) {
			printThis(c);
			lCount--;
		}
		lCount = 1;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}

		newLine();

		lCount = 2;
		while (lCount > 0) {
			printThis(c);
			lCount--;
		}

		lCount = 14;
		while (lCount > 0) {
			printThis(whtspc);
			lCount--;
		}

		lCount = 2;
		while (lCount > 0) {
			printThis(c);
			lCount--;
		}

	}
}
