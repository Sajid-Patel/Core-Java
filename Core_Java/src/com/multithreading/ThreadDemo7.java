package com.multithreading;

public class ThreadDemo7 {

	public static void main(String[] args) {
		MyThread7 t1 = new MyThread7();
		t1.start();
		MyThread7 t2 = new MyThread7();
		t2.start();
		MyThread7 t3 = new MyThread7();
		t3.start();
		MyThread7 t4 = new MyThread7();
		t4.start();
	}

}
