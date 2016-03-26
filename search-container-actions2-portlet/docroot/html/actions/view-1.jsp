<%@include file="/html/actions/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	
	String portletURLString = portletURL.toString();
	StudentSearchContainer studentSearchContainer = new StudentSearchContainer(renderRequest, portletURL);
	StudentDisplayTerms displayTerms = (StudentDisplayTerms)studentSearchContainer.getDisplayTerms();
%>

<aui:form action="<%= portletURLString %>" method="post" name="fm">
	<liferay-ui:search-container searchContainer="<%= studentSearchContainer %>">
		
		<liferay-ui:search-form page="/html/actions/search.jsp" servletContext="<%= application %>" />
		<liferay-ui:search-container-results
			results="<%= StudentLocalServiceUtil.search(displayTerms.getCode(), displayTerms.getName(), displayTerms.getGender(), studentSearchContainer.getStart(), studentSearchContainer.getEnd())%>"
			total="<%= StudentLocalServiceUtil.count(displayTerms.getCode(), displayTerms.getName(), displayTerms.getGender())%>"
		/>
	
		<liferay-ui:search-container-row
			className="com.blogspot.chingovan.tutorial.actions.model.Student"
			modelVar="student"
		>
			<portlet:renderURL var="viewDetailURL" >
				<portlet:param name="studentId" value="<%= String.valueOf(student.getStudentId()) %>"/>
				<portlet:param name="mvcPath" value="/html/actions/detail.jsp" />
			</portlet:renderURL>
		
			<liferay-ui:search-container-column-text property="code" href="<%= viewDetailURL %>"/>
	
			<liferay-ui:search-container-column-text property="fullName" href="<%= viewDetailURL %>"/>
	
			<liferay-ui:search-container-column-text name="gender" value='<%= student.isGender() == false ? "Nam" : "Nu" %>' href="<%= viewDetailURL %>"/>
	
			<liferay-ui:search-container-column-text property="address" href="<%= viewDetailURL %>"/>
	
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>
