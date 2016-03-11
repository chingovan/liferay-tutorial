<%@include file="/html/actions/init.jsp"%>

<%
	String redirect = ParamUtil.getString(request, "redirect");

	StudentSearchContainer searchContainer = (StudentSearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	StudentDisplayTerms displayTerms = (StudentDisplayTerms)searchContainer.getDisplayTerms();

%>
<aui:row>
	<aui:col span="4">
		<aui:input name="code" label="Code" inlineField="true" inlineLabel="left" />
	</aui:col>
	<aui:col span="4">
		<aui:input name="name" label="Name" inlineField="true" inlineLabel="left" />
	</aui:col>

	<aui:col span="4">
		<aui:select name="gender" label="Gender" inlineField="true" inlineLabel="left" >
			<aui:option value="0" selected="<%= displayTerms.getGender() ==0 %>">All</aui:option>
			<aui:option value="1" selected="<%= displayTerms.getGender() ==1 %>">Nam</aui:option>
			<aui:option value="2" selected="<%= displayTerms.getGender() ==2 %>">Nu</aui:option>		
		</aui:select>
	</aui:col>
</aui:row>
<aui:row>
	<aui:button type="submit" value="Search" icon="icon-search" /> 
</aui:row>
