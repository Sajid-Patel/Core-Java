package com.abstraction;

public class constructorTest1 extends constructorTest {
void  m1() {
	System.out.println("m1 method");
}
constructorTest1(){
	//super();  ----automatically generated
	System.out.println("normal  class constructor");
}
	public static void main(String[]args) {
		new constructorTest1().m1();
	}

}
