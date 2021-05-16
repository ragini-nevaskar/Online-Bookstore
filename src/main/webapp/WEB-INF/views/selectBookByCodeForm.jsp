<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<html>
<body>
<h2>Book By ISBN</h2><hr>

<spring:form action="getBookByCode">
<pre>
	ISBN: <spring:input path="isbn"/>

	<input type="submit" value="Get"/>
</pre>
</spring:form>
<hr>

</body>
</html>