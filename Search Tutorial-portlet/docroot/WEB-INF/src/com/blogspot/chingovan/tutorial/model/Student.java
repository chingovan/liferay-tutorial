/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.tutorial.model;

import java.util.Date;

/**
 * @author chinv
 *
 */
public class Student {

	private String	code;
	private String	fullname;
	private Date	birthday;
	private boolean	gender;
	private String	address;

	/**
	 * Default Constructor
	 */
	public Student() {
		super();
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param code
	 *            The code of {@link Student}
	 * @param fullname
	 *            The fullname of {@link Student}
	 * @param birthday
	 *            The birth of day of {@link Student}
	 * @param gender
	 *            The gender of {@link Student}, gender = 1 {@link Student} is
	 *            male, otherwise {@link Student} is female
	 * @param address
	 *            The address of {@link Student}
	 */
	public Student(String code, String fullname, Date birthday, boolean gender, String address) {
		super();
		this.code = code;
		this.fullname = fullname;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
	}

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
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @param fullname
	 *            the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public boolean isGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(boolean gender) {
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
