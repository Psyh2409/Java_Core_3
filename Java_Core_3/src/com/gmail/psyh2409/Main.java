package com.gmail.psyh2409;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(10, 20);
		Rectangle rect1 = new Rectangle();
		rect.areaPrinter();
		rect1.perimeterPrinter();
		
		Circle circle = new Circle(10);
		Circle circle1 = new Circle();
		
		System.out.println("Circle with diameter " + circle.getDiameter());
		circle.printArea();
		System.out.println("Circle with radius " + circle1.getRadius());
		circle.printPerimeter();
		
	}

}
