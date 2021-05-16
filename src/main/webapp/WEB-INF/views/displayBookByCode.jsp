<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<body>
<h1>Book Details</h1><hr>
<pre>
	ISBN:		${book.isbn}
	Author:		${book.author}
	Title:		${book.title}
	Publisher:	${book.publisher}
	Price:		${book.price}

</pre>

<a href="exit">Exit</a>
</body>
</html>