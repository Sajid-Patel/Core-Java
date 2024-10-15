package com.multithreading;

public class Test {
	public void finalize() {
		System.out.println("Object is destroyed");
	}

	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < 10; i++) { System.out.println("S"); }
		 */

		Test t1 = new Test();
		Test t2 = new Test();

		System.out.println(t1);
		System.out.println(t2);
	
		t1 = null;
		t2 = null;

		System.out.println(t1);
		System.out.println(t2);

		//System.gc();
	}
}
