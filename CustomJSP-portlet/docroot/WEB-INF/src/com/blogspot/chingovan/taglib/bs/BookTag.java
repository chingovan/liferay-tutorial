/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.taglib.bs;

import javax.servlet.http.HttpServletRequest;

import com.blogspot.chingovan.taglib.bs.base.BaseBookTag;

/**
 * @author chinv
 *
 */
public class BookTag extends BaseBookTag {

	private static final boolean	_CLEAN_UP_SET_ATTRIBUTES	= true;

	/* (non-Javadoc)
	 * @see com.blogspot.chingovan.taglib.bs.base.BaseBookTag#doStartTag()
	 */
	
	@Override
	protected boolean isCleanUpSetAttributes() {
		return _CLEAN_UP_SET_ATTRIBUTES;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		super.setAttributes(request);

		String title = getTitle();
		setNamespacedAttribute(request, "title", title);

		String edition = getEdition();
		setNamespacedAttribute(request, "edition", edition);

		String isbn = getIsbn();
		setNamespacedAttribute(request, "isbn", isbn);

		String cover = getCover();
		setNamespacedAttribute(request, "cover", cover);

		int numberOfPage = getNumberOfPage();
		setNamespacedAttribute(request, "numberOfPage", numberOfPage);

		String publisherName = getPublisherName();
		setNamespacedAttribute(request, "publisherName", publisherName);

		String publisherURL = getPublisherURL();
		setNamespacedAttribute(request, "publisherURL", publisherURL);

	}
}
