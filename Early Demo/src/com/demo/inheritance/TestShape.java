package com.demo.inheritance;

public class TestShape {

	public static void main(String[] args) {
			
				Square aSquare = new Square();
				
				aSquare.setLength(5);
				
				System.out.println("Square Area: " + aSquare.area());
								
				
			
				Rectangle aRectangle = new Rectangle();
				
				aRectangle.setLength(5);
				aRectangle.setWidth(3);
				
				System.out.println("Rectangle Area: " + aRectangle.area());
				
			
				Circle aCircle = new Circle();
				
				aCircle.setRadius(8);
				
				System.out.println("Circle Area: " + aCircle.area());
				
				
				
				Cylinder aCyl = new Cylinder();
				
				aCyl.setHeight(10);
				aCyl.setRadius(7);
				
				System.out.println("Cylinder Volume: " + aCyl.volume());
				
	}

}
