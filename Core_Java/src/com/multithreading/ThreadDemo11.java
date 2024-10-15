package com.multithreading;

public class ThreadDemo11 {

	public static void main(String[] args) {

		MyThread11 t = new MyThread11(); 

		Runtime r = Runtime.getRuntime(); //Creating Hook Thread
		r.addShutdownHook(t);

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");

			try {
				Thread.sleep(1000);
			}

			catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			/*
			 * if (i == 0) { System.exit(5);
			 * 
//			 * }
//			 */

		}
	}

}
