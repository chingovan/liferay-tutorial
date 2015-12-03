<%@page import="com.blogspot.chingovan.customjsp.servicebuilder.model.impl.AuthorImpl"%>
<%@page import="com.blogspot.chingovan.customjsp.servicebuilder.model.Author"%>
<%@page import="com.blogspot.chingovan.customjsp.servicebuilder.model.impl.BookImpl"%>
<%@page import="com.blogspot.chingovan.customjsp.servicebuilder.model.Book"%>
<%@ include file="/html/customjsp/init.jsp"%>

<%
	Book book = new BookImpl();

	book.setTitle("Introduction to Algorithms");
	book.setEdition("Third Edition");
	book.setCover("https://mitpress.mit.edu/sites/default/files/9780262033848.jpg");
	book.setIsbn("9780262033848");
	book.setNumberOfPage(1312);
	book.setPublisherName("MIT Press");
	book.setPublisherURL("https://mitpress.mit.edu");
	
	Author thomas = new AuthorImpl();
	thomas.setName("Thomas H. Cormen");
	thomas.setUrl("https://mitpress.mit.edu/authors/thomas-h-cormen");
	
	Author charles = new AuthorImpl();
	charles.setName("Charles E. Leiserson");
	charles.setUrl("https://mitpress.mit.edu/authors/charles-e-leiserson");
	
	Author ronald = new AuthorImpl();
	ronald.setName("Ronald L. Rivest");
	ronald.setUrl("https://mitpress.mit.edu/authors/ronald-l-rivest");
	
	Author clifford = new AuthorImpl();
	clifford.setName("Clifford Stein");
	clifford.setUrl("https://mitpress.mit.edu/authors/clifford-stein");
%>

<bs:book 
	isbn='<%= book.getIsbn() != null ? book.getIsbn() : "" %>' 
	title='<%= book.getTitle() != null ? book.getTitle() : "" %>'
	edition="<%= book.getEdition() %>"
	cover="<%= book.getCover() %>"
	numberOfPage="<%=  book.getNumberOfPage() %>"
	publisherName="<%= book.getPublisherName() %>"
	publisherURL="<%= book.getPublisherURL()%>"
>
	<bs:author name="<%= thomas.getName() %>" institute="" url="<%= thomas.getUrl() %>"/>
	<bs:author name="<%= charles.getName() %>" institute="" url="<%= charles.getUrl() %>"/>
	<bs:author name="<%= ronald.getName() %>" institute="" url="<%= ronald.getUrl() %>"/>
	<bs:author name="<%= clifford.getName() %>" institute="" url="<%= clifford.getUrl() %>"/>
</bs:book>