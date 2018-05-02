package edu.handong.csee.java.lab13.prob4; // set the package where this belongs to 

public class Cat extends Animal implements Pet // class cat inherits animal and it implements pet, contains heading for number of methods (interfaces)
{
	public String showFood() { // method no input value return string type value
		return "(Cat!)" + "Fish"; // return the specific statement
	}
}