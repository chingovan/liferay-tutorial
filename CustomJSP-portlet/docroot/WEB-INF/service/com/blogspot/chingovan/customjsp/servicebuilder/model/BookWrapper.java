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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Book}.
 * </p>
 *
 * @author chinv
 * @see Book
 * @generated
 */
public class BookWrapper implements Book, ModelWrapper<Book> {
	public BookWrapper(Book book) {
		_book = book;
	}

	@Override
	public Class<?> getModelClass() {
		return Book.class;
	}

	@Override
	public String getModelClassName() {
		return Book.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookId", getBookId());
		attributes.put("title", getTitle());
		attributes.put("edition", getEdition());
		attributes.put("isbn", getIsbn());
		attributes.put("cover", getCover());
		attributes.put("numberOfPage", getNumberOfPage());
		attributes.put("publisherName", getPublisherName());
		attributes.put("publisherURL", getPublisherURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String edition = (String)attributes.get("edition");

		if (edition != null) {
			setEdition(edition);
		}

		String isbn = (String)attributes.get("isbn");

		if (isbn != null) {
			setIsbn(isbn);
		}

		String cover = (String)attributes.get("cover");

		if (cover != null) {
			setCover(cover);
		}

		Integer numberOfPage = (Integer)attributes.get("numberOfPage");

		if (numberOfPage != null) {
			setNumberOfPage(numberOfPage);
		}

		String publisherName = (String)attributes.get("publisherName");

		if (publisherName != null) {
			setPublisherName(publisherName);
		}

		String publisherURL = (String)attributes.get("publisherURL");

		if (publisherURL != null) {
			setPublisherURL(publisherURL);
		}
	}

	/**
	* Returns the primary key of this book.
	*
	* @return the primary key of this book
	*/
	@Override
	public long getPrimaryKey() {
		return _book.getPrimaryKey();
	}

	/**
	* Sets the primary key of this book.
	*
	* @param primaryKey the primary key of this book
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_book.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the book ID of this book.
	*
	* @return the book ID of this book
	*/
	@Override
	public long getBookId() {
		return _book.getBookId();
	}

	/**
	* Sets the book ID of this book.
	*
	* @param bookId the book ID of this book
	*/
	@Override
	public void setBookId(long bookId) {
		_book.setBookId(bookId);
	}

	/**
	* Returns the title of this book.
	*
	* @return the title of this book
	*/
	@Override
	public java.lang.String getTitle() {
		return _book.getTitle();
	}

	/**
	* Sets the title of this book.
	*
	* @param title the title of this book
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_book.setTitle(title);
	}

	/**
	* Returns the edition of this book.
	*
	* @return the edition of this book
	*/
	@Override
	public java.lang.String getEdition() {
		return _book.getEdition();
	}

	/**
	* Sets the edition of this book.
	*
	* @param edition the edition of this book
	*/
	@Override
	public void setEdition(java.lang.String edition) {
		_book.setEdition(edition);
	}

	/**
	* Returns the isbn of this book.
	*
	* @return the isbn of this book
	*/
	@Override
	public java.lang.String getIsbn() {
		return _book.getIsbn();
	}

	/**
	* Sets the isbn of this book.
	*
	* @param isbn the isbn of this book
	*/
	@Override
	public void setIsbn(java.lang.String isbn) {
		_book.setIsbn(isbn);
	}

	/**
	* Returns the cover of this book.
	*
	* @return the cover of this book
	*/
	@Override
	public java.lang.String getCover() {
		return _book.getCover();
	}

	/**
	* Sets the cover of this book.
	*
	* @param cover the cover of this book
	*/
	@Override
	public void setCover(java.lang.String cover) {
		_book.setCover(cover);
	}

	/**
	* Returns the number of page of this book.
	*
	* @return the number of page of this book
	*/
	@Override
	public int getNumberOfPage() {
		return _book.getNumberOfPage();
	}

	/**
	* Sets the number of page of this book.
	*
	* @param numberOfPage the number of page of this book
	*/
	@Override
	public void setNumberOfPage(int numberOfPage) {
		_book.setNumberOfPage(numberOfPage);
	}

	/**
	* Returns the publisher name of this book.
	*
	* @return the publisher name of this book
	*/
	@Override
	public java.lang.String getPublisherName() {
		return _book.getPublisherName();
	}

	/**
	* Sets the publisher name of this book.
	*
	* @param publisherName the publisher name of this book
	*/
	@Override
	public void setPublisherName(java.lang.String publisherName) {
		_book.setPublisherName(publisherName);
	}

	/**
	* Returns the publisher u r l of this book.
	*
	* @return the publisher u r l of this book
	*/
	@Override
	public java.lang.String getPublisherURL() {
		return _book.getPublisherURL();
	}

	/**
	* Sets the publisher u r l of this book.
	*
	* @param publisherURL the publisher u r l of this book
	*/
	@Override
	public void setPublisherURL(java.lang.String publisherURL) {
		_book.setPublisherURL(publisherURL);
	}

	@Override
	public boolean isNew() {
		return _book.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_book.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _book.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_book.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _book.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _book.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_book.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _book.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_book.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_book.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_book.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BookWrapper((Book)_book.clone());
	}

	@Override
	public int compareTo(Book book) {
		return _book.compareTo(book);
	}

	@Override
	public int hashCode() {
		return _book.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Book> toCacheModel() {
		return _book.toCacheModel();
	}

	@Override
	public Book toEscapedModel() {
		return new BookWrapper(_book.toEscapedModel());
	}

	@Override
	public Book toUnescapedModel() {
		return new BookWrapper(_book.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _book.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _book.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_book.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BookWrapper)) {
			return false;
		}

		BookWrapper bookWrapper = (BookWrapper)obj;

		if (Validator.equals(_book, bookWrapper._book)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Book getWrappedBook() {
		return _book;
	}

	@Override
	public Book getWrappedModel() {
		return _book;
	}

	@Override
	public void resetOriginalValues() {
		_book.resetOriginalValues();
	}

	private Book _book;
}