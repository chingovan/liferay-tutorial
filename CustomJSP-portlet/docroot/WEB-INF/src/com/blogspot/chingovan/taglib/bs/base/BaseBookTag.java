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
public class BaseBookTag extends IncludeTag {

	protected static final String	_ATTRIBUTE_NAMESPACE	= "bs:book:";

	private static final String		_END_PAGE				= "/html/taglib/bs/book/end.jsp";

	private static final String		_START_PAGE				= "/html/taglib/bs/book/start.jsp";

	private String					title					= null;
	private String					edition					= null;
	private String					isbn					= null;
	private String					cover					= null;
	private int						numberOfPage			= 0;
	private String					publisherName			= null;
	private String					publisherURL			= null;

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the edition
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the cover
	 */
	public String getCover() {
		return cover;
	}

	/**
	 * @return the numberOfPage
	 */
	public int getNumberOfPage() {
		return numberOfPage;
	}

	/**
	 * @return the publisherName
	 */
	public String getPublisherName() {
		return publisherName;
	}

	/**
	 * @return the publisherURL
	 */
	public String getPublisherURL() {
		return publisherURL;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
		setScopedAttribute("title", title);
	}

	/**
	 * @param edition
	 *            the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
		setScopedAttribute("edition", edition);
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
		setScopedAttribute("isbn", isbn);
	}

	/**
	 * @param cover
	 *            the cover to set
	 */
	public void setCover(String cover) {
		this.cover = cover;
		setScopedAttribute("cover", cover);
	}

	/**
	 * @param numberOfPage
	 *            the numberOfPage to set
	 */
	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
		setScopedAttribute("numberOfPage", numberOfPage);
	}

	/**
	 * @param publisherName
	 *            the publisherName to set
	 */
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
		setScopedAttribute("publisherName", publisherName);
	}

	/**
	 * @param publisherURL
	 *            the publisherURL to set
	 */
	public void setPublisherURL(String publisherURL) {
		this.publisherURL = publisherURL;
		setScopedAttribute("publisherURL", publisherURL);
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		title = null;
		edition = null;
		isbn = null;
		cover = null;
		numberOfPage = 0;
		publisherName = null;
		publisherURL = null;
	}

	@Override
	protected String getEndPage() {
		return _END_PAGE;
	}

	@Override
	protected String getStartPage() {
		return _START_PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {

		setNamespacedAttribute(request, "title", title);
		setNamespacedAttribute(request, "edition", edition);
		setNamespacedAttribute(request, "isbn", isbn);
		setNamespacedAttribute(request, "cover", cover);
		setNamespacedAttribute(request, "numberOfPage", numberOfPage);
		setNamespacedAttribute(request, "publisherName", publisherName);
		setNamespacedAttribute(request, "publisherURL", publisherURL);

	}

}
