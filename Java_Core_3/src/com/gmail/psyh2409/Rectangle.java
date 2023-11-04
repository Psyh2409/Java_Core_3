package com.gmail.psyh2409;

public class Rectangle {
	private double length;
	private double width;	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle() {
		this.length = 100;
		this.width = 500;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public void areaPrinter() {
		System.out.println("Area of rectangle = " + length * width);
	}
	
	public void perimeterPrinter() {
		System.out.println("Perimeter of rectangle = " + (length + width) * 2);
	}
}
