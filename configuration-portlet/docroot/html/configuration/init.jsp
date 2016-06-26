<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>

<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>

<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringBundler"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.util.JavaConstants"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>

<%@page import="com.liferay.portlet.documentlibrary.model.DLFolderConstants"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLAppServiceUtil"%>

<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>


<%@page import="com.liferay.portal.security.permission.PermissionThreadLocal"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>

<%@page import="com.liferay.portal.util.PortalUtil"%>

<%@page import="com.liferay.portal.theme.ThemeDisplay"%>

<%@page import="java.text.SimpleDateFormat"%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletRequest"%>


<%@page contentType="text/html; charset=UTF-8" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />