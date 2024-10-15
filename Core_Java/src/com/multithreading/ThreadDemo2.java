package com.multithreading;

/*
 t.start() = Thread start executed user Thread is created
 t.runn() = run() will be executed just like a normal method call thread is not created
 */
public class ThreadDemo2 {

	public static void main(String[] args) // Main Thread
	{// User Thread Starting Code
		MyThread2 t = new MyThread2();
		t.run();

		// Logics of Main Thread
		for (int i = 0; i < 10; i++) {
			System.out.println("Maind Thread 2");
		}

	}
}
