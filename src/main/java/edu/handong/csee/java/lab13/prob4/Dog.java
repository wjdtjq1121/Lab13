package edu.handong.csee.java.lab13.prob4; // set the package where this belongs to 

public class Dog extends Animal implements Pet{ // class dog inherits animal and implement pet, contains heading for number of methods (interfaces)
	public String food() // method has string type return value, no input value
	{
		return "(Dog!)" + "Sausage"; // print the specific statement for dog 
	}
}