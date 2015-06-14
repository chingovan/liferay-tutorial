<%@include file="/html/multirender/init.jsp"%>

<portlet:actionURL var="editNameURL" name="editName">
</portlet:actionURL>

<aui:form action="<%= editNameURL %>" method="post">
    <aui:input label="name" name="name" type="text" value="" />
    <aui:button type="submit" />
</aui:form>