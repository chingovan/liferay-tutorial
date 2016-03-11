<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.blogspot.chingovan.tutorial.actions.model.Student"%>

<%@page import="com.blogspot.chingovan.tutorial.actions.search.StudentDisplayTerms"%>
<%@page import="com.blogspot.chingovan.tutorial.actions.search.StudentSearchContainer"%>
<%@page import="com.blogspot.chingovan.tutorial.actions.service.StudentLocalServiceUtil"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />
