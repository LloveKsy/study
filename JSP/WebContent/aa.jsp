<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>AAA Page</h3>
	<% 
		String str = "aalovebb";
	%>
	<!-- 在aa.jsp中包含bb.jsp -->
	<jsp:forward page="bb.jsp">
		<jsp:param value="雪儿" name="love"/>
	</jsp:forward>
	
</body>
</html>