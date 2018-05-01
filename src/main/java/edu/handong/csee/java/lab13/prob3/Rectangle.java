package edu.handong.csee.java.lab13.prob3; // set the package where this belongs to

public class Rectangle extends Shape { // a class which can access from other package, it inherits shape class
	private double length; // declares length member double type
	private double width; // declares width member double type 

	public Rectangle(double length, double width) { // constructor, has length width input values so constructor can execute
		this.length = length; // stores length input value in length rect class member
		this.width = width; // stores width input value in width rect class member
	}

	public double area() // method no input value, has return value double type
	{
		return length*width; // returns the area value
	}
	public double perimeter() // method no input value, has return value double type 
	{
		return 2*(length+width); // returns perimeter value
	}
	public double getLength() // method no input value, has return type double value 
	{
		return length; // returns the length value
	}
	public double getWidth() // method no input value, has return type double value
	{
		return width; // returns the width value
	}

}
