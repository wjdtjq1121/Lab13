package edu.handong.csee.java.lab13.prob3; // set the package where this belongs to

public abstract class Shape { // a class which has method heading without implementation its body, can access from other package

	public abstract double area(); // has heading method, no implementaion its body
	public abstract double perimeter(); // has heading method, no implementaion its body
	public void display() // void method no input value
	{
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter() + "\n"); // prints the area and perimeter, each calling method, respectively.
	}
}
