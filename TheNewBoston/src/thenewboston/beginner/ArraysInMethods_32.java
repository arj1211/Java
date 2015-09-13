package thenewboston.beginner;

public class ArraysInMethods_32 {
	public static void main(String[] args) {
		int aM[]={5,9,36,4};
		
		add5(aM);
		
		for(int y:aM){
			System.out.println(y);
		}
	}
	// adds 5 to each element in aM array
	public static void add5(int x[]){
		
		for (int counter=0;counter<x.length;counter++){
			x[counter]+=5;
		}
	}
	
}
