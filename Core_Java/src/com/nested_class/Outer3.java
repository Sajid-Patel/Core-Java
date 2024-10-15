package com.nested_class;

public class Outer3 {

	int a = 10, b = 20;

	class Inner3 {
		int a = 100, b = 200;

		void add(int a, int b) {
			System.out.println(a + b);
			System.out.println(this.a + this.b);
			System.out.println(Outer3.this.a + Outer3.this.b);
			// outer.this is used to represent outer class variable
		}

	}

	public static void main(String[] args) {
		new Outer3().new Inner3().add(1000, 2000);
	}

}
