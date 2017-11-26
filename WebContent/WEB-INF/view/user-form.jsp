<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title> Add New User </title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-user-style.css" />
</head>

<body>
<div id="wrapper"> 
	<div id="header"> <h2> Group users </h2> </div>
</div>

<div id="container"> 
	<form:form action="saveUser" modelAttribute="user" method="POST"> 
		<table> 
			<tbody> 
				<tr> 
					<td> <label>User Name: </label></td>
					<td> <form:input path="username" /> </td>
				</tr>
				<tr> 
					<td> <label>First Name: </label></td>
					<td> <form:input path="firstName" /> </td>
				</tr>
				<tr> 
					<td> <label>Last Name: </label></td>
					<td> <form:input path="lastName" /> </td>
				</tr>
				<tr> 
					<td> <label>Email: </label></td>
					<td> <form:input path="email" /> </td>
				</tr>
				<tr> 
					<td> <label></label></td>
					<td> <input type="submit" value="Save" class="save"> </td>
				</tr>
			</tbody>
		</table>
	</form:form>
	<div style="clear:both;"> </div>
	<p><a href="${pageContext.request.contextPath}/users/list" > Back </a> </p>
</div>

</body>
</html>