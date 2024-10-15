package com.multithreading.SynchronizedKeyword;

/*
 Synchronized Keyword=
 To overcome data inconsistancy
 To get Thread seafty to application
 Performance is low
 
 
 If it is non-Synchronized all threads are able to access
 If it is  Synchronized one Thread is able to access at a time
 
 */
public class A {

	synchronized static void msg(String str) {
		for (int i = 0; i < 4; i++) {
			System.out.println("Hi " + str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
