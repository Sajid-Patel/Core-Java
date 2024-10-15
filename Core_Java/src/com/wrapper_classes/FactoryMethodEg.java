package com.wrapper_classes;

public class FactoryMethodEg {

	public static void main(String[] args) {

		// Static Factory Method : because method is called by class name
		Integer i1 = Integer.valueOf(10);

		Runtime r = Runtime.getRuntime();

	
		
		// Instance Factory Method
		String s = "Sajid";
		String ss = s.concat("Patel");
		// here concat() method combines two object & returns new String Object

		
		
		// Pattern Factory Method : Method returns different class object
		Integer x = Integer.valueOf(10);
		String str = x.toString();
		// here toString() method belongs to Integer class & returns String object
	}

}
