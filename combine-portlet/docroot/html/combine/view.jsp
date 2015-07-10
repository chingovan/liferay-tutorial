<%@include file="/html/combine/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	
	String portletURLString = portletURL.toString();
	StudentSearchContainer studentSearchContainer = new StudentSearchContainer(renderRequest, portletURL);
	StudentDisplayTerms displayTerms = (StudentDisplayTerms)studentSearchContainer.getDisplayTerms();
%>

<aui:form action="<%= portletURLString %>" method="post" name="fm">
	<liferay-ui:search-container searchContainer="<%= studentSearchContainer %>">
		
		<liferay-ui:search-form page="/html/combine/search.jsp" servletContext="<%= application %>" />
		<liferay-ui:search-container-results
			results="<%= StudentLocalServiceUtil.search(displayTerms.getCode(), displayTerms.getName(), displayTerms.getGender(), studentSearchContainer.getStart(), studentSearchContainer.getEnd())%>"
			total="<%= StudentLocalServiceUtil.count(displayTerms.getCode(), displayTerms.getName(), displayTerms.getGender())%>"
		/>
	
		<liferay-ui:search-container-row
			className="com.blogspot.chingovan.tutorial.combine.model.Student"
			modelVar="student"
		>
		
			<liferay-ui:search-container-column-text property="code" />
	
			<liferay-ui:search-container-column-text property="fullName" />
	
			<liferay-ui:search-container-column-text name="gender" value='<%= student.isGender() == true ? "Nam" : "Nu" %>' />
	
			<liferay-ui:search-container-column-text property="address" />
	
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>