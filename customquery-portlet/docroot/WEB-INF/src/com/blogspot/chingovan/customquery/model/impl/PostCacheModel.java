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

package com.blogspot.chingovan.customquery.model.impl;

import com.blogspot.chingovan.customquery.model.Post;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Post in entity cache.
 *
 * @author chinv
 * @see Post
 * @generated
 */
public class PostCacheModel implements CacheModel<Post>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{postId=");
		sb.append(postId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", content=");
		sb.append(content);
		sb.append(", authorId=");
		sb.append(authorId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Post toEntityModel() {
		PostImpl postImpl = new PostImpl();

		postImpl.setPostId(postId);

		if (title == null) {
			postImpl.setTitle(StringPool.BLANK);
		}
		else {
			postImpl.setTitle(title);
		}

		if (content == null) {
			postImpl.setContent(StringPool.BLANK);
		}
		else {
			postImpl.setContent(content);
		}

		postImpl.setAuthorId(authorId);

		postImpl.resetOriginalValues();

		return postImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		postId = objectInput.readLong();
		title = objectInput.readUTF();
		content = objectInput.readUTF();
		authorId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(postId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeLong(authorId);
	}

	public long postId;
	public String title;
	public String content;
	public long authorId;
}