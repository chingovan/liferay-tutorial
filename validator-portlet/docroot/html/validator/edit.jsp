<%@page import="com.blogspot.chingovan.validator.model.impl.Validator_StudentImpl"%>
<%@page import="com.blogspot.chingovan.validator.model.Validator_Student"%>
<%@ include file="/html/validator/init.jsp"%>

<%
	Validator_Student validator_Student = new Validator_StudentImpl(); 
%>

<portlet:actionURL var="editStudentURL" name="editStudent">
</portlet:actionURL>

<aui:form action="<%= editStudentURL %>" name="fm" method="post">
	<aui:model-context bean="<%= validator_Student%>" model="<%= Validator_Student.class %>"/>
	
	<aui:row>
		<aui:col span="6">
			<aui:input name="code" label="Code">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="maxLength">8</aui:validator>
				<aui:validator name="minLength">20</aui:validator>
				<aui:validator name="alphanum"></aui:validator>
			</aui:input>
		</aui:col>
		<aui:col span="6">			
			<aui:input name="fullname" label="Full name">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="maxLength">50</aui:validator>
				<aui:validator name="minLength">1</aui:validator>
				<aui:validator name="alpha"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="6">
			<aui:input name="gender" label="Gender"/>
		</aui:col>
		<aui:col span="6">
			<aui:input name="birthday" label="Birthday">
				<aui:validator name="required"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="6">
			<aui:input name="email" label="Email">
				<aui:validator name="email" ></aui:validator>
				<aui:validator name="maxLength" >150</aui:validator>
			</aui:input>
		</aui:col>
		<aui:col span="6">
			<aui:input name="address" label="Address"></aui:input>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="6">
			<aui:input name="blog" label="Blog Address">
				<aui:validator name="url"></aui:validator>
				<aui:validator name="maxLength">255</aui:validator>
			</aui:input>
		</aui:col>
		<aui:col span="6">
			<aui:input name="mark" label="Mark" >
				<aui:validator name="number"></aui:validator>
				<aui:validator name="min">0</aui:validator>
				<aui:validator name="max">10</aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>
	
	<aui:button type="submit"></aui:button>
</aui:form>