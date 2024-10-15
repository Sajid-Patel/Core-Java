package com.multithreading;

//ThreadDemo12
/*
 Eg12] Deamon Thread=
 Threads which are executing at background to  support foreground Threads
 eg= Garbage collection, finalize, thread shedular etc 
 */
public class MyThread12 extends Thread {
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Deamon Functionality");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.getStackTrace();
			}

		}
	}
}
