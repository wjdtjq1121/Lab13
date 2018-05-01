package edu.handong.csee.java.lab13.prob3; // set the package where this belongs to 

public class Circle extends Shape{ // a class which can access from other package, circle inherits shape class
	private double radius; // declares double type radius member
	
	public Circle(double r) { // constructor, executes when circle instance is created, has r input value
		radius = r; // stores r input value in radius member in circle class
	}

	public double area() // method no input value, has return value.
	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r, calculates area value and return it
	}
	public double perimeter() // method no input value, has return value
	{
		return 2.0 * Math.PI * radius; // 2*pi*radius, calculates value and return it
	}
	
	public double getRadius() // method no input value and return radius value
	{
		return radius; // return radius value
	}
	
}
