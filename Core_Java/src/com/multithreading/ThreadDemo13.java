package com.multithreading;

public class ThreadDemo13 {

	public static void main(String[] args) {
		MyThread13 t1 = new MyThread13();
		MyThread13 t2 = new MyThread13();

		t1.start();
		try {
			t1.join(2000);
		} // Main Thread executing this line
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		t2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread=" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.getStackTrace();
			}

		}

	}

}
