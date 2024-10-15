package com.sp.corejavatrial;


/* Assignment 1 = Solve below
  
   Class TestAss1
  { 
  2-instance variables
  static void m1()
  { print 2-var
  }
   static void m2()
  { print 2-var
  }
  public.static.void main(string[] args)
  {
     call m1();
     call m2();
  } 
  
 */ 


public class TestAss1 {
	
	int a=5;          //instance variable
	double b= 1.5;   //instance variable
	
	static void m1()        //static method 
	{
		TestAss1 T= new TestAss1();
		System.out.println(T.a);
		System.out.println(T.b);
	}
// method is completed object is destroyed 
//so we can not use = m1(); TestAss1 T= new TestAss1(); into m2();
	static void m2()     //static method 
	{
		TestAss1 K= new TestAss1();
		System.out.println(K.a);
		System.out.println(K.b);
		
	}
	public static void main(String[] args)
	{
		
		
		TestAss1.m1();  
		TestAss1.m2();
}
}
