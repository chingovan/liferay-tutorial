<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@include file="/html/actions/init.jsp"%>

<%
	long studentId = ParamUtil.getLong(renderRequest, "studentId");

	Student student = null;
	if( studentId > 0) {
		
		student = StudentLocalServiceUtil.fetchStudent(studentId);
	}
	
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
%>
<aui:row>
	<liferay-ui:message key="student-detail-title" />
</aui:row>

<%if( student != null) {%>
	<aui:row>
		<aui:col span="4">
			<liferay-ui:message key="student-code" />
		</aui:col>
		<aui:col span="8">
			<%= student.getCode() %>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="4">
			<liferay-ui:message key="student-name" />
		</aui:col>
		<aui:col span="8">
			<%= student.getFullName() %>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="4">
			<liferay-ui:message key="student-birthday" />
		</aui:col>
		<aui:col span="8">
			<%= dateFormat.format( student.getBirthday()) %>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="4">
			<liferay-ui:message key="student-gender" />
		</aui:col>
		<aui:col span="8">
			<%= student.getGender() == false ?  LanguageUtil.get(pageContext, "student-gender-male") : LanguageUtil.get(pageContext, "student-gender-female")%>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="4">
			<liferay-ui:message key="student-address" />
		</aui:col>
		<aui:col span="8">
			<%= student.getAddress() %>
		</aui:col>
	</aui:row>
<%}%>