package com.wrapper_classes;
/*
 Example 3] Primitive to String----valueOf()
            String to Primitive----parsexxx() {xxx= Primitive data types}
 */
public class Example3 {

	public static void main(String[] args) {
		//Primitive to String----valueOf()
		int a=10, b=20;
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		System.out.println( s1 + s2 );

		
		//String to Primitive----parsexxx() {xxx= Primitive data types}
		String str1 = "30";
		String str2 = "40";
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		System.out.println( x + y );
		
	}

}
