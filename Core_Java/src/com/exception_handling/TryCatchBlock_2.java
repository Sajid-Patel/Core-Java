package com.exception_handling;

//If there is no exception in Try block then Catch block is not checked

public class TryCatchBlock_2 {

	public static void main(String[] args) {

	    System.out.println("Sajid World");
		
	    try
	    {
		System.out.println("SP");
	    }
	    
	    catch(ArithmeticException ae)
	    {
	    	System.out.println(10/2);
	    }
	    
		System.out.println("Rest of Application");
	}

	}


