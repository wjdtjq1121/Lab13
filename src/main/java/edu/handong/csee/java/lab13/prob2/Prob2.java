package edu.handong.csee.java.lab13.prob2; // set the package where this belongs to

public class Prob2 { // a class which can access from other package

	public static void main(String[] args) { // a void method, invoked by the system.
		Book book = new Book("Simple Book"); // makes a instance, book , put input value simple book in book constructor.
		Science science = new Science("Hello Physics", "ScienceWorld"); // Name, publisher - makes a science instance, put input values in constructor
		History history1 = new History("What Is history?", "E.H.Brian"); //Name, Author - makes a history1 instance, put input values in constructor

		book.toShow(); // calls a show method with book instance
		science.toShow(); // calls a show method with science instance
		history1.toShow(); // calls a show method with history1 instance
	}

}
