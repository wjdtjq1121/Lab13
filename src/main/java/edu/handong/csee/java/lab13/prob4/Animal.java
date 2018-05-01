package edu.handong.csee.java.lab13.prob4; // set the package where this belongs to

public class Animal { // a class which can access from other package

	private String name; // declares string type name member

	public void setName(String name) { // void method, has string type input value 
		this.name = name; // stores input value in name member animal class
	}

	public void getName() { // has no input value and return value.
		System.out.println("Name: " + name); // print the statement name value
	}
}
