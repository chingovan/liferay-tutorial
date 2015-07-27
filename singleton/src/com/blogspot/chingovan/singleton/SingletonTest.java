/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.singleton;

/**
 * @author chinv
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleton singleton1 = Singleton.getIntance();

		singleton1.setValue(100);
		System.out.println("Value of singleton 1: " + singleton1.getValue());

		Singleton singleton2 = Singleton.getIntance();
		System.out.println("Value of singleton 2: " + singleton2.getValue());
	}

}
