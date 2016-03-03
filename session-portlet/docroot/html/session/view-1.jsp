<%@page import="com.liferay.portal.util.SessionClicks"%>
<%@include file="/html/init.jsp"%>

<%
	String param = ParamUtil.getString(request, "param");

	if( param != null && !param.isEmpty()) {
		
		SessionClicks.put(request, "status", param);
	}
	
	String status = SessionClicks.get(request, "status", "");
%>

<aui:row>
	<div class='<%= status != null && status.equals("hide") ? "hide" : ""%>' id="divId">
		<img alt="chingovan.blogspot.com" src='<%= request.getContextPath() +  "/images/chingovan.blogspot.com.png"%>'>
	</div>
</aui:row>
<aui:row>
	<aui:col span="4">
		<portlet:renderURL var="refreshURL">
		</portlet:renderURL>
		<aui:a href="<%= refreshURL.toString() %>">Refresh</aui:a>
	</aui:col>
	
	<aui:col span="4">
		<portlet:renderURL var="showURL">
			<portlet:param name="param" value="show"/>
		</portlet:renderURL>
		<aui:a href="<%= showURL.toString() %>">Show</aui:a>
	</aui:col>
	
	<aui:col span="4">
		<portlet:renderURL var="hideURL">
			<portlet:param name="param" value="hide"/>
		</portlet:renderURL>
		<aui:a href="<%= hideURL.toString() %>">Hide</aui:a>
	</aui:col>
</aui:row>