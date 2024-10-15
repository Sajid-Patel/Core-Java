package com.multithreading;
// Approach 2> Interface Implements 

public class AnonymousInnerClass2 {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("First Thread");
			}
		};
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("Second Thread");
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();

	}

}
