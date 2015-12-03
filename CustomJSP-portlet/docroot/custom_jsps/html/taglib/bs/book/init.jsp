<%--
/**
 * Copyright (c) chingovan.blogspot.com. All rights reserved.
 *
 */

@generated
--%>

<%@ include file="/html/taglib/taglib-init.jsp" %>

<%
	Map<String, Object> dynamicAttributes = (Map<String, Object>)request.getAttribute(_NAMESPACE + "dynamicAttributes");
	Map<String, Object> scopedAttributes = (Map<String, Object>)request.getAttribute(_NAMESPACE + "scopedAttributes");
	
	Map<String, Object> _options = new HashMap<String, Object>();
	
	if ((scopedAttributes != null) && !scopedAttributes.isEmpty()) {

		_options.putAll(scopedAttributes);
	}
	
	if ((dynamicAttributes != null) && !dynamicAttributes.isEmpty()) {
		
		_options.putAll(dynamicAttributes);
	}
	
	String title = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "title"));
	String edition = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "edition"));
	String isbn = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "isbn"));
	String cover = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "cover"));
	int numberOfPage = GetterUtil.getInteger((java.lang.String)request.getAttribute(_NAMESPACE + "numberOfPage"));
	String publisherName = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "publisherName"));
	String publisherURL = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "publisherURL"));
	
	_updateOptions(_options, "title", title);
	_updateOptions(_options, "edition", edition);
	_updateOptions(_options, "isbn", isbn);
	_updateOptions(_options, "cover", cover);
	_updateOptions(_options, "numberOfPage", numberOfPage);
	_updateOptions(_options, "publisherName", publisherName);
	_updateOptions(_options, "publisherURL", publisherURL);
%>

<%!
	private static final String _NAMESPACE = "bs:book:";
%>