package com.multithreading;
//ThreadDemo1

//Here output will vary every Runtime because of Thread Scheduler 

public class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" User Defined Thread");
		}
	}
}
