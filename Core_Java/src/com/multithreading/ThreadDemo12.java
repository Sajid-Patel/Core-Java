package com.multithreading;

import java.util.Iterator;

public class ThreadDemo12 {

	public static void main(String[] args) {
		MyThread12 t = new MyThread12();
		// public final void setDeamon(boolean);
		t.setDaemon(true);
		t.start();

		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.getStackTrace();
			}
		}
	}

}
