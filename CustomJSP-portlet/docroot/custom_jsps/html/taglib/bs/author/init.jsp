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
	
	String name = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "name"));
	String institute = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "institute"));
	String url = GetterUtil.getString((java.lang.String)request.getAttribute(_NAMESPACE + "url"));
	
	_updateOptions(_options, "name", name);
	_updateOptions(_options, "institute", institute);
	_updateOptions(_options, "url", url);
%>

<%!
	private static final String _NAMESPACE = "bs:author:";
%>