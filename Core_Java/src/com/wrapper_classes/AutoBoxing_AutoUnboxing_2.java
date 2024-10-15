package com.wrapper_classes;

import java.util.ArrayList;

/*
 AutoBoxing & AutoUnboxing were relesed is java 1.5 version
 below is eg showing how objects were created before java 1.5 version
 */

public class AutoBoxing_AutoUnboxing_2 {

	public static void main(String[] args) {

//java 1.4 version : no AutoBoxind		
		ArrayList al = new ArrayList();
		al.add(new Integer(10));
		al.add(new Integer(100));
		al.add(new Double(10.5));
		al.add(new Character('S'));
		System.out.println(al);

//java 1.5 version : AutoBoxing	
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(100);
		a.add(10.5);
		a.add('P');
		System.out.println(a);

	}

}
