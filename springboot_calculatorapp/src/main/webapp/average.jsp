<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Average Page</title>
<style type="text/css">
div {
	text-align: center;
	font-family: sans-serif;
	font-weight: bold;
	font-size: x-large;
}
button {
	padding: 12px;
	border: none;
	color:white;
	background-color: green;
	border-radius: 3px;
}
</style>
</head>
<body>
  <div>
     <h2>Average</h2>
     <form action="avg">
     <pre>
      Number1:<input type="number" name="num1" placeholder="Enter 1st number">
      
      Number2:<input type="number" name="num2" placeholder="Enter 2nd number">
      
      Number3:<input type="number" name="num3" placeholder="Enter 3rd number">
      
      Number4:<input type="number" name="num4" placeholder="Enter 4th number">
      
      Number5:<input type="number" name="num5" placeholder="Enter 5th number">
      
      <button type="submit">Average</button>
      </pre>
     </form>
   </div>
</body>
</html>