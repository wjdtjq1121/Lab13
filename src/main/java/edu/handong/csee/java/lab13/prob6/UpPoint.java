package edu.handong.csee.java.lab13.prob6; // set the package where this belongs to

public class UpPoint implements CapitalPrintable{ // class which implements capitalprintable contains heading for number of methods (interface)

		private int x, y; // declares two members
		
		UpPoint(int x, int y){this.x = x; this.y = y;} // constructor, has x, y input values, and stores them in x, y class uppoint

		public String toString() // method has string return type and no input value
		{
			return "x : " + x + " y : " + y; // print x, y value statement
		}

}
