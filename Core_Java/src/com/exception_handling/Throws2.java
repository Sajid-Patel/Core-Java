package com.exception_handling;

/*
In this eg exception is handled by JVM
because all methods are used = throws InterruptedException
*/

public class Throws2 {

		void StudentDetails()  throws InterruptedException
		{
			System.out.println("Sajid Relaxing");
			Thread.sleep(2000); // Interrupted Exception
			System.out.println("Sajid Relaxing");
		}
		
		void HOD()  throws InterruptedException
		{
			StudentDetails();
		}
		
		void Principle() throws InterruptedException
		{	
			HOD(); 
	    }

	    void OfficeBoy() throws InterruptedException
	    {
	    	Principle();	
	    }
		
		public static void main(String[] args) throws InterruptedException
		{
			Throws2 t=new Throws2();
			t.OfficeBoy();

		}

	}
