package com.nested_class;
//Test1

//Eg1]
public class Outer1 {

	private int a = 10, b = 20;

	void m1() { // outer class cannot access inner class data
		System.out.println("Outer class m1() method ");
	}

	class Inner1 {
		int x = 100, y = 200;

		void m2() { // inner class can access outer class data
			System.out.println("Inner class m2() method ");
			System.out.println(x + y);
			System.out.println(a + b);
			m1();
		}
	}
}
