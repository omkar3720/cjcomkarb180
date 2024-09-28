<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<style type="text/css">
div {
	text-align: center;
	font-family: sans-serif;
	font-weight: bold;
	font-size: x-large;
}
h1 {
	color: green;
}

</style>
</head>
<body>
     <div>
        <h1>Your Operation Done Successfully..
               Please Check The Results..</h1>
              
              <h2>Addition is ${addition}</h2>
              <h2>Substraction is ${substraction}</h2>
              <h2>Multiplication is ${multiplication}</h2>
              <h2>Divison is ${divison}</h2>
              <h2>Average is ${average}</h2>
     </div>
</body>
</html>