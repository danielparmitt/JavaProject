<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question Upload</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3XipmaΩ34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>
	body{
		background-color: skyblue;
	}
</style>
</head>
<body>
	<h1 class="alert-info text-center">Question Upload</h1>
	<div class="container jumbotron">
		<form action="questionupload" method="post">
			
		<input type="text" class="form-control" name="question"  placeholder="Enter Question ">
		<br>
		<input type="text" class="form-control" name="optiona" placeholder="Enter option A">
		<br>
		<input type="text" class="form-control" name="optionb" placeholder="Enter option B">
		<br>
		<input type="text" class="form-control" name="optionc" placeholder="Enter option C">
		<br>
		<input type="text" class="form-control" name="optiond" placeholder="Enter option D">
		<br>
		<input type="text" class="form-control" name="right" placeholder="Enter right Answer">
		<br>
		<input type="radio" name="subject" value="C++" autocomplete="off" > C++
		&nbsp;&nbsp;&nbsp;&nbsp;	
    	<input type="radio" name="subject" value="JAVA" autocomplete="off"> JAVA
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="subject" value="JAVASCRIPT" autocomplete="off"> JAVASCRIPT
		
		<br><br>
		<button class="btn btn-primary">Add</button>&nbsp;
		<button class="btn btn-success" type="reset">Reset</button>
		</form>
	</div>
</body>
</html>