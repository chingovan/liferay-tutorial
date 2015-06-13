<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<portlet:actionURL var="editNameURL" name="editName">
</portlet:actionURL>

<aui:form action="<%= editNameURL %>" method="post">
    <aui:input label="name" name="name" type="text" value="" />
    <aui:button type="submit" />
</aui:form>