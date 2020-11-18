<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<center><h1>ALL INFORMAITION</h1></center></head>

<script type="text/javascript">
function addUser(){
	document.fn.action="registerPage";
	document.fn.submit();
}
</script>
<body>

<h2></h2>
	<form name="fn">
	
		<table border="1" align="center">
			<th>SrNo</th>
			<th>Id</th>
			<th>NAME</th>
			<th>UNAME</th>
			<th>PASSWORD</th>
			<th>ADDRESS</th>
		</table>
	
		<tr>
			<c:forEach items="${userList}" var="user">
					<br>
					<td><input type="radio" name="uid" value="${user.uid}"></td>
					<td>${user.uid}</td>
					<td>${user.name}</td>
					<td>${user.uname}</td>
					<td>${user.password}</td>
					<td>${user.address}</td>
		</tr>
		</c:forEach>
	<table border="2" align="center">
	<tr>
	<td><input type="button" value="EDIT" onclick="editUser()"></td>
	<td><input type="button" value="ADD" onclick="addUser()"></td>
	<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

	</tr>
</table>
		
	</form>

</body>
</html>