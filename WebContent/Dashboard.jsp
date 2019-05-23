<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DASHBOARD</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3XipmaΩ34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<%// Set standard HTTP/1.1 no-cache headers.
	response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");

	// Set standard HTTP/1.0 no-cache header.
	response.setHeader("Pragma", "no-cache"); %>
	<%
		if(session.getAttribute("username") == null){
			response.sendRedirect("Login.jsp");
		}
	%>
	<h1 class="alert-info text-center">DASHBOARD</h1>
	<p>WELCOME USER <%=session.getAttribute("username") %></p>
	<a href="QuestionUpload.jsp"><button class="btn btn-warning">Add Questions</button></a>
	<a href="ExcelUpload.jsp"><button class="btn btn-success">ExcelUpload</button></a>
	<a href="logout"><button class="btn btn-danger">Logout</button></a>
</body>
</html>