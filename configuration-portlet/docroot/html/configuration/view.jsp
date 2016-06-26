<%@include file="/html/configuration/init.jsp"%>

<%
	String greeting = portletPreferences.getValue("greeting", StringPool.BLANK);
%>

<%= greeting %>