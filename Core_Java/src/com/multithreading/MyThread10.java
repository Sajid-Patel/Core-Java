package com.multithreading;
//ThreadDemo10


public class MyThread10 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
