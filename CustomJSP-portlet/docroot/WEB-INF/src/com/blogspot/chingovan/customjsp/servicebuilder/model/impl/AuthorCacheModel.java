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

package com.blogspot.chingovan.customjsp.servicebuilder.model.impl;

import com.blogspot.chingovan.customjsp.servicebuilder.model.Author;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Author in entity cache.
 *
 * @author chinv
 * @see Author
 * @generated
 */
public class AuthorCacheModel implements CacheModel<Author>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{authorId=");
		sb.append(authorId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", institute=");
		sb.append(institute);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Author toEntityModel() {
		AuthorImpl authorImpl = new AuthorImpl();

		authorImpl.setAuthorId(authorId);

		if (name == null) {
			authorImpl.setName(StringPool.BLANK);
		}
		else {
			authorImpl.setName(name);
		}

		if (institute == null) {
			authorImpl.setInstitute(StringPool.BLANK);
		}
		else {
			authorImpl.setInstitute(institute);
		}

		if (url == null) {
			authorImpl.setUrl(StringPool.BLANK);
		}
		else {
			authorImpl.setUrl(url);
		}

		authorImpl.resetOriginalValues();

		return authorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		authorId = objectInput.readLong();
		name = objectInput.readUTF();
		institute = objectInput.readUTF();
		url = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(authorId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (institute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(institute);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}
	}

	public long authorId;
	public String name;
	public String institute;
	public String url;
}