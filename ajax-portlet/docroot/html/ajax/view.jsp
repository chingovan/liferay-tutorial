<%@include file="/html/ajax/init.jsp" %>


<input name="searchInput" id="searchInput" type="text" />
<button id="searchButton" onClick="javascript: onSearch();" type="button">Search</button>

<br />

<table width="100%">
	<tr>
		<td width="30%">
			<liferay-ui:message key="student-name" />			
		</td>
		<td>
			<span style="font-weight: bold;" id="studentName"></span>
		</td>
	</tr>
	
	<tr>
		<td width="30%">
			<liferay-ui:message key="student-code" />			
		</td>
		<td>
			<span style="font-weight: bold;" id="studentCode"></span>
		</td>
	</tr>
	
	<tr>
		<td width="30%">
			<liferay-ui:message key="student-gender" />			
		</td>
		<td>
			<span style="font-weight: bold;" id="studentGender"></span>
		</td>
	</tr>
</table>

<portlet:resourceURL var="resourceURL" >
</portlet:resourceURL>

<aui:script use="aui-base,aui-node,aui-io-request,liferay-portlet-url">
	Liferay.provide(
		window, 
		"onSearch", 
		function() {
			var code = AUI().one('#searchInput').val();
			
			var resourceURL = '<%= resourceURL.toString()%>';
			
			var ajaxrequest = AUI().io.request(
				resourceURL,
				{
					data: {'<portlet:namespace/>code': code},
					dataType: 'json',
					method: 'post',
					autoLoad: false,
					sync: true,
					on: {
						success: function() {
							
							AUI().one('#studentName').text(this.get('responseData').name);
							AUI().one('#studentCode').text(this.get('responseData').code);
							AUI().one('#studentGender').text(this.get('responseData').gender);
						}
					}
				}
			);
			
			ajaxrequest.start();
		},['liferay-util-window']
	);
</aui:script>