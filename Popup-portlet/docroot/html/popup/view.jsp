<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@include file="/html/popup/init.jsp"%>

<portlet:renderURL var="buttonURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="mvcPath" value="/html/popup/detail.jsp"/>
	<portlet:param name="parameter" value="Button"/>
</portlet:renderURL>
<aui:button value="Button" type="button" useDialog="true" href="<%= buttonURL.toString() %>"/>

<portlet:renderURL var="navItemURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="mvcPath" value="/html/popup/detail.jsp"/>
	<portlet:param name="parameter" value="Nav Item"/>
</portlet:renderURL>
<aui:nav-item label="Nav Item" title="Nav Item" useDialog="true" href="<%= navItemURL.toString() %>"/>

<portlet:renderURL var="iconURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="mvcPath" value="/html/popup/detail.jsp"/>
	<portlet:param name="parameter" value="Icon"/>
</portlet:renderURL>
<liferay-ui:icon iconCssClass="icon-edit" message="Icon" label="true" url="<%= iconURL.toString() %>" useDialog="true" />