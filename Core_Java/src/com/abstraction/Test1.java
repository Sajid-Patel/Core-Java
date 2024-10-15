package com.abstraction;

public class Test1 extends Test {
void m1() {System.out.println("m1 method");}

void m2() {System.out.println("m2 method");}

void m3() {System.out.println("m3 method");}

	public static void main(String[] args) {
		
		Test1 t= new Test1();
		t.m1();
		t.m2();
		t.m3();
		t.m4();

		//alternate way to print -----[  parent p= new child ();  ]
		Test A= new Test1();
		A.m1();
	    A.m2();
	    A.m3();
	    A.m4();
	
	}

}
