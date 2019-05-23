<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3XipmaΩ34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<style>
	body{
		background-color: skyblue;
	}
</style>
<body>
	<h1 class="alert-primary text-center">CHANGE PASSWORD</h1>
	<div class="container jumbotron">
		<form action="changepassword" method="post">
		
			<div class="form-group">
				<input type="password" name="newpwd" class="form-control" placeholder="Enter the new Password">
			</div>
			
			<div class="form-group"> 
				<input type="password" name="newpwdagain" class="form-control" placeholder="Enter the new Password Again">
			</div>
			
			
			<div class="form-group">
				<button class="btn btn-success">SUBMIT</button>
			</div>
			
		</form>
	</div>
</body>
</html>