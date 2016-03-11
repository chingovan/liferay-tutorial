/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.blogspot.chingovan.tutorial.actions.model.impl;

import com.blogspot.chingovan.tutorial.actions.model.Student;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author chinv
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{studentId=");
		sb.append(studentId);
		sb.append(", code=");
		sb.append(code);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", address=");
		sb.append(address);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Student toEntityModel() {
		StudentImpl studentImpl = new StudentImpl();

		studentImpl.setStudentId(studentId);

		if (code == null) {
			studentImpl.setCode(StringPool.BLANK);
		}
		else {
			studentImpl.setCode(code);
		}

		if (fullName == null) {
			studentImpl.setFullName(StringPool.BLANK);
		}
		else {
			studentImpl.setFullName(fullName);
		}

		if (birthday == Long.MIN_VALUE) {
			studentImpl.setBirthday(null);
		}
		else {
			studentImpl.setBirthday(new Date(birthday));
		}

		studentImpl.setGender(gender);

		if (address == null) {
			studentImpl.setAddress(StringPool.BLANK);
		}
		else {
			studentImpl.setAddress(address);
		}

		studentImpl.resetOriginalValues();

		return studentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studentId = objectInput.readLong();
		code = objectInput.readUTF();
		fullName = objectInput.readUTF();
		birthday = objectInput.readLong();
		gender = objectInput.readBoolean();
		address = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(studentId);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		objectOutput.writeLong(birthday);
		objectOutput.writeBoolean(gender);

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}
	}

	public long studentId;
	public String code;
	public String fullName;
	public long birthday;
	public boolean gender;
	public String address;
}