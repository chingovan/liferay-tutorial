/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.blogspot.chingovan.taglib.bs.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

import com.liferay.taglib.util.IncludeTag;

/**
 * @author chinv
 *
 */
public class BaseAuthorTag extends IncludeTag {
	protected static final String	_ATTRIBUTE_NAMESPACE	= "bs:author:";

	private static final String		_START_PAGE				= "/html/taglib/bs/author/start.jsp";

	private String					name					= null;
	private String					institute				= null;
	private String					url						= null;

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the institute
	 */
	public String getInstitute() {
		return institute;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
		setScopedAttribute("name", name);
	}

	/**
	 * @param institute
	 *            the institute to set
	 */
	public void setInstitute(String institute) {
		this.institute = institute;
		setScopedAttribute("institute", institute);
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
		setScopedAttribute("url", url);
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		name = null;
		institute = null;
		url = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.liferay.taglib.util.IncludeTag#processEndTag()
	 */
	@Override
	protected int processEndTag() throws Exception {

		return EVAL_PAGE;
	}

	@Override
	protected String getStartPage() {
		return _START_PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {

		setNamespacedAttribute(request, "name", name);
		setNamespacedAttribute(request, "institute", institute);
		setNamespacedAttribute(request, "url", url);
	}
}
