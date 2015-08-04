/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.poi.model;

import java.util.Date;

/**
 * @author chinv
 *
 */
public class Student {

	private String	code;
	private String	fullName;
	private Date	birthday;
	private int		gender;
	private String	address;

	/**
	 * Default constructor
	 */
	public Student() {
		super();
	}

	/**
	 * Constructer with initialize value for fields
	 * 
	 * @param code
	 *            The code of {@link Student}
	 * @param fullName
	 *            The full-name of {@link Student}
	 * @param birthday
	 *            The birthday of {@link Student}
	 * @param gender
	 *            The gender of {@link Student}. If gender = 0, sex of
	 *            {@link Student} is Male otherwise Female
	 * @param address
	 *            The home address of {@link Student}
	 */
	public Student(String code, String fullName, Date birthday, int gender, String address) {

		super();
		this.code = code;
		this.fullName = fullName;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
