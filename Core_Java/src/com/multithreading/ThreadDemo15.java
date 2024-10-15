package com.multithreading;

public class ThreadDemo15 {

	public static void main(String[] args) {

		MyRunnable15 r = new MyRunnable15();
		Thread t = new Thread(r); // converting r to t because start(); is not available Runnable(contains only
									// one method i.e run() method)
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
