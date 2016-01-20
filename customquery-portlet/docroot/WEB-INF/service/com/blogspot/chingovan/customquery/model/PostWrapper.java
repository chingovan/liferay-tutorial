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

package com.blogspot.chingovan.customquery.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Post}.
 * </p>
 *
 * @author chinv
 * @see Post
 * @generated
 */
public class PostWrapper implements Post, ModelWrapper<Post> {
	public PostWrapper(Post post) {
		_post = post;
	}

	@Override
	public Class<?> getModelClass() {
		return Post.class;
	}

	@Override
	public String getModelClassName() {
		return Post.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("postId", getPostId());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("authorId", getAuthorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long postId = (Long)attributes.get("postId");

		if (postId != null) {
			setPostId(postId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}
	}

	/**
	* Returns the primary key of this post.
	*
	* @return the primary key of this post
	*/
	@Override
	public long getPrimaryKey() {
		return _post.getPrimaryKey();
	}

	/**
	* Sets the primary key of this post.
	*
	* @param primaryKey the primary key of this post
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_post.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the post ID of this post.
	*
	* @return the post ID of this post
	*/
	@Override
	public long getPostId() {
		return _post.getPostId();
	}

	/**
	* Sets the post ID of this post.
	*
	* @param postId the post ID of this post
	*/
	@Override
	public void setPostId(long postId) {
		_post.setPostId(postId);
	}

	/**
	* Returns the title of this post.
	*
	* @return the title of this post
	*/
	@Override
	public java.lang.String getTitle() {
		return _post.getTitle();
	}

	/**
	* Sets the title of this post.
	*
	* @param title the title of this post
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_post.setTitle(title);
	}

	/**
	* Returns the content of this post.
	*
	* @return the content of this post
	*/
	@Override
	public java.lang.String getContent() {
		return _post.getContent();
	}

	/**
	* Sets the content of this post.
	*
	* @param content the content of this post
	*/
	@Override
	public void setContent(java.lang.String content) {
		_post.setContent(content);
	}

	/**
	* Returns the author ID of this post.
	*
	* @return the author ID of this post
	*/
	@Override
	public long getAuthorId() {
		return _post.getAuthorId();
	}

	/**
	* Sets the author ID of this post.
	*
	* @param authorId the author ID of this post
	*/
	@Override
	public void setAuthorId(long authorId) {
		_post.setAuthorId(authorId);
	}

	@Override
	public boolean isNew() {
		return _post.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_post.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _post.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_post.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _post.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _post.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_post.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _post.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_post.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_post.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_post.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PostWrapper((Post)_post.clone());
	}

	@Override
	public int compareTo(com.blogspot.chingovan.customquery.model.Post post) {
		return _post.compareTo(post);
	}

	@Override
	public int hashCode() {
		return _post.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.blogspot.chingovan.customquery.model.Post> toCacheModel() {
		return _post.toCacheModel();
	}

	@Override
	public com.blogspot.chingovan.customquery.model.Post toEscapedModel() {
		return new PostWrapper(_post.toEscapedModel());
	}

	@Override
	public com.blogspot.chingovan.customquery.model.Post toUnescapedModel() {
		return new PostWrapper(_post.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _post.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _post.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_post.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PostWrapper)) {
			return false;
		}

		PostWrapper postWrapper = (PostWrapper)obj;

		if (Validator.equals(_post, postWrapper._post)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Post getWrappedPost() {
		return _post;
	}

	@Override
	public Post getWrappedModel() {
		return _post;
	}

	@Override
	public void resetOriginalValues() {
		_post.resetOriginalValues();
	}

	private Post _post;
}