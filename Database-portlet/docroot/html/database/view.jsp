<%@ include file="/html/database/init.jsp"%>

<%
	List<Student> students = StudentLocalServiceUtil.getStudents(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	for(Student student : students) {
%>
	<span><%= student.getFullName() %></span>
	<br />
<%} %>
