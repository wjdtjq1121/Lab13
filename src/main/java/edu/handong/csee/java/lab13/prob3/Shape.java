package edu.handong.csee.java.lab13.prob3;

public abstract class Shape {

	public abstract double area();
	public abstract double perimeter();
	public void display()
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() + "\n");		
	}
}
