package com.multithreading;

public class ThreadDemo9 {

	public static void main(String[] args) {
		MyThread9 t1 = new MyThread9();
		t1.start();

		MyThread9 t2 = new MyThread9();
		t2.start();

		System.out.println(t1.getName()); // to get name of thread
		System.out.println(t2.getName());

		t1.setName("Renamed Thread-0"); // Rename Thread
		System.out.println(t1.getName());

		System.out.println(Thread.currentThread().getName()); // to get name of main Thread
		Thread.currentThread().setName("Renamed Main Thread"); // Rename main Thread
		System.out.println(Thread.currentThread().getName());

		System.out.println(t1.getId()); // to get Thread ID
		System.out.println(t2.getId());

		System.out.println(t1.isAlive()); // to check Thread is Alive : returns boolean value
		System.out.println(Thread.activeCount()); //to count number of active Threads
	}

}
