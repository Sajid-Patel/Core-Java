package com.multithreading;

public class ThreadDemo5 {

	public static void main(String[] args) {

		// User Thread Starting Code
		MyThread5 t = new MyThread5();
		t.start();

		// Logics of Main Thread
		for (int i = 0; i < 10; i++) {
			System.out.println(" Main Thread5 ");
		}
	}

}
