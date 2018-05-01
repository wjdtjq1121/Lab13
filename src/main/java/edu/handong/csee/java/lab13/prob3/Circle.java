package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}

	public double area()
	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r
	}
	public double perimeter()
	{
		return 2.0 * Math.PI * radius; // 2*pi*radius
	}
	
	public double getRadius()
	{
		return radius;
	}
	
}
