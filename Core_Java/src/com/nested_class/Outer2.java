package com.nested_class;
//Eg2] variables with different name
public class Outer2 {

	private int a = 10, b = 20;

	class Inner2 {
		int x = 100, y = 200;

		void add(int i, int j) {
			System.out.println(i + j);
			System.out.println(x + y);
			System.out.println(a + b);
		}
	}

	public static void main(String[] args) {

		// nameless object creation ----- short code
		new Outer2().new Inner2().add(1000, 2000);

		
		// regular object code
		/*
		  Outer2 o = new Outer2();
	      Outer2.Inner2 i = o.new Inner2();
	      i.add(1000, 2000);
		 */

	}

}
