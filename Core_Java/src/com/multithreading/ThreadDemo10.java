package com.multithreading;

public class ThreadDemo10 {

	public static void main(String[] args) {
		MyThread10 t1 = new MyThread10();
		// t1.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);

		MyThread10 t2 = new MyThread10();
		// t2.setPriority(1);
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();

	}

}
