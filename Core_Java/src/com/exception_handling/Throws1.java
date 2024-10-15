package com.exception_handling;
/*
 In this eg exception is handled by method= void Principle() 
*/
public class Throws1 {

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
	
	void Principle() 
	
	{	
		try
	        { HOD(); }
	    catch (InterruptedException ie) 
	       {System.out.println("Exception....!"); }
    }

    void OfficeBoy() 
    {
    	Principle();	
    }
	
	public static void main(String[] args) {
		Throws1 t=new Throws1();
		t.OfficeBoy();

	}

}
