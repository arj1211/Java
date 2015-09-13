package thenewboston.beginner;

public class MultipleConstructors_39_40_41Main {

	public static void main(String[] args) {
		
		MultipleConstructors_39_40_41 mulCon = new MultipleConstructors_39_40_41();
		MultipleConstructors_39_40_41 mulCon2 = new MultipleConstructors_39_40_41(5);
		MultipleConstructors_39_40_41 mulCon3 = new MultipleConstructors_39_40_41(5,13);
		MultipleConstructors_39_40_41 mulCon4 = new MultipleConstructors_39_40_41(5,13,43);
		
		
		System.out.printf("%s\n", mulCon.toMilitary());
		System.out.printf("%s\n", mulCon2.toMilitary());
		System.out.printf("%s\n", mulCon3.toMilitary());
		System.out.printf("%s\n", mulCon4.toMilitary());
	}

}
