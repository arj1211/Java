package com.demo.calculator;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TaxCal {

	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	public double getSalePrice() throws IOException {
		double priceNum;
		String priceWord;
		System.out.println("Sale Price?");
		priceWord = stdin.readLine().trim();
		priceNum = Double.parseDouble(priceWord);
		return priceNum;
	}
	
	public double getTax() throws IOException {
		double taxNum;
		String taxWord;
		System.out.println("Tax %?");
		taxWord = stdin.readLine().trim();
		taxNum = (Double.parseDouble(taxWord)/100);
		return taxNum;
	}
		
	public double taxMe(double priceNum, double taxNum){
		double total = ((priceNum*taxNum) + priceNum);
		double total2= Double.valueOf(new DecimalFormat("#.##").format(
                total));
		System.out.println("Total Cost: "+total2);
		return total2;
		
	}
}
