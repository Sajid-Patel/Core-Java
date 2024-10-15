package com.multithreading;
//ThreadDemo8

/*
 Eg8]
 Multiple threads are performing different tasks 
 */
 class MyThread8 extends Thread {
	public void run()
	{
		System.out.println("HI $P-1");
	}
	
}

 class MyThread8b extends Thread {
	public void run()
	{
		System.out.println("HI $P-2");
	}
	
}

 class MyThread8c extends Thread {
	public void run()
	{
		System.out.println("HI $P-3");
	}
	
}

 class MyThread8d extends Thread {
	public void run()
	{
		System.out.println("HI $P-4");
	}
	
}
