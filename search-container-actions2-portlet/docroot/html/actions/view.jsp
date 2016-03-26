<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@include file="/html/actions/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	
	String portletURLString = portletURL.toString();
	StudentSearchContainer studentSearchContainer = new StudentSearchContainer(renderRequest, portletURL);
	StudentDisplayTerms displayTerms = (StudentDisplayTerms)studentSearchContainer.getDisplayTerms();
	
	RowChecker rowChecker = new RowChecker(renderResponse);
%>

<aui:form action="<%= portletURLString %>" method="post" name="fm">
	<liferay-ui:search-container searchContainer="<%= studentSearchContainer %>" rowChecker="<%= rowChecker %>">
		
		<liferay-ui:search-form page="/html/actions/search.jsp" servletContext="<%= application %>" />
		<liferay-ui:search-container-results
			results="<%= StudentLocalServiceUtil.search(displayTerms.getCode(), displayTerms.getName(), displayTerms.getGender(), studentSearchContainer.getStart(), studentSearchContainer.getEnd())%>"
			total="<%= StudentLocalServiceUtil.count(displayTerms.getCode(), displayTerms.getName(), displayTerms.getGender())%>"
		/>
	
		<liferay-ui:search-container-row
			className="com.blogspot.chingovan.tutorial.actions.model.Student"
			modelVar="student" keyProperty="studentId"
		>
			<portlet:renderURL var="viewDetailURL" >
				<portlet:param name="studentId" value="<%= String.valueOf(student.getStudentId()) %>"/>
				<portlet:param name="mvcPath" value="/html/actions/detail.jsp" />
			</portlet:renderURL>
		
			<liferay-ui:search-container-column-text property="code" href="<%= viewDetailURL %>"/>
	
			<liferay-ui:search-container-column-text property="fullName" href="<%= viewDetailURL %>"/>
	
			<liferay-ui:search-container-column-text name="gender" value='<%= student.isGender() == false ? "Nam" : "Nu" %>' href="<%= viewDetailURL %>"/>
	
			<liferay-ui:search-container-column-text property="address" href="<%= viewDetailURL %>"/>
		
			<liferay-ui:search-container-column-jsp path="/html/actions/action.jsp" name="actions" />
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
	
	<aui:button name="delete" type="button" icon="icon-delete" value="delete" onClick='<%= renderResponse.getNamespace() +  "deleteStudents();"%>'/>
	<aui:input name="deleteStudentIds" type="hidden" />
</aui:form>

<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace />deleteStudents',
		function() {
			var deleteStudentIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, '<portlet:namespace />allRowIds');	
			
			if (deleteStudentIds && confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-the-selected-messages") %>')) {
				document.<portlet:namespace />fm.<portlet:namespace />deleteStudentIds.value = deleteStudentIds;

				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="deleteStudents"></portlet:actionURL>');
			} else {
				
			}
		},
		['liferay-util-list-fields']
	);
</aui:script>