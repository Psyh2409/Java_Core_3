package com.gmail.psyh2409;

public class Circle {
	
	private double radius;
	private double diameter;
	
	public Circle(double radius) {
		this.radius = radius;
		this.diameter = 2*radius;
	}

	public Circle() {
		this.radius = 100;
		this.diameter = 2*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.diameter = 2*radius;
	}

	public double getDiameter() {
		return diameter;
	}	
	
	public void printArea() {
		System.out.println("Area of circle = " + (Math.PI / 4) * Math.pow(diameter, 2));
	}
	
	public void printPerimeter() {
		System.out.println("Perimeter of circle = " + 2 * Math.PI * radius);
	}
}
