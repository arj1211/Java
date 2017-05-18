import java.util.Scanner;

class KeyCodeProgramRushilAsudani {
	private static Scanner in = new Scanner(System.in);

	
	public static void main(String[] args) {

		// init to non-menu-selection number (selection numbers are {0,1,2} )
		int menuChoice = 9;
		String validateKeyCode="";
		// init new keygen object
		KeyCodeGenerator keyGenerator = new KeyCodeGenerator();

		// vvvvv the line below prints nothing because the private var "keycode"
		// in the other class is still ""
		System.out.println(keyGenerator.getKeyCode());

		// while user doesnt select to exit...
		while (menuChoice != 0) {

			displayMainMenu();

			// vvv returns either 0,1 or 2, to 'menuChoice'
			menuChoice = getMenuChoice();

			switch (menuChoice) {
			case 1: // generate a key code
			{
				keyGenerator.generateKeyCode();
				System.out.println("KEYCODE GENERATED: "
						+ keyGenerator.getKeyCode());

				// RESET THE KEYCODE VAR
				keyGenerator.setKeyCode("");

			}
				break;
			case 2: // verify a key code
			{
				System.out.println("Please enter a KeyCode to be test:");
				validateKeyCode = in.next();
				System.out.println(validateKeyCode);
				keyGenerator.setKeyCode(validateKeyCode);
				if (keyGenerator.validateKeyCode())
					System.out.println("The KeyCode entered is VALID");
				else
					System.out.println("The KeyCode entered is INVALID");
			}
				break;
			case 0: // exit program
				System.out.println("Goodbye");
				System.exit(1);
				break;
			}
		}
	}

	private static void displayMainMenu() {
		System.out.println("MENU-----Select One ------");
		System.out.println("1. Generate a Key Code:");
		System.out.println("2. Verify a Key Code:");
		System.out.println("0. Exit Program");
		System.out.println("--------------------------");
	}

	// edited
	private static int getMenuChoice() {
		while (!in.hasNextInt()) {
			in.nextLine();
			displayMainMenu();
		}

		int menuChoice = in.nextInt();

		return menuChoice;
	}

}










class KeyCodeGenerator {
	private String keyCode = "";

	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

	public void generateKeyCode() {
		int firstNumber;
		int secondNumber;
		int numberOfPairs = 0;
		while (numberOfPairs < 9) {
			firstNumber = (int) (Math.random() * 10);
			secondNumber = (int) (Math.random() * 10);
			if ((firstNumber + secondNumber) == 9) {
				numberOfPairs++;
				if (numberOfPairs % 3 == 0) {
					if (numberOfPairs == 9)
						keyCode += Integer.toString(firstNumber)
								+ Integer.toString(secondNumber);
					else
						keyCode += Integer.toString(firstNumber)
								+ Integer.toString(secondNumber) + "-";
				} else
					keyCode += Integer.toString(firstNumber)
							+ Integer.toString(secondNumber);
			}
		}
	}

	public boolean validateKeyCode() {

		
		
		String[] keyPieces = keyCode.split("-");

		// I HAVE DONE VALIDATION OF CORRECT INPUT FORMAT WITHOUT USE OF REGEX;
		// THOSE ARE COMPLICATED. This makes my code INEFFICIENT and LONGER.

		// if we dont have 3 pieces, its not valid input
		if (keyPieces.length != 3)
			return false;

		// if each piece isnt 6 chars long, its not valid input
		for (String s : keyPieces)
			if (s.length() != 6)
				return false;

		try {

			// we have 3 pieces guaranteed, each of which are 6 chars long. we
			// must check if each piece is a number or not (aka, there are no
			// letters or other symbols).
			// the following 3 lines will throw exceptions if they aren't given
			// a parsable number
			int keyPiece1 = Integer.parseInt(keyPieces[0]);
			int keyPiece2 = Integer.parseInt(keyPieces[1]);
			int keyPiece3 = Integer.parseInt(keyPieces[2]);

			int[] piece1 = { keyPiece1 / 10000, (keyPiece1 / 100) % 100,
					keyPiece1 % 100 };
			int[] piece2 = { keyPiece2 / 10000, (keyPiece2 / 100) % 100,
					keyPiece2 % 100 };
			int[] piece3 = { keyPiece3 / 10000, (keyPiece3 / 100) % 100,
					keyPiece3 % 100 };

			// System.out.print("\tThe 3 pieces: ");
			// System.out.println(piece1 + ":" + piece2 + ":" + piece3);

			// System.out.print("\tPIECE1:\n\t\t");
			int[] piece1parts = { piece1[0] / 10, piece1[0] % 10,
					piece1[1] / 10, piece1[1] % 10, piece1[2] / 10,
					piece1[2] % 10 };

			// for (int i:piece1parts)System.out.print(i+" ");
			// System.out.println("\n");

			// System.out.print("\tPIECE2:\n\t\t");
			int[] piece2parts = { piece2[0] / 10, piece2[0] % 10,
					piece2[1] / 10, piece2[1] % 10, piece2[2] / 10,
					piece2[2] % 10 };
			// for (int i:piece2parts)System.out.print(i+" ");
			// System.out.println("\n");

			// System.out.print("\tPIECE3:\n\t\t");
			int[] piece3parts = { piece3[0] / 10, piece3[0] % 10,
					piece3[1] / 10, piece3[1] % 10, piece3[2] / 10,
					piece3[2] % 10 };
			// for (int i:piece3parts)System.out.print(i+" ");
			// System.out.println("\n");

			int i = 0;

			for (; i < 6;) {
				// System.out.println("\t\tComparing "+piece1parts[i]+" and "+piece1parts[i+1]);
				if ((piece1parts[i] + piece1parts[i + 1]) != 9)
					return false;
				i += 2;
			}
			i = 0;
			for (; i < 6;) {
				// System.out.println("\t\tComparing "+piece2parts[i]+" and "+piece2parts[i+1]);
				if ((piece2parts[i] + piece2parts[i + 1]) != 9)
					return false;
				i += 2;
			}
			i = 0;
			for (; i < 6;) {
				// System.out.println("\t\tComparing "+piece3parts[i]+" and "+piece3parts[i+1]);
				if ((piece3parts[i] + piece3parts[i + 1]) != 9)
					return false;
				i += 2;
			}

			return true;

		} catch (NumberFormatException e) {
			return false;
		}

	}
}
