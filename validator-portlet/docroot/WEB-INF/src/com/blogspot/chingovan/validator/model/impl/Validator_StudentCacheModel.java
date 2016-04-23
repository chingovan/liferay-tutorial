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

package com.blogspot.chingovan.validator.model.impl;

import com.blogspot.chingovan.validator.model.Validator_Student;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Validator_Student in entity cache.
 *
 * @author chinv
 * @see Validator_Student
 * @generated
 */
public class Validator_StudentCacheModel implements CacheModel<Validator_Student>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{studentId=");
		sb.append(studentId);
		sb.append(", code=");
		sb.append(code);
		sb.append(", fullname=");
		sb.append(fullname);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", email=");
		sb.append(email);
		sb.append(", address=");
		sb.append(address);
		sb.append(", blog=");
		sb.append(blog);
		sb.append(", mark=");
		sb.append(mark);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Validator_Student toEntityModel() {
		Validator_StudentImpl validator_StudentImpl = new Validator_StudentImpl();

		validator_StudentImpl.setStudentId(studentId);

		if (code == null) {
			validator_StudentImpl.setCode(StringPool.BLANK);
		}
		else {
			validator_StudentImpl.setCode(code);
		}

		if (fullname == null) {
			validator_StudentImpl.setFullname(StringPool.BLANK);
		}
		else {
			validator_StudentImpl.setFullname(fullname);
		}

		validator_StudentImpl.setGender(gender);

		if (birthday == Long.MIN_VALUE) {
			validator_StudentImpl.setBirthday(null);
		}
		else {
			validator_StudentImpl.setBirthday(new Date(birthday));
		}

		if (email == null) {
			validator_StudentImpl.setEmail(StringPool.BLANK);
		}
		else {
			validator_StudentImpl.setEmail(email);
		}

		if (address == null) {
			validator_StudentImpl.setAddress(StringPool.BLANK);
		}
		else {
			validator_StudentImpl.setAddress(address);
		}

		if (blog == null) {
			validator_StudentImpl.setBlog(StringPool.BLANK);
		}
		else {
			validator_StudentImpl.setBlog(blog);
		}

		validator_StudentImpl.setMark(mark);

		validator_StudentImpl.resetOriginalValues();

		return validator_StudentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studentId = objectInput.readLong();
		code = objectInput.readUTF();
		fullname = objectInput.readUTF();
		gender = objectInput.readBoolean();
		birthday = objectInput.readLong();
		email = objectInput.readUTF();
		address = objectInput.readUTF();
		blog = objectInput.readUTF();
		mark = objectInput.readDouble();
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

		if (fullname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullname);
		}

		objectOutput.writeBoolean(gender);
		objectOutput.writeLong(birthday);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (blog == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(blog);
		}

		objectOutput.writeDouble(mark);
	}

	public long studentId;
	public String code;
	public String fullname;
	public boolean gender;
	public long birthday;
	public String email;
	public String address;
	public String blog;
	public double mark;
}