<%@ include file="/html/formnavi/init.jsp" %>

<%
	String[] CATEGORY_NAMES = new String[]{"basic-information", "educations", "hobbies"};

	String[] basic_information = new String[]{"profile", "contacts"};
	String[] educations = new String[]{"university", "high_school"};
	String[] hobbies = new String[]{"sports", "entertaimens"};
	
	String[][] categorySections = {basic_information, educations, hobbies};
%>

<portlet:actionURL var="formAction" name="updateStudent" />
<aui:form action="<%=formAction%>" method="post" name="fm">
		
	<liferay-ui:form-navigator
		categoryNames="<%= CATEGORY_NAMES %>"
		categorySections="<%= categorySections %>"
		jspPath="/html/formnavi/subjsp/"
	/>
</aui:form>

