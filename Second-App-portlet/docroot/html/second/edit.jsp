<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<portlet:actionURL var="editURL">
</portlet:actionURL>

<aui:form action="<%= editURL %>" method="post">
    <aui:input label="name" name="name" type="text" value="" />
    <aui:button type="submit" />
</aui:form>