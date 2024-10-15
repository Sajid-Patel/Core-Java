package com.multithreading;

public class ThreadDemo1 {

	public static void main(String[] args) // Main Thread
	{// User Thread Starting Code
		MyThread1 t = new MyThread1();
		t.start();

		/*
		  t.start() = Thread start executed user Thread is created 
		  t.runn() = run() will be executed just like a normal method call 
		  thread is not created
		 */

		// Logics of Main Thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Maind Thread");
		}

	}

}
