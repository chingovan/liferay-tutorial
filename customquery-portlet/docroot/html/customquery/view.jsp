<%@include file="/html/customquery/init.jsp" %>
This is the <b>Custom Query</b> portlet in View mode.

<portlet:actionURL var="actionURL" name="viewPostByAuthors"></portlet:actionURL>

<aui:form action="<%= actionURL %>" method="post">
	<aui:button name="Submit" type="submit" value="Submit"></aui:button>
</aui:form>