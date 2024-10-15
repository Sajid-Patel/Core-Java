package com.multithreading.SynchronizedKeyword;

public class ThreadDemo {

	public static void main(String[] args) {
		new MyThread1().start();
		new MyThread2().start();
		new MyThread3().start();
	}

}
