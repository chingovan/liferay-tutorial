<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />

<portlet:actionURL var="uploadFileURL" name="uploadFile">
</portlet:actionURL>

<aui:form action="<%= uploadFileURL %>" method="post" name="fm" enctype="multipart/form-data">
	<aui:input name="fileData" label="Upload File" type="file" />
	
	<aui:button type="submit" />
</aui:form>
