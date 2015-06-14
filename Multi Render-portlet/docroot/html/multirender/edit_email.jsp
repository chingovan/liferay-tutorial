<%@include file="/html/multirender/init.jsp"%>

<portlet:actionURL var="sendEmailURL" name="sendEmail">
</portlet:actionURL>

<aui:form action="<%= sendEmailURL %>" method="post">
	<aui:input label="Email" name="email" type="text" value="" />
    <aui:input label="Subject" name="subject" type="text" value="" />
    <aui:input label="Content" name="content" type="textarea" value=""/>
    <aui:button type="submit" />
</aui:form>