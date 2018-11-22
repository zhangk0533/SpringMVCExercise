<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>


<!-- 
<form action="/views/userSave" method="post">

		name:<input type="text" name="name" ><br>
		age:<input type="text" name="age" ><br>
		gender:<input type="radio" name="gender" value="0">男
			<input type="radio" name="gender" value="1">女
		<br>
		
		
		city:<input type="text" name="address.city" ><br>
		street:<input type="text" name="address.street" ><br>
		 
		<input type="submit" value="submit">
</form>
 -->

<c:if test="${user.id==null }">

</c:if>

<c:if test="${user.id==null }">
	<form:form action="userSaveOrUpdate" method="POST" modelAttribute="user" >
	<input type="hidden" name="_method" value="PUT" >
	<form:hidden path="id"/><br>
	name:<form:input path="name"/><br>
	age:<form:input path="age"/><br>
	<%
		Map<String,String> genders = new HashMap();
		genders.put("0", "男");
		genders.put("1","女");
		request.setAttribute("genders", genders);
	%>
	gender:<form:radiobuttons path="gender" items="${genders}" /><br>
	city:<form:input path="address.city"/><br>
	street:<form:input path="address.street"/><br>
	<input type="submit" value="Submit">
	</form:form>
</c:if>

</body>
</html>