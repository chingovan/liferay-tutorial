<%@include file="/html/searchtutorial/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();

	StudentSearchContainer studentSearchContainer = new StudentSearchContainer(renderRequest, portletURL);	
%>

<liferay-ui:search-container searchContainer="<%= studentSearchContainer %>">
	
	<liferay-ui:search-container-results
		results="<%= DemoStudentUtil.search( studentSearchContainer) %>"
		total="<%= DemoStudentUtil.count(studentSearchContainer) %>"
	/>

	<liferay-ui:search-container-row
		className="com.blogspot.chingovan.tutorial.model.Student"
		modelVar="student"
	>
	
		<liferay-ui:search-container-column-text property="code" />

		<liferay-ui:search-container-column-text property="fullname" />

		<liferay-ui:search-container-column-text name="gender" value='<%= student.isGender() == true ? "Nam" : "Nu" %>' />

		<liferay-ui:search-container-column-text property="address" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>