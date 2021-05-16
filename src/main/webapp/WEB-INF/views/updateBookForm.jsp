<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Update Book</h2><hr>

	<form:form action="savechanges" modelAttribute="book">
		<pre>
		ISBN: 		<form:input path="isbn"/>
		Author:		<form:input path="author"/>
		Title:		<form:input path="title"/>	
		Publisher:	<form:input path="publisher"/>
		Price:		<form:input path="price"/>
		
		<input type="submit" value="Update"/>
		</pre>
	</form:form>
	<hr>
	
</body>
</html>