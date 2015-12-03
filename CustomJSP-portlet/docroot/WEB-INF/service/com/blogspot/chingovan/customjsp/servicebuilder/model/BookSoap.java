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

package com.blogspot.chingovan.customjsp.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.blogspot.chingovan.customjsp.servicebuilder.service.http.BookServiceSoap}.
 *
 * @author chinv
 * @see com.blogspot.chingovan.customjsp.servicebuilder.service.http.BookServiceSoap
 * @generated
 */
public class BookSoap implements Serializable {
	public static BookSoap toSoapModel(Book model) {
		BookSoap soapModel = new BookSoap();

		soapModel.setBookId(model.getBookId());
		soapModel.setTitle(model.getTitle());
		soapModel.setEdition(model.getEdition());
		soapModel.setIsbn(model.getIsbn());
		soapModel.setCover(model.getCover());
		soapModel.setNumberOfPage(model.getNumberOfPage());
		soapModel.setPublisherName(model.getPublisherName());
		soapModel.setPublisherURL(model.getPublisherURL());

		return soapModel;
	}

	public static BookSoap[] toSoapModels(Book[] models) {
		BookSoap[] soapModels = new BookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BookSoap[][] toSoapModels(Book[][] models) {
		BookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BookSoap[] toSoapModels(List<Book> models) {
		List<BookSoap> soapModels = new ArrayList<BookSoap>(models.size());

		for (Book model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BookSoap[soapModels.size()]);
	}

	public BookSoap() {
	}

	public long getPrimaryKey() {
		return _bookId;
	}

	public void setPrimaryKey(long pk) {
		setBookId(pk);
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getEdition() {
		return _edition;
	}

	public void setEdition(String edition) {
		_edition = edition;
	}

	public String getIsbn() {
		return _isbn;
	}

	public void setIsbn(String isbn) {
		_isbn = isbn;
	}

	public String getCover() {
		return _cover;
	}

	public void setCover(String cover) {
		_cover = cover;
	}

	public int getNumberOfPage() {
		return _numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		_numberOfPage = numberOfPage;
	}

	public String getPublisherName() {
		return _publisherName;
	}

	public void setPublisherName(String publisherName) {
		_publisherName = publisherName;
	}

	public String getPublisherURL() {
		return _publisherURL;
	}

	public void setPublisherURL(String publisherURL) {
		_publisherURL = publisherURL;
	}

	private long _bookId;
	private String _title;
	private String _edition;
	private String _isbn;
	private String _cover;
	private int _numberOfPage;
	private String _publisherName;
	private String _publisherURL;
}