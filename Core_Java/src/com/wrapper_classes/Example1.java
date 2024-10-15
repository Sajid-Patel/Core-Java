package com.wrapper_classes;

/*
 Wrapper Class=
 To  represent 8 Primitive Data Types in form of objects we required 8 classes,
 those classes are called Wrapper Classes
 
 There are 2 ways to create Wrapper Object=
 1> By using Constructor approach
 2>By using valueOf() method 
 
 
 Example 1] = primitive or String ---->wrapper object
 */
public class Example1 {

	public static void main(String[] args) {

		// 1> By using Constructor approach

		Integer i1 = new Integer(100); // int
		Integer i2 = new Integer("100"); // String
		System.out.println(i1 + i2);

		Float f1 = new Float(10.5); // double
		Float f2 = new Float(10.5f); // float
		Float f3 = new Float("10.5"); // String

		Character ch = new Character('S'); // char

		// 2>By using valueOf() method

		Integer I1 = Integer.valueOf(10); // int
		Integer I2 = Integer.valueOf("10"); // String
		System.out.println(I1 + I2);

		// Float F1 = Float.valueOf(10.5); //double
		Float F2 = Float.valueOf(10.5f); // float
		Float F3 = Float.valueOf("10.5"); // String

		Character CH = Character.valueOf('S'); // char

	}

}
