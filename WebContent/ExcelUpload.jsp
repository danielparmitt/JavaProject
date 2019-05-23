<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ExcelUpload</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3XipmaΩ34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>
	body{
		background-color: skyblue;
	}
</style>
</head>
<body>
	<h1 class="alert-info text-center">Excel Upload Page</h1>
	<div class="container jumbotron">
		<form action="excelupload" method="post" enctype="multipart/form-data">
			<label>CHOOSE EXCEL FILE TO UPLOAD QUESTIONS</label>
			<input type="file" class="btn btn-info" name="file">
			<br>
			<a href="excelupload">
				<button class="btn btn-success" >ADD TO DATABASE</button>
			</a>
		</form>
	</div>
</body>
</html>