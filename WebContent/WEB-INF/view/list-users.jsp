<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title> TheBalance - Balance your budget </title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

<div id="wrapper"> 
	<div id="header"> <h2> Group users </h2> </div>
</div>

<div id="container"> 
	<div id="content">
	
	<input type="button" value="Add User" onclick="window.location.href='addUser'; return false;" class="add-button" />
	
		<table> 
			<tr> 
				<th> User Name </th>
				<th> First Name </th>
				<th> Last Name </th>
				<th> Email </th>
			</tr>
			
			<c:forEach	var="user" items="${users}">
				<tr>
					<td> ${user.username} </td>
					<td> ${user.firstName} </td>
					<td> ${user.lastName} </td>
					<td> ${user.email} </td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>

</body>
</html>