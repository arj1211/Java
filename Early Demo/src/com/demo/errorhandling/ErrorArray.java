package com.demo.errorhandling;

public class ErrorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] error = new String[5];
		
		error[0] = "Hello";
		error[1] = "heyy";
		error[2] = "what up?";
		error[3] = "nm u?";
		error[4] = "learning java #Swag";
	
		for (int counter = 0; counter<(error.length); counter++){
			System.out.println(error[counter]);
			
		}
		
		try {
				for (int counter = 0; counter<7; counter++){
				System.out.println(error[counter]);	
				}
				} catch (ArrayIndexOutOfBoundsException e){
					System.out.println("Array length greater than" + error.length);
		}
		
		try {
			String errorString = null;
			System.out.println("first 4 letters of error string are : " + errorString.substring(0,5));
			
			} catch (NullPointerException ne) {
				
			}
		
	}

}
