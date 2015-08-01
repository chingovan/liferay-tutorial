<%@ include file="/html/formnavi/init.jsp" %>

<aui:input name="name" label="Name" type="text"/>

<aui:input name="age" label="Age" title="text"/>

<aui:input name="gender" label="Male" value="1" type="radio" checked="<%= true %>"/>
<aui:input name="gender" label="Female" value="0" type="radio"/>