package com.demo.calculator;

import java.io.IOException;

public class TaxCalUser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TaxCal mytax = new TaxCal();
		
		
		double price1 = mytax.getSalePrice();
		
		double tax1 = mytax.getTax();
		
		mytax.taxMe(price1, tax1);
		
		
	}

}
