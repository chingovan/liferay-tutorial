<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/actions/init.jsp"%>

<%
	StudentSearchContainer searchContainer = (StudentSearchContainer)request.getAttribute("liferay-ui:search:searchContainer");

	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Student student = (Student)row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="viewDetailURL">
		<portlet:param name="studentId" value="<%= String.valueOf(student.getStudentId()) %>" />
		<portlet:param name="mvcPath" value="/html/actions/detail.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon message="actions-detail" iconCssClass="icon-info" url="<%= viewDetailURL %>" />
	
	<portlet:renderURL var="editURL">
		<portlet:param name="studentId" value="<%= String.valueOf(student.getStudentId()) %>" />
		<portlet:param name="mvcPath" value="/html/actions/edit.jsp" />
	</portlet:renderURL>
	<liferay-ui:icon message="actions-edit" iconCssClass="icon-edit" url="<%= editURL %>" />
	
	<portlet:actionURL var="deleteURL" name="deleteStudent">
		<portlet:param name="studentId" value="<%= String.valueOf(student.getStudentId()) %>" />
	</portlet:actionURL>
	<liferay-ui:icon message="actions-delete" iconCssClass="icon-remove" url="<%= deleteURL %>" />
	
</liferay-ui:icon-menu>

