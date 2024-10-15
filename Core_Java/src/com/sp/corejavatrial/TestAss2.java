package com.sp.corejavatrial;


/* Assignment 2 = Solve below

Class TestAss1
{ 
2-instance variables
2- static variables
 void m1()
{ print 4-var
}
static void m2()
{ print 4-var
}
public.static.void main(string[] args)
{
  call m1();
  call m2();
} 

*/ 

public class TestAss2 {

	
	int a =10;                  //instance variable
	boolean b = true;            //instance variable
	
	static double c = 20.5;     //static variable 
	static int d = 30;           //static variable 
	
	
	
	
	public static void main(String[] args) //main method
	{
		
		TestAss2 K= new TestAss2();
		K.m1();
		
		TestAss2.m2();  
		
	
	}
	

	void m1()    //instance method 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(TestAss2.c); //call static variable by class name(Recomanded method)
		System.out.println(TestAss2.d);
		
	}
	
	static void m2() ////static method 
	{
		TestAss2 T= new TestAss2();
		System.out.println(T.a);
		System.out.println(T.b);
		System.out.println(TestAss2.c);
		System.out.println(TestAss2.d);
	}

}


