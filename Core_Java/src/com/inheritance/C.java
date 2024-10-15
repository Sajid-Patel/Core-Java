package com.inheritance;

public class C extends B  {
	void m5()
	{
		System.out.println("m5 method");
		
	}
	
	void m6()
	{
		System.out.println("m6 method");
		
	}

	public static void main(String args[]) 
	{
		
		A a = new A();
		a.m1();
		a.m2();
		
		B b = new B();
		b.m3();
		b.m4();
		
		C c= new C();
		c.m5();
		c.m6();
	}

}
