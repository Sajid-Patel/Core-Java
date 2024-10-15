package com.multithreading;
//ThreadDemo6

/*
  Eg6]
  No need to write all functionality  in run() method
  But Thread Class start() method is only calling run()

  We can declare our own methods but call those methods in run() method, 
  because those methods called in run() method will be executed
 */

public class MyThread6 extends Thread {
	public void run() {
		m1();
		m2();
		m3();

	}

	void m1() {
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}

	void m3() {
		System.out.println("m3 method");
	}
}
