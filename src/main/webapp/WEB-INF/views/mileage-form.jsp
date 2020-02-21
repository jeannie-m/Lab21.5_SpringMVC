<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mileage Calculator Input</title>
</head>
<body>
<h3> Please enter the required info:</h3>
<form method="post" action="/mileage-form">
<p>Vehicle Mileage: <input type="number" name="mileage" min="0" max="99999999"></input>
<p>Gallons of Gas:  <input type="number" name="gallons" min="0" max="99999999"></input>
<button type="submit">submit</button></p></form>
</body>
</html>