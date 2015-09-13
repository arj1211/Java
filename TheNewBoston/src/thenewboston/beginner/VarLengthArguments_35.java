package thenewboston.beginner;

public class VarLengthArguments_35 {

	public static void main(String[] args) {
		System.out.println(average(54,24,5,21,6358,31));
	}

	public static int average(int...numbers){
		
				int total=0;
			
				for (int x: numbers)
				total+=x;
				
			return total/numbers.length;
		
	}
}
