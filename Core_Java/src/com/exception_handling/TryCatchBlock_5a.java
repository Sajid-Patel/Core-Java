package com.exception_handling;

public class TryCatchBlock_5a {

	public static void main(String[] args) {
		 System.out.println("Sajid World");
			
		    try
		    {
		    System.out.println("Sajid");
		    System.out.println("Patel");
			System.out.println(10/0);
		    }
		    
		    catch(ArithmeticException ae)
		    {
		    	System.out.println(10/2);
		    }
		    
			System.out.println("Rest of Application");
		}

}
