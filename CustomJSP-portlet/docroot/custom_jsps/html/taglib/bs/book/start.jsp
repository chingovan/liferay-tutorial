<%@ include file="/html/taglib/bs/book/init.jsp" %>

<table>
	<tr>
		<td rowspan="5">
			<img src="<%= cover%>" alt="cover" width="210px" height="230px"/>	
		</td>
		<td colspan="2" style="font-weight: bold;">
			<%= title.toUpperCase() + "-" + edition%>
		</td>
	</tr>
	
	<tr>
		<td>
			ISBN
		</td>
		<td>
			<%= isbn %>
		</td>
	</tr>
	<tr>
		<td>
			Pages
		</td>
		<td>
			<%= numberOfPage %>
		</td>
	</tr>
	<tr>
		<td>
			Publisher
		</td>
		<td>
			<a href="<%= publisherURL%>"><%= publisherName %></a>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		
