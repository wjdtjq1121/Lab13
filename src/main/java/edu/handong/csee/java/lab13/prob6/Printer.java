package edu.handong.csee.java.lab13.prob6; // set the package where this belongs to

public class Printer { // class which can access from other package

	public static void toPrint(Object object) // static void method, has object input value
	{
		String str = object.toString(); // calling method and store the value in str
		if(object instanceof CapitalPrintable) // condition if object is a type of capitalprintable
			str = str.toUpperCase(); // true, call touppercase method to store the value in str
		System.out.println(str); // print str value
	}

}
