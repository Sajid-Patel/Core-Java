package com.exception_handling;
import java.util.Scanner;
public class Pipe {
	
	public static void main(String[] args)
	{
		try 
		{
			Scanner s= new Scanner(System.in);
		    System.out.println("Enter  a Number");
		    int Number =s.nextInt();
		    System.out.println(10/Number);
		    System.out.println("Sajid".charAt(10));
		}
		
		 catch (ArithmeticException | NumberFormatException e)
	     {
			 System.out.println("Sajid..."+ e);
		}
		
		catch (StringIndexOutOfBoundsException | ClassCastException | NullPointerException a)
		{
			 System.out.println("Patel...0"+a);
		}

		 System.out.println("Rest of Application");
	}

}

