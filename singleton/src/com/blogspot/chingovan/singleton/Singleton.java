/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.singleton;


/**
 * @author chinv
 *
 */
public class Singleton {

	/**
	 * Trong nay luu tru doi tuong singleton
	 * */
	private static Singleton	intance	= null;

	/**
	 * Mot truong binh thuong
	 * */
	private int					value;

	/**
	 * Ham dung, nhung co modifier la private
	 * */
	private Singleton() {

	}

	/**
	 * Phuong thuc tinh de lay gia tri cua truong instace. Neu truong nay la
	 * null thi khoi tao no
	 * 
	 * @return the intance
	 */
	public static Singleton getIntance() {
		if (intance == null) {

			intance = new Singleton();
		}
		return intance;
	}

	/**
	 * Phuong thuc lay gia tri cua truong value
	 * 
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Phuong thuc dat gia tri cho truong value
	 * 
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
