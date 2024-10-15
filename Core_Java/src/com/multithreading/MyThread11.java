package com.multithreading;
//ThreadDemo11

/*
 Eg11]
 Hook Thread=
       Hood Thread will be  executed just before termination of JVM 
       either normally or abnormally 
 */
public class MyThread11 extends Thread {
	public void run() {
		System.out.println("Hook Functionality");
	}

}
