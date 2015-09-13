package com.demo.inheritance;

public class Square extends Shape{
// extends means that Square is a child class of Shape.

	public double area(){
		int area;
		area = getLength() * getLength();
		return area;
	}


}