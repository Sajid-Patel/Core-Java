package com.nested_class;

public class StaticNestedOuter1 {
	static int p = 10;
	static int q = 20;

	static class StaticNestedInner1 {
		void disp() {
			System.out.println(p);
			System.err.println(q);
		}

	}

	public static void main(String[] args) {
		new StaticNestedOuter1.StaticNestedInner1().disp();
	}

}
