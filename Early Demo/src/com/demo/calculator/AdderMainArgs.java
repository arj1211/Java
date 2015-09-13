package com.demo.calculator;

public class AdderMainArgs {
	public static void main (String[] args) {
		int a = Integer.parseInt(args [0]);
		String operation = args [1];
		int c = Integer.parseInt(args [2]);
		
		Adder anAdder = new Adder();

		if (operation.equalsIgnoreCase("+")) {

			anAdder.sum(a,c);
			System.out.println("Sum = " + anAdder.sum(a,c));
		}
		
		else if (operation.equalsIgnoreCase("-")) {

			anAdder.difference(a,c);
			System.out.println("Difference = " + anAdder.difference(a,c));
		}
		else if (operation.equalsIgnoreCase("x")) {
		
			anAdder.product(a,c);
			System.out.println("Product = " + anAdder.product(a,c));
		}
		
		else if (operation.equalsIgnoreCase("/")) {

			anAdder.quo(a,c);
			System.out.println("Quotient = " + anAdder.quo(a,c));
		}
	
		else {

			System.out.println("Incorrect Format! eg. '5 + 8'. Operations + , - , / , x accepted");		
		}
	
	}
}
