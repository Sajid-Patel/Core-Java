package com.multithreading;

public class ThreadDemo8 {

	public static void main(String[] args) {
		MyThread8 t1 = new MyThread8();
		t1.start();
		
		MyThread8b t2 = new MyThread8b();
		t2.start();
		
		MyThread8c t3 = new MyThread8c();
		t3.start();
		
		MyThread8d t4 = new MyThread8d();
		t4.start();

	
	}

}
