package com.abstraction;

public class Child3 extends Child2 {
	
	//Parent 3 abstract methods available  and all methods are executed 
	void m3() {System.out.println("M3 method");}
	
	public static void main(String[] args) {
		 
		Child3 c= new Child3();
		c.m1();
		c.m2();
		c.m3();

	}

}
