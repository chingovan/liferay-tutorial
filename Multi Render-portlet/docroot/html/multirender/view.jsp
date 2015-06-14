<%@include file="/html/multirender/init.jsp"%>

<%
	String message = ParamUtil.getString(renderRequest, "message");
%>

<%= message %>

<portlet:renderURL var="editNameURL">
    <portlet:param name="mvcPath" value="/html/multiredner/edit.jsp" />
</portlet:renderURL>

<p><a href="<%= editNameURL %>">Enter Name link</a></p>

<portlet:renderURL var="sendEmailURL">
    <portlet:param name="mvcPath" value="/html/multiredner/edit_email.jsp" />
</portlet:renderURL>

<p><a href="<%= sendEmailURL %>">Enter Email link</a></p>