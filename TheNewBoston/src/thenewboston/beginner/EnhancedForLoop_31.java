package thenewboston.beginner;

public class EnhancedForLoop_31 {

	public static void main(String[] args) {
		int enF[]={4,6,4,8};
		int total=0;
		
		
		// int x is element in enF. Loop goes through each
		// element in enF array; one per loop rep
		for(int x: enF){
			total+=x;
		}

		System.out.println("Sum= "+total);
	}

}
