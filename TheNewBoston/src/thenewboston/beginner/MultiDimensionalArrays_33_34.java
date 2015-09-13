package thenewboston.beginner;
// Making a visual table using a multi dimensional array
public class MultiDimensionalArrays_33_34 {

	public static void main(String[] args) {
		int firstArray[][]={/*first row, first array*/{8,5},/*second row, first array*/{75,35,45,84}};
		int secondArray[][]={/*first row, second array*/{9,4,6,21},/*second row, second array*/{7,65,5,44},/*third row, second array*/{55}};
		System.out.println("First Array:\n");
		display(firstArray);
		
		System.out.println("Second Array:\n");
		display(secondArray);
	}

	public static void display(int array[][]){
/* vvv loops through rows. Once a row is done, switches to next line*/
		for(int row=0; row<array.length;row++){
/* vvv loops through columns. after an element is printed in a column "cell", puts a tab space*/
			for(int column=0;column<array[row].length;column++){
				System.out.print(array[row][column]+"\t");
			}
			System.out.println();
		}
	}
}
