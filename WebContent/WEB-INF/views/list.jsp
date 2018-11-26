<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".delete").click(function(){
			var href = $(this).attr("href");
			$(".deleteForm").attr("action",href).submit();
			return false;
		});
		
	})
</script>
</head>
<body>
<form class="deleteForm" action="" method="post">
	<input type="hidden" name="_method" value="DELETE">
</form>

<c:if test="${empty requestScope.userList }">
		没有用户信息.
</c:if>
<c:if test="${!empty requestScope.userList }">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Gender</th>
				<th>city</th>
				<th>street</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			
			<c:forEach items="${requestScope.userList }" var="userList">
				<tr>
					<td>${userList.id }</td>
					<td>${userList.name }</td>
					<td>${userList.age }</td>
					<td>${userList.gender == 0 ? 'Male' : 'Female' }</td>
					<td>${userList.address.city }</td>
					<td>${userList.address.street }</td>
					<td><a href="user/${userList.id}">Edit</a></td>
					<td><a class="delete" href="userDelete/${userList.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
</c:if>
<a href="user">添加用户</a>

</body>
</html>