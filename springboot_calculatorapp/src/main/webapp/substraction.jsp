<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Substraction Page</title>
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
     <h2>Substraction</h2>
     <form action="sub">
     <pre>
      Number1:<input type="number" name="num1" placeholder="Enter 1st number">
      
      Number2:<input type="number" name="num2" placeholder="Enter 2nd number">
      
      <button type="submit">Sub</button>
      </pre>
     </form>
   </div>
</body>
</html>