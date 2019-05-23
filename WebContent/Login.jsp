<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3XipmaΩ34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style type="text/css">
	h1{
		text-align:center;
		color:rgb(43,46,59);
		font-weight:bold;
	}
	
	#container{
		height:97vh;
		background-image: url("https://images.pexels.com/photos/1340588/pexels-photo-1340588.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
		background-attachment: fixed;
	}
	
	#inner{
		margin:0% 20%;
	}
	h4{
		text-align:center;
	}
	a:hover{
		text-decoration:none;
	}
</style>
</head>
<body>
	<div id="container" class="jumbotron">
		<div id="inner">
				<a href="Home.html"><h1>Online Test</h1></a>
		<h4>Login  &nbsp; <a href="Register.jsp">Register</a> </h4>
	<form action="login" method="post">
		<div class="form-group">
			
			<input type="text" class="form-control" name="username" placeholder="Enter your user name">
		</div>
		
		<div class="form-group">
			
			<input type="password" class="form-control" name ="password" placeholder="Enter your password">
		</div>
		
		<div class="form-group">
			<button class="btn btn-primary" >SUBMIT</button>
			<button class="btn btn-success" type="reset">RESET</button>
		</div>
	</form>
		</div>
	</div>
</body>
</html>