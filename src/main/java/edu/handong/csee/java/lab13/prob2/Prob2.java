package edu.handong.csee.java.lab13.prob2;

public class Prob2 {

	public static void main(String[] args) {
		Book book = new Book("Simple Book");
		Science science = new Science("Hello Physics", "ScienceWorld"); // Name, publisher
		History history1 = new History("What Is history?", "E.H.Brian"); //Name, Author
		
		book.show();
		science.show();
		history1.show();
		
		

	}

}
