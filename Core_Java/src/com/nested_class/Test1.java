package com.nested_class;

public class Test1 {

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.m1();

		Outer1.Inner1 i = o.new Inner1();
		i.m2();

	}

}
