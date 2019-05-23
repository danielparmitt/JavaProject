<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enquiry</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3XipmaΩ34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>
	#outer{
		border:2px solid green;
	}
</style>
</head>
<body>
	<h1 class="alert-success text-center">Enquiry  Form</h1>
	<div class="container jumbotron" id="outer">
		<form action="enquiryform" method="post">
		<div class="form-group">
			<input class="form-control" placeholder="Enter your name" name="name">
		</div>
		<div class="form-group">
			<input class="form-control" placeholder="Enter your userid" name="userid">
		</div>
		
		
		<div class="form-group">
			<label>Enter your Query below</label>
			<textarea class="form-control" name="query">
			
			</textarea>
		</div>
		
		<button class="btn btn-success">SUBMIT</button>
	</form>
	</div>
</body>
</html>