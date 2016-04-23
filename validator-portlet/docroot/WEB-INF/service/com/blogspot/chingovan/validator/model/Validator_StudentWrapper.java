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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Validator_Student}.
 * </p>
 *
 * @author chinv
 * @see Validator_Student
 * @generated
 */
public class Validator_StudentWrapper implements Validator_Student,
	ModelWrapper<Validator_Student> {
	public Validator_StudentWrapper(Validator_Student validator_Student) {
		_validator_Student = validator_Student;
	}

	@Override
	public Class<?> getModelClass() {
		return Validator_Student.class;
	}

	@Override
	public String getModelClassName() {
		return Validator_Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("code", getCode());
		attributes.put("fullname", getFullname());
		attributes.put("gender", getGender());
		attributes.put("birthday", getBirthday());
		attributes.put("email", getEmail());
		attributes.put("address", getAddress());
		attributes.put("blog", getBlog());
		attributes.put("mark", getMark());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String fullname = (String)attributes.get("fullname");

		if (fullname != null) {
			setFullname(fullname);
		}

		Boolean gender = (Boolean)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String blog = (String)attributes.get("blog");

		if (blog != null) {
			setBlog(blog);
		}

		Double mark = (Double)attributes.get("mark");

		if (mark != null) {
			setMark(mark);
		}
	}

	/**
	* Returns the primary key of this validator_ student.
	*
	* @return the primary key of this validator_ student
	*/
	@Override
	public long getPrimaryKey() {
		return _validator_Student.getPrimaryKey();
	}

	/**
	* Sets the primary key of this validator_ student.
	*
	* @param primaryKey the primary key of this validator_ student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_validator_Student.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the student ID of this validator_ student.
	*
	* @return the student ID of this validator_ student
	*/
	@Override
	public long getStudentId() {
		return _validator_Student.getStudentId();
	}

	/**
	* Sets the student ID of this validator_ student.
	*
	* @param studentId the student ID of this validator_ student
	*/
	@Override
	public void setStudentId(long studentId) {
		_validator_Student.setStudentId(studentId);
	}

	/**
	* Returns the code of this validator_ student.
	*
	* @return the code of this validator_ student
	*/
	@Override
	public java.lang.String getCode() {
		return _validator_Student.getCode();
	}

	/**
	* Sets the code of this validator_ student.
	*
	* @param code the code of this validator_ student
	*/
	@Override
	public void setCode(java.lang.String code) {
		_validator_Student.setCode(code);
	}

	/**
	* Returns the fullname of this validator_ student.
	*
	* @return the fullname of this validator_ student
	*/
	@Override
	public java.lang.String getFullname() {
		return _validator_Student.getFullname();
	}

	/**
	* Sets the fullname of this validator_ student.
	*
	* @param fullname the fullname of this validator_ student
	*/
	@Override
	public void setFullname(java.lang.String fullname) {
		_validator_Student.setFullname(fullname);
	}

	/**
	* Returns the gender of this validator_ student.
	*
	* @return the gender of this validator_ student
	*/
	@Override
	public boolean getGender() {
		return _validator_Student.getGender();
	}

	/**
	* Returns <code>true</code> if this validator_ student is gender.
	*
	* @return <code>true</code> if this validator_ student is gender; <code>false</code> otherwise
	*/
	@Override
	public boolean isGender() {
		return _validator_Student.isGender();
	}

	/**
	* Sets whether this validator_ student is gender.
	*
	* @param gender the gender of this validator_ student
	*/
	@Override
	public void setGender(boolean gender) {
		_validator_Student.setGender(gender);
	}

	/**
	* Returns the birthday of this validator_ student.
	*
	* @return the birthday of this validator_ student
	*/
	@Override
	public java.util.Date getBirthday() {
		return _validator_Student.getBirthday();
	}

	/**
	* Sets the birthday of this validator_ student.
	*
	* @param birthday the birthday of this validator_ student
	*/
	@Override
	public void setBirthday(java.util.Date birthday) {
		_validator_Student.setBirthday(birthday);
	}

	/**
	* Returns the email of this validator_ student.
	*
	* @return the email of this validator_ student
	*/
	@Override
	public java.lang.String getEmail() {
		return _validator_Student.getEmail();
	}

	/**
	* Sets the email of this validator_ student.
	*
	* @param email the email of this validator_ student
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_validator_Student.setEmail(email);
	}

	/**
	* Returns the address of this validator_ student.
	*
	* @return the address of this validator_ student
	*/
	@Override
	public java.lang.String getAddress() {
		return _validator_Student.getAddress();
	}

	/**
	* Sets the address of this validator_ student.
	*
	* @param address the address of this validator_ student
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_validator_Student.setAddress(address);
	}

	/**
	* Returns the blog of this validator_ student.
	*
	* @return the blog of this validator_ student
	*/
	@Override
	public java.lang.String getBlog() {
		return _validator_Student.getBlog();
	}

	/**
	* Sets the blog of this validator_ student.
	*
	* @param blog the blog of this validator_ student
	*/
	@Override
	public void setBlog(java.lang.String blog) {
		_validator_Student.setBlog(blog);
	}

	/**
	* Returns the mark of this validator_ student.
	*
	* @return the mark of this validator_ student
	*/
	@Override
	public double getMark() {
		return _validator_Student.getMark();
	}

	/**
	* Sets the mark of this validator_ student.
	*
	* @param mark the mark of this validator_ student
	*/
	@Override
	public void setMark(double mark) {
		_validator_Student.setMark(mark);
	}

	@Override
	public boolean isNew() {
		return _validator_Student.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_validator_Student.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _validator_Student.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_validator_Student.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _validator_Student.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _validator_Student.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_validator_Student.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _validator_Student.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_validator_Student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_validator_Student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_validator_Student.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Validator_StudentWrapper((Validator_Student)_validator_Student.clone());
	}

	@Override
	public int compareTo(
		com.blogspot.chingovan.validator.model.Validator_Student validator_Student) {
		return _validator_Student.compareTo(validator_Student);
	}

	@Override
	public int hashCode() {
		return _validator_Student.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.blogspot.chingovan.validator.model.Validator_Student> toCacheModel() {
		return _validator_Student.toCacheModel();
	}

	@Override
	public com.blogspot.chingovan.validator.model.Validator_Student toEscapedModel() {
		return new Validator_StudentWrapper(_validator_Student.toEscapedModel());
	}

	@Override
	public com.blogspot.chingovan.validator.model.Validator_Student toUnescapedModel() {
		return new Validator_StudentWrapper(_validator_Student.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _validator_Student.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _validator_Student.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_validator_Student.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Validator_StudentWrapper)) {
			return false;
		}

		Validator_StudentWrapper validator_StudentWrapper = (Validator_StudentWrapper)obj;

		if (Validator.equals(_validator_Student,
					validator_StudentWrapper._validator_Student)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Validator_Student getWrappedValidator_Student() {
		return _validator_Student;
	}

	@Override
	public Validator_Student getWrappedModel() {
		return _validator_Student;
	}

	@Override
	public void resetOriginalValues() {
		_validator_Student.resetOriginalValues();
	}

	private Validator_Student _validator_Student;
}