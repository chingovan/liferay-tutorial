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

import com.blogspot.chingovan.validator.service.ClpSerializer;
import com.blogspot.chingovan.validator.service.Validator_StudentLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chinv
 */
public class Validator_StudentClp extends BaseModelImpl<Validator_Student>
	implements Validator_Student {
	public Validator_StudentClp() {
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
	public long getPrimaryKey() {
		return _studentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStudentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _studentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getStudentId() {
		return _studentId;
	}

	@Override
	public void setStudentId(long studentId) {
		_studentId = studentId;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setStudentId", long.class);

				method.invoke(_validator_StudentRemoteModel, studentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_validator_StudentRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullname() {
		return _fullname;
	}

	@Override
	public void setFullname(String fullname) {
		_fullname = fullname;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setFullname", String.class);

				method.invoke(_validator_StudentRemoteModel, fullname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getGender() {
		return _gender;
	}

	@Override
	public boolean isGender() {
		return _gender;
	}

	@Override
	public void setGender(boolean gender) {
		_gender = gender;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", boolean.class);

				method.invoke(_validator_StudentRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirthday() {
		return _birthday;
	}

	@Override
	public void setBirthday(Date birthday) {
		_birthday = birthday;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthday", Date.class);

				method.invoke(_validator_StudentRemoteModel, birthday);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_validator_StudentRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_validator_StudentRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBlog() {
		return _blog;
	}

	@Override
	public void setBlog(String blog) {
		_blog = blog;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setBlog", String.class);

				method.invoke(_validator_StudentRemoteModel, blog);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getMark() {
		return _mark;
	}

	@Override
	public void setMark(double mark) {
		_mark = mark;

		if (_validator_StudentRemoteModel != null) {
			try {
				Class<?> clazz = _validator_StudentRemoteModel.getClass();

				Method method = clazz.getMethod("setMark", double.class);

				method.invoke(_validator_StudentRemoteModel, mark);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getValidator_StudentRemoteModel() {
		return _validator_StudentRemoteModel;
	}

	public void setValidator_StudentRemoteModel(
		BaseModel<?> validator_StudentRemoteModel) {
		_validator_StudentRemoteModel = validator_StudentRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _validator_StudentRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_validator_StudentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Validator_StudentLocalServiceUtil.addValidator_Student(this);
		}
		else {
			Validator_StudentLocalServiceUtil.updateValidator_Student(this);
		}
	}

	@Override
	public Validator_Student toEscapedModel() {
		return (Validator_Student)ProxyUtil.newProxyInstance(Validator_Student.class.getClassLoader(),
			new Class[] { Validator_Student.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		Validator_StudentClp clone = new Validator_StudentClp();

		clone.setStudentId(getStudentId());
		clone.setCode(getCode());
		clone.setFullname(getFullname());
		clone.setGender(getGender());
		clone.setBirthday(getBirthday());
		clone.setEmail(getEmail());
		clone.setAddress(getAddress());
		clone.setBlog(getBlog());
		clone.setMark(getMark());

		return clone;
	}

	@Override
	public int compareTo(Validator_Student validator_Student) {
		long primaryKey = validator_Student.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Validator_StudentClp)) {
			return false;
		}

		Validator_StudentClp validator_Student = (Validator_StudentClp)obj;

		long primaryKey = validator_Student.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{studentId=");
		sb.append(getStudentId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", fullname=");
		sb.append(getFullname());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", birthday=");
		sb.append(getBirthday());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", blog=");
		sb.append(getBlog());
		sb.append(", mark=");
		sb.append(getMark());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.blogspot.chingovan.validator.model.Validator_Student");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullname</column-name><column-value><![CDATA[");
		sb.append(getFullname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthday</column-name><column-value><![CDATA[");
		sb.append(getBirthday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>blog</column-name><column-value><![CDATA[");
		sb.append(getBlog());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mark</column-name><column-value><![CDATA[");
		sb.append(getMark());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _validator_StudentRemoteModel;
	private Class<?> _clpSerializerClass = com.blogspot.chingovan.validator.service.ClpSerializer.class;
}