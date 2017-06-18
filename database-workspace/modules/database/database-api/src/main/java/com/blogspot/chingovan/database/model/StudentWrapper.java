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

package com.blogspot.chingovan.database.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author chinv
 * @see Student
 * @generated
 */
@ProviderType
public class StudentWrapper implements Student, ModelWrapper<Student> {
	public StudentWrapper(Student student) {
		_student = student;
	}

	@Override
	public Class<?> getModelClass() {
		return Student.class;
	}

	@Override
	public String getModelClassName() {
		return Student.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("code", getCode());
		attributes.put("fullName", getFullName());
		attributes.put("birthday", getBirthday());
		attributes.put("gender", getGender());
		attributes.put("address", getAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		Boolean gender = (Boolean)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}
	}

	@Override
	public Student toEscapedModel() {
		return new StudentWrapper(_student.toEscapedModel());
	}

	@Override
	public Student toUnescapedModel() {
		return new StudentWrapper(_student.toUnescapedModel());
	}

	/**
	* Returns the gender of this student.
	*
	* @return the gender of this student
	*/
	@Override
	public boolean getGender() {
		return _student.getGender();
	}

	@Override
	public boolean isCachedModel() {
		return _student.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _student.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this student is gender.
	*
	* @return <code>true</code> if this student is gender; <code>false</code> otherwise
	*/
	@Override
	public boolean isGender() {
		return _student.isGender();
	}

	@Override
	public boolean isNew() {
		return _student.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _student.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Student> toCacheModel() {
		return _student.toCacheModel();
	}

	@Override
	public int compareTo(Student student) {
		return _student.compareTo(student);
	}

	@Override
	public int hashCode() {
		return _student.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _student.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new StudentWrapper((Student)_student.clone());
	}

	/**
	* Returns the address of this student.
	*
	* @return the address of this student
	*/
	@Override
	public java.lang.String getAddress() {
		return _student.getAddress();
	}

	/**
	* Returns the code of this student.
	*
	* @return the code of this student
	*/
	@Override
	public java.lang.String getCode() {
		return _student.getCode();
	}

	/**
	* Returns the full name of this student.
	*
	* @return the full name of this student
	*/
	@Override
	public java.lang.String getFullName() {
		return _student.getFullName();
	}

	/**
	* Returns the user name of this student.
	*
	* @return the user name of this student
	*/
	@Override
	public java.lang.String getUserName() {
		return _student.getUserName();
	}

	/**
	* Returns the user uuid of this student.
	*
	* @return the user uuid of this student
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _student.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _student.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _student.toXmlString();
	}

	/**
	* Returns the birthday of this student.
	*
	* @return the birthday of this student
	*/
	@Override
	public Date getBirthday() {
		return _student.getBirthday();
	}

	/**
	* Returns the create date of this student.
	*
	* @return the create date of this student
	*/
	@Override
	public Date getCreateDate() {
		return _student.getCreateDate();
	}

	/**
	* Returns the modified date of this student.
	*
	* @return the modified date of this student
	*/
	@Override
	public Date getModifiedDate() {
		return _student.getModifiedDate();
	}

	/**
	* Returns the company ID of this student.
	*
	* @return the company ID of this student
	*/
	@Override
	public long getCompanyId() {
		return _student.getCompanyId();
	}

	/**
	* Returns the group ID of this student.
	*
	* @return the group ID of this student
	*/
	@Override
	public long getGroupId() {
		return _student.getGroupId();
	}

	/**
	* Returns the primary key of this student.
	*
	* @return the primary key of this student
	*/
	@Override
	public long getPrimaryKey() {
		return _student.getPrimaryKey();
	}

	/**
	* Returns the student ID of this student.
	*
	* @return the student ID of this student
	*/
	@Override
	public long getStudentId() {
		return _student.getStudentId();
	}

	/**
	* Returns the user ID of this student.
	*
	* @return the user ID of this student
	*/
	@Override
	public long getUserId() {
		return _student.getUserId();
	}

	@Override
	public void persist() {
		_student.persist();
	}

	/**
	* Sets the address of this student.
	*
	* @param address the address of this student
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_student.setAddress(address);
	}

	/**
	* Sets the birthday of this student.
	*
	* @param birthday the birthday of this student
	*/
	@Override
	public void setBirthday(Date birthday) {
		_student.setBirthday(birthday);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_student.setCachedModel(cachedModel);
	}

	/**
	* Sets the code of this student.
	*
	* @param code the code of this student
	*/
	@Override
	public void setCode(java.lang.String code) {
		_student.setCode(code);
	}

	/**
	* Sets the company ID of this student.
	*
	* @param companyId the company ID of this student
	*/
	@Override
	public void setCompanyId(long companyId) {
		_student.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this student.
	*
	* @param createDate the create date of this student
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_student.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_student.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_student.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_student.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the full name of this student.
	*
	* @param fullName the full name of this student
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_student.setFullName(fullName);
	}

	/**
	* Sets whether this student is gender.
	*
	* @param gender the gender of this student
	*/
	@Override
	public void setGender(boolean gender) {
		_student.setGender(gender);
	}

	/**
	* Sets the group ID of this student.
	*
	* @param groupId the group ID of this student
	*/
	@Override
	public void setGroupId(long groupId) {
		_student.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this student.
	*
	* @param modifiedDate the modified date of this student
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_student.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_student.setNew(n);
	}

	/**
	* Sets the primary key of this student.
	*
	* @param primaryKey the primary key of this student
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_student.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_student.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the student ID of this student.
	*
	* @param studentId the student ID of this student
	*/
	@Override
	public void setStudentId(long studentId) {
		_student.setStudentId(studentId);
	}

	/**
	* Sets the user ID of this student.
	*
	* @param userId the user ID of this student
	*/
	@Override
	public void setUserId(long userId) {
		_student.setUserId(userId);
	}

	/**
	* Sets the user name of this student.
	*
	* @param userName the user name of this student
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_student.setUserName(userName);
	}

	/**
	* Sets the user uuid of this student.
	*
	* @param userUuid the user uuid of this student
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_student.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentWrapper)) {
			return false;
		}

		StudentWrapper studentWrapper = (StudentWrapper)obj;

		if (Objects.equals(_student, studentWrapper._student)) {
			return true;
		}

		return false;
	}

	@Override
	public Student getWrappedModel() {
		return _student;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _student.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _student.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_student.resetOriginalValues();
	}

	private final Student _student;
}