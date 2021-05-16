<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<html>
<body>
<h1>All Books</h1>
<hr>
	<table border="1">
		<tr>
			<th>ISBN</th><th>Author</th><th>Title</th><th>Edition<th>Publisher</th><th>Price</th>
		</tr>
		
		<jstl:forEach items="${books}" var="book">
			<tr>
				<td>${book.isbn}</td>
				<td>${book.author}</td>
				<td>${book.title}</td>
				<td>${book.edition}</td>
				<td>${book.publisher}</td>
				<td>${book.price}</td>
				<td><a href="deleteBookThroughForm?code=${book.isbn}">X</a></td>
				<td><a href="updateBook?code=${book.isbn}">Update</a></td>
			</tr>
		</jstl:forEach>
		
		
	</table>
	
	<hr>
	<a href="exit">Exit</a>
</body>
</html>