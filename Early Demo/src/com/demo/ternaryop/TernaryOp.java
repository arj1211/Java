package com.demo.ternaryop;

public class TernaryOp {

	public static void main(String[] args) {
	
		int value1 = 1;
		int value2 = 2;
		int result;
		
		result = (value1 == value2) ? value1 : value2;
		/* if (value1 == value2){
		 * result = value1;
		 * }
		 * else {
		 * result = value2;
		 * }
		 */
		System.out.println(result);
	}

}
