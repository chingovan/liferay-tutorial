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

import com.blogspot.chingovan.customjsp.servicebuilder.model.Book;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Book in entity cache.
 *
 * @author chinv
 * @see Book
 * @generated
 */
public class BookCacheModel implements CacheModel<Book>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{bookId=");
		sb.append(bookId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", edition=");
		sb.append(edition);
		sb.append(", isbn=");
		sb.append(isbn);
		sb.append(", cover=");
		sb.append(cover);
		sb.append(", numberOfPage=");
		sb.append(numberOfPage);
		sb.append(", publisherName=");
		sb.append(publisherName);
		sb.append(", publisherURL=");
		sb.append(publisherURL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Book toEntityModel() {
		BookImpl bookImpl = new BookImpl();

		bookImpl.setBookId(bookId);

		if (title == null) {
			bookImpl.setTitle(StringPool.BLANK);
		}
		else {
			bookImpl.setTitle(title);
		}

		if (edition == null) {
			bookImpl.setEdition(StringPool.BLANK);
		}
		else {
			bookImpl.setEdition(edition);
		}

		if (isbn == null) {
			bookImpl.setIsbn(StringPool.BLANK);
		}
		else {
			bookImpl.setIsbn(isbn);
		}

		if (cover == null) {
			bookImpl.setCover(StringPool.BLANK);
		}
		else {
			bookImpl.setCover(cover);
		}

		bookImpl.setNumberOfPage(numberOfPage);

		if (publisherName == null) {
			bookImpl.setPublisherName(StringPool.BLANK);
		}
		else {
			bookImpl.setPublisherName(publisherName);
		}

		if (publisherURL == null) {
			bookImpl.setPublisherURL(StringPool.BLANK);
		}
		else {
			bookImpl.setPublisherURL(publisherURL);
		}

		bookImpl.resetOriginalValues();

		return bookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bookId = objectInput.readLong();
		title = objectInput.readUTF();
		edition = objectInput.readUTF();
		isbn = objectInput.readUTF();
		cover = objectInput.readUTF();
		numberOfPage = objectInput.readInt();
		publisherName = objectInput.readUTF();
		publisherURL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bookId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (edition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(edition);
		}

		if (isbn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(isbn);
		}

		if (cover == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cover);
		}

		objectOutput.writeInt(numberOfPage);

		if (publisherName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publisherName);
		}

		if (publisherURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publisherURL);
		}
	}

	public long bookId;
	public String title;
	public String edition;
	public String isbn;
	public String cover;
	public int numberOfPage;
	public String publisherName;
	public String publisherURL;
}