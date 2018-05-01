package edu.handong.csee.java.lab13.prob6; // set the package where this belongs to

public class DownPoint { // a class which can access from other package
	private int x, y; // declares two members
	
	DownPoint(int x, int y){this.x = x; this.y = y;} // a constructor, has x, y input value, stores them in x and y in downpoint class
	
	public String toString() // method return string type value, no input value
	{
		return "x : " + x + " y : " + y; // returns x and y value statement
	}
}
