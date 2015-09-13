package com.demo.inheritance;

public class Rectangle extends Shape {
	// extends means that Rectangle is a child class of Shape.
			
		public double area(){
			int area;
			area = getLength() * getWidth();
			return area;
			
		}
	}


