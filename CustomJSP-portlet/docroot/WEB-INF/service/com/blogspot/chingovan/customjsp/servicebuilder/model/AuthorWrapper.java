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
 * This class is a wrapper for {@link Author}.
 * </p>
 *
 * @author chinv
 * @see Author
 * @generated
 */
public class AuthorWrapper implements Author, ModelWrapper<Author> {
	public AuthorWrapper(Author author) {
		_author = author;
	}

	@Override
	public Class<?> getModelClass() {
		return Author.class;
	}

	@Override
	public String getModelClassName() {
		return Author.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("authorId", getAuthorId());
		attributes.put("name", getName());
		attributes.put("institute", getInstitute());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String institute = (String)attributes.get("institute");

		if (institute != null) {
			setInstitute(institute);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	/**
	* Returns the primary key of this author.
	*
	* @return the primary key of this author
	*/
	@Override
	public long getPrimaryKey() {
		return _author.getPrimaryKey();
	}

	/**
	* Sets the primary key of this author.
	*
	* @param primaryKey the primary key of this author
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_author.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the author ID of this author.
	*
	* @return the author ID of this author
	*/
	@Override
	public long getAuthorId() {
		return _author.getAuthorId();
	}

	/**
	* Sets the author ID of this author.
	*
	* @param authorId the author ID of this author
	*/
	@Override
	public void setAuthorId(long authorId) {
		_author.setAuthorId(authorId);
	}

	/**
	* Returns the name of this author.
	*
	* @return the name of this author
	*/
	@Override
	public java.lang.String getName() {
		return _author.getName();
	}

	/**
	* Sets the name of this author.
	*
	* @param name the name of this author
	*/
	@Override
	public void setName(java.lang.String name) {
		_author.setName(name);
	}

	/**
	* Returns the institute of this author.
	*
	* @return the institute of this author
	*/
	@Override
	public java.lang.String getInstitute() {
		return _author.getInstitute();
	}

	/**
	* Sets the institute of this author.
	*
	* @param institute the institute of this author
	*/
	@Override
	public void setInstitute(java.lang.String institute) {
		_author.setInstitute(institute);
	}

	/**
	* Returns the url of this author.
	*
	* @return the url of this author
	*/
	@Override
	public java.lang.String getUrl() {
		return _author.getUrl();
	}

	/**
	* Sets the url of this author.
	*
	* @param url the url of this author
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_author.setUrl(url);
	}

	@Override
	public boolean isNew() {
		return _author.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_author.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _author.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_author.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _author.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _author.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_author.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _author.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_author.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_author.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_author.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AuthorWrapper((Author)_author.clone());
	}

	@Override
	public int compareTo(Author author) {
		return _author.compareTo(author);
	}

	@Override
	public int hashCode() {
		return _author.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Author> toCacheModel() {
		return _author.toCacheModel();
	}

	@Override
	public Author toEscapedModel() {
		return new AuthorWrapper(_author.toEscapedModel());
	}

	@Override
	public Author toUnescapedModel() {
		return new AuthorWrapper(_author.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _author.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _author.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_author.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AuthorWrapper)) {
			return false;
		}

		AuthorWrapper authorWrapper = (AuthorWrapper)obj;

		if (Validator.equals(_author, authorWrapper._author)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Author getWrappedAuthor() {
		return _author;
	}

	@Override
	public Author getWrappedModel() {
		return _author;
	}

	@Override
	public void resetOriginalValues() {
		_author.resetOriginalValues();
	}

	private Author _author;
}