/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.taglib.bs;

import javax.servlet.http.HttpServletRequest;

import com.blogspot.chingovan.taglib.bs.base.BaseAuthorTag;

/**
 * @author chinv
 *
 */
public class AuthorTag extends BaseAuthorTag {
	private static final boolean	_CLEAN_UP_SET_ATTRIBUTES	= true;

	@Override
	protected boolean isCleanUpSetAttributes() {

		return _CLEAN_UP_SET_ATTRIBUTES;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		super.setAttributes(request);

		String name = getName();
		setNamespacedAttribute(request, "name", name);

		String institute = getInstitute();
		setNamespacedAttribute(request, "institute", institute);

		String url = getUrl();
		setNamespacedAttribute(request, "url", url);

	}
}
