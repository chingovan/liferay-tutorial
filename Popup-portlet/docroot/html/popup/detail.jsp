<%@include file="/html/popup/init.jsp"%>
<%
	String value = ParamUtil.getString(renderRequest, "parameter");
%>

Your value is <%= value%>