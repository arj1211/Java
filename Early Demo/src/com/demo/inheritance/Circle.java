package com.demo.inheritance;

public class Circle extends Shape {

		private double pi = 3.14;
		private int radius;
		
		
		
		public int setRadius(int radiusIn){
			return radius = radiusIn;
		}
		
	@Override
	public double area() {
		// TODO Auto-generated method stub
			double area = Math.pow(radius, 2) * pi;
			return area;
	}

	
	
}
