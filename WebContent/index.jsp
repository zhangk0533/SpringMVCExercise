<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="testHibernate" method="post">
	<!-- 
		id:<input type="text" name="id"><br>
	 -->
		name:<input type="text" name="name" ><br>
		age:<input type="text" name="age" ><br>
		gender:<input type="radio" name="gender" value="0">男
			<input type="radio" name="gender" value="1">女
		<br>
		
		
		city:<input type="text" name="address.city" ><br>
		street:<input type="text" name="address.street" ><br>
		 
		<input type="submit" value="submit">
	</form>
	
</body>
</html>