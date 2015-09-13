package com.demo.inheritance;

public class Cylinder extends Circle {

	private int height;
	
	public double volume(){
		double volume = area() * height;
		return volume;
		
	}
	
	public double setHeight(int heightIn){
		return height = heightIn;
		

	}
}
