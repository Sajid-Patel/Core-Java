package com.exception_handling;

//between two blocks statements(SOP) declarations are invalid

public class TryCatchBlock_4 {

	public static void main(String[] args) {
		 System.out.println("Sajid World");
			
		    try
		    {
			System.out.println("SP");
		    }
		    
		    System.out.println("SP");
		    
		    catch(ArithmeticException ae)
		    {
		    	System.out.println(10/2);
		    }
		    
			System.out.println("Rest of Application");
		}

}
