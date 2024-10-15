package com.multithreading;
//ThreadDemo13

/*
 Eg13]Join=
 To stop executing current thread until execution of Target Thread
 */
public class MyThread13 extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

		}
	}

}
