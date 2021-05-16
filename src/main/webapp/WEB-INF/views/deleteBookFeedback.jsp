<%@page isELIgnored="false" %>

<!doctype html>
<html>
<body>
<h2>Add Book Feedback</h2>
<hr>
<h3>Details of the book deleted:</h3><hr>

	<pre>
	ISBN:		${book.isbn}
	Author:		${book.author}
	Price:		${book.price}
	Publisher:	${book.publisher}
	Title:		${book.title}
	</pre>

	<hr>
	<a href="delete">Delete More Books</a><br>
	<a href="exit">Exit</a>

</body>
</html>