<%@include file="/html/configuration/init.jsp"%>

<%
	String greeting = portletPreferences.getValue("greeting", "Hello");
%>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL">
</liferay-portlet:actionURL>

<aui:form action="<%= configurationURL %>" method="POST" name="fm_config">
	
	<liferay-ui:success key="success" message="success-message"/>
	<aui:row>
		<aui:input name="greeting" label="greeting" value="<%= greeting %>"></aui:input>
	</aui:row>
	
	<aui:button-row>
		<aui:button type="submit" value="save" />
		<aui:button type="cancel" value="cancel" />
	</aui:button-row>
</aui:form>