<%@page import="com.blogspot.chingovan.database.service.StudentLocalServiceUtil"%>
<%@page import="com.blogspot.chingovan.database.model.Student"%>
<%@ include file="./init.jsp" %>

<%
	final DateFormat DD_MM_YYYYY = new SimpleDateFormat("dd/MM/yyyy");
	final String DATE_EMPTY_FORMAT = "--/--/----";
	final String FEMALE = LanguageUtil.get(request, "database-portlet.student-list.gender.female");
	final String MALE = LanguageUtil.get(request, "database-portlet.student-list.gender.male");
	List<Student> students = StudentLocalServiceUtil.getStudents(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>
<p>
	<b><liferay-ui:message key="database-portlet.student-list"/></b>
</p>


<% if( students != null && !students.isEmpty()){ 
	int index = 0;
%>
	<table border="1">
		<tr>
			<th><liferay-ui:message key="database-portlet.student-list.order"/></th>
			<th><liferay-ui:message key="database-portlet.student-list.code"/></th>
			<th><liferay-ui:message key="database-portlet.student-list.fullName"/></th>
			<th><liferay-ui:message key="database-portlet.student-list.birthday"/></th>
			<th><liferay-ui:message key="database-portlet.student-list.gender"/></th>
			<th><liferay-ui:message key="database-portlet.student-list.address"/></th>
		</tr>
		<%for(Student student : students) { %>
			<tr>
				<td><%= ++index %></td>
				<td><%= student.getCode() %></td>
				<td><%= student.getFullName() %></td>
				<td><%= student.getBirthday() != null ? DD_MM_YYYYY.format( student.getBirthday()) : DATE_EMPTY_FORMAT %></td>
				<td><%= student.getGender() ? MALE : FEMALE%></td>
				<td><%= student.getAddress() != null ? student.getAddress() : "" %></td>
			</tr>
		<%} %>
	</table>
<% } else {%>
	<b><liferay-ui:message key="database-portlet.student-list.empty"/></b>
<%}%>