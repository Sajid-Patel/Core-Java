package com.exception_handling;

public class TryCatchBlock_1 {

	public static void main(String[] args) {
		
	    System.out.println("Sajid World");
		
	    try
	    {
		System.out.println(10/0);
	    }
	    
	   // catch(NullPointerException a)--- If catch  block is not matched we get abnormal termination
	    catch(ArithmeticException ae)
	    {
	    	System.out.println(10/2);
	    }
	    
		System.out.println("Rest of Application");
	}

}
