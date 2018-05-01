package edu.handong.csee.java.lab13.prob6; // set the package where this belongs to

public class Prob6 { // class which can access from other package

	public static void main(String[] args) { // a void method, invoked by the system
		UpPoint p1 = new UpPoint(3,3); // creating a thing p1, put 3, 3 input value
		DownPoint p2 = new DownPoint(2,5); // creating a thing p2, put 2, 5 input value
		DownPoint p3 = new DownPoint(4,7); // creating a thing p3, put 4, 7 input value
		UpPoint p4 = new UpPoint(9,12); // creating a thing p4, put 9, 12 input value

		Printer.print(p1); // call print method in printer class with p1 value
		Printer.print(p2); // call print method in printer class with p2 value
		Printer.print(p3); // call print method in printer class with p3 value
		Printer.print(p4); // call print method in printer class with p4 value
	}
}
