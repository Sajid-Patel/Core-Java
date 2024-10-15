package com.multithreading;

public class ThreadDemo14 {

	public static void main(String[] args) {
		MyThread14 t = new MyThread14();
		t.start();

		t.interrupt();

	}

}
