package com.multithreading;
//ThreadDemo4

/*
 It is not recommended to override start() method
 
  If we are overriding start() method, your class start() Method will be  executed, Thread is not created 
 */
public class MyThread4 extends Thread {
	public void start() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" User Defined Thread 4");
		}
	}
}
