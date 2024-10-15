package com.exception_handling;
//Once exception raised in Try block remaining code of Try block is not executed
public class TryCatchBlock_5b {

	public static void main(String[] args) {
		 System.out.println("Sajid World");
			
		    try
		    {
			System.out.println(10/0);
			System.out.println("Sajid");
			System.out.println("Patel");
		    }
		    
		    catch(ArithmeticException ae)
		    {
		    	System.out.println(10/2);
		    }
		    
			System.out.println("Rest of Application");

	}

}
