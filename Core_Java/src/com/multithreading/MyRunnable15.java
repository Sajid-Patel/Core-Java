package com.multithreading;
//ThreadDemo15

public class MyRunnable15 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("User Thread");
		}
	}
}
