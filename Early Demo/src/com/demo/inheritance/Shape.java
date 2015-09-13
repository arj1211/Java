package com.demo.inheritance;

public abstract class Shape {
	
		private int length;
		private int width;
		
	public abstract double area();
	
	
	public int getLength(){
		return length;
	}
	
	
	public void setLength(int lengthIn){
		length = lengthIn;
	}
	
	public int getWidth(){
		return width;
	}
	
	public void setWidth(int widthIn){
		width = widthIn;
	}
}
