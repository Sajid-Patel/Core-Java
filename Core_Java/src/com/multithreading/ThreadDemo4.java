package com.multithreading;

public class ThreadDemo4 {

	public static void main(String[] args)
	{
	
		MyThread4 t = new MyThread4();
		t.start();

		
		for (int i = 0; i < 10; i++) {
			System.out.println("Maind Thread 4 ");
		}

	}

}
