package com.multithreading;
//ThreadDemo5

/*
 Eg5] 
     It is possible to overload run()method but
JVM or Thread class always calls o-arg run() method
 
    If we want to call oveloaded run() method we can call it explicitly
  
 */

public class MyThread5 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" 0-arg User defined Thread5 ");
		}

		run(10); // Explicitly calling of overloaded run() method
	}

	public void run(int a) {
		for (int i = 0; i < 10; i++) {
			System.out.println(" 1-arg User defined Thread5 ");
		}
	}

}
