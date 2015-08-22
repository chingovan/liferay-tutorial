<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/html/multilanguage/init.jsp"%>

<portlet:defineObjects />

This is the <b>Multi Language</b> portlet in View mode.
<br />
<liferay-ui:message key="student-name" />
<br />
<liferay-ui:message key="student-hello-x" arguments="Chi Ngo" />
<br />
<%= LanguageUtil.get(pageContext, "student-name") %>
<br />
<%= LanguageUtil.format(pageContext, "student-hello-x", "Chi Ngo") %>

