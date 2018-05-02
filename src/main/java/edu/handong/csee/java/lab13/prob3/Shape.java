package edu.handong.csee.java.lab13.prob3; // set the package where this belongs to

public abstract class Shape { // a class which has method heading without implementation its body, can access from other package

	public abstract double getArea(); // has heading method, no implementaion its body
	public abstract double getPerimeter(); // has heading method, no implementaion its body
	public void toDisplay() // void method no input value
	{
		System.out.println("Area: "+getArea()+"\nPerimeter: "+getPerimeter() + "\n"); // prints the area and perimeter, each calling method, respectively.
	}
}
