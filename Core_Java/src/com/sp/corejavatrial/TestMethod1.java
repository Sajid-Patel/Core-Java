package com.sp.corejavatrial;

//eg of using arguments in methods

public class TestMethod1 {

	void m1(int a, char ch) //instance method
	{
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	
	static void m2(String str, double d) //static method
	{
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(d);
	}
	public static void main(String[] args) {
		TestMethod1 t= new TestMethod1();
		t.m1(10,'s');
		TestMethod1.m2("Sajid", 10.5);

	}

}
