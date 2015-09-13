package thenewboston.beginner;

public class ArrayTable_28 {
	public static void main(String[] args) {

		System.out.println("Index\tValue\n");
		int aTab[] = { 45, 85, 65, 21, 848 };

		for (int counter = 0; counter < aTab.length; counter++) {
			System.out.println(counter+"\t"+aTab[counter]);
		}

	}
}
