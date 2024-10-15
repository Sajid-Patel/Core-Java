package com.multithreading;

//ThreadDemo14
public class MyThread14 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("User Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println("Interrupted Thread");
			}
		}
	}
}
