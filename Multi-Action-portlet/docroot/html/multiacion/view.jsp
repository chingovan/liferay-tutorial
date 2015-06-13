<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%
	String message = ParamUtil.getString(renderRequest, "message");
%>

<%= message %>

<portlet:renderURL var="editNameURL">
    <portlet:param name="mvcPath" value="/html/multiacion/edit.jsp" />
</portlet:renderURL>

<p><a href="<%= editNameURL %>">Enter Name link</a></p>

<portlet:renderURL var="sendEmailURL">
    <portlet:param name="mvcPath" value="/html/multiacion/email.jsp" />
</portlet:renderURL>

<p><a href="<%= sendEmailURL %>">Enter Email link</a></p>