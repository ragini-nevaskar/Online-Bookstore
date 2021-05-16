<%@page isELIgnored="false" %>

<!doctype html>
<html>
<body>
<h2>Add Book Feedback</h2>
<hr>
<h3>Details of the Book Stored:</h3>

	<pre>
	ISBN: 		${details.isbn}
	Title: 		${details.title}
	Author: 	${details.author}
	Edition: 	${details.edition}
	Publisher: 	${details.publisher}
	Price: 		${details.price}
	</pre><hr>
	<a href="add">Add More Books</a><br>
	<a href="exit">Exit</a>

</body>
</html>