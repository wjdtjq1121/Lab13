package edu.handong.csee.java.lab13.prob2;

public class History extends Book{

	private String author;
	
	public History(String name, String author) {
		super(name);
		this.author = author;
	}
	
	public String toString()
	{
		return super.toString() + "\n\tAuthor: " + author;
	}

	public void show()
	{
		System.out.println("<<History>>" + this.toString());
	}
	
}
