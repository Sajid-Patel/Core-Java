package com.exception_handling;
/*
  Unchecked Exception=  (Child class of Run Time Exception)
  
  *The Exception which are not checked by compiler 
  *These are displayed at RunTime
  
  */
public class Unchecked {

	public static void main(String[] args) {
		System.out.println("Sajid World");
		
		//System.out.println(10/0);  ---ArithmeticException
		
		
		System.out.println("Patel".charAt(2));
		//System.out.println("Patel".charAt(12));
		//----- StringIndexOutOfBoundsException
		
		Integer i=Integer.valueOf("10");
		//Integer i1=Integer.valueOf("Ten");
		//----NumberFormatException
		
		System.out.println("Rest of Application");
	}

}
