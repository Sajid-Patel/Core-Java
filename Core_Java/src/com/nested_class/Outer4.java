package com.nested_class;
//Eg4]

public class Outer4 {

	Outer4() // Outer class Constructor
	{
		System.out.println("Outer class Constructer");
	}

	// Outer class Instance Block
	{
		System.out.println("Outer class Instance block");
	}

	// Outer class Static Block
	static {
		System.out.println("Outer class Static block");
	}

	class Inner4 {
		Inner4() // Inner Class Constructor
		{
			System.out.println("Inner class Constructer");
		}

		// Inner Class Instance Block
		{
			System.out.println("Inner class Instance block");
		}

		// Inner Class Static Block
		static {
			System.out.println("Inner class Static block");
		}
	}

	public static void main(String[] args) {
		new Outer4().new Inner4();
	}
}
