/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.blogspot.chingovan.validator.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.blogspot.chingovan.validator.service.http.Validator_StudentServiceSoap}.
 *
 * @author chinv
 * @see com.blogspot.chingovan.validator.service.http.Validator_StudentServiceSoap
 * @generated
 */
public class Validator_StudentSoap implements Serializable {
	public static Validator_StudentSoap toSoapModel(Validator_Student model) {
		Validator_StudentSoap soapModel = new Validator_StudentSoap();

		soapModel.setStudentId(model.getStudentId());
		soapModel.setCode(model.getCode());
		soapModel.setFullname(model.getFullname());
		soapModel.setGender(model.getGender());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setEmail(model.getEmail());
		soapModel.setAddress(model.getAddress());
		soapModel.setBlog(model.getBlog());
		soapModel.setMark(model.getMark());

		return soapModel;
	}

	public static Validator_StudentSoap[] toSoapModels(
		Validator_Student[] models) {
		Validator_StudentSoap[] soapModels = new Validator_StudentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Validator_StudentSoap[][] toSoapModels(
		Validator_Student[][] models) {
		Validator_StudentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Validator_StudentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Validator_StudentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Validator_StudentSoap[] toSoapModels(
		List<Validator_Student> models) {
		List<Validator_StudentSoap> soapModels = new ArrayList<Validator_StudentSoap>(models.size());

		for (Validator_Student model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Validator_StudentSoap[soapModels.size()]);
	}

	public Validator_StudentSoap() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public String getFullname() {
		return _fullname;
	}

	public void setFullname(String fullname) {
		_fullname = fullname;
	}

	public boolean getGender() {
		return _gender;
	}

	public boolean isGender() {
		return _gender;
	}

	public void setGender(boolean gender) {
		_gender = gender;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getBlog() {
		return _blog;
	}

	public void setBlog(String blog) {
		_blog = blog;
	}

	public double getMark() {
		return _mark;
	}

	public void setMark(double mark) {
		_mark = mark;
	}

	private long _studentId;
	private String _code;
	private String _fullname;
	private boolean _gender;
	private Date _birthday;
	private String _email;
	private String _address;
	private String _blog;
	private double _mark;
}