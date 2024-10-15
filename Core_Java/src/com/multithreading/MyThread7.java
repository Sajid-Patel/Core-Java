package com.multithreading;
//ThreadDemo7

/*
  Eg7]
  ~Multiple threads are performing single task
  
  ~For each & every thread one stack memory will be created 
  ~The method calls performed by  thread ,
  those method calls are stored in  stack memory 
  
   ~ When thread is destroyed ,Stack memory is automatically destroyed
 */
public class MyThread7 extends Thread {
	public void run() {
		System.out.println("Hey SP");

	}

}
