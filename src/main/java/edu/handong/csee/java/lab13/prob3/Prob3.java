package edu.handong.csee.java.lab13.prob3; // set the package where this belongs to 

import java.util.Scanner; // bring the scanner class from java library

public class Prob3 { // a class which can access from other package

	public static void main(String[] args) { // a void method, invoked by the system
		double n1, n2; // declares n1, n2 member
		Scanner keyboard = new Scanner(System.in); // sets up things so keyboard can accept system input

		System.out.print("Enter radius: "); // print the statement, ask the user to put radius
		n1 = keyboard.nextDouble(); // stores double type value in n1 member

		Circle c1 = new Circle(n1); // set up things and put n1 member value so the constructor can execute

		System.out.println("Radius: " + c1.getRadius()); // print the statement radius value
		c1.display(); // call display method to show the value

		System.out.print("Enter length and width: "); // print the statement to ask the user to put values
		n1 = keyboard.nextDouble(); // stores double type value in n1
		n2 = keyboard.nextDouble(); // stores double type value in n2
		Rectangle r1 = new Rectangle(n1, n2); // sets up things and put two input values n1, n2 so constructor can execute

		System.out.println("Length: " + r1.getLength()); // print the statement to show the length value
		System.out.println("Width: " + r1.getWidth()); // print the statement to show the width value
		r1.display(); // call display method to show the value
	}

}
