<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<style type="text/css">
div {
	text-align: center;
	margin: 100px 400px;
	border: solid black;
	border-radius: 5px;
	font-family: sans-serif;
	font-size: x-large;
	font-weight: bold;
	}
input {
	box-sizing: border-box;
	border:thin solid black;
}
button {
	color: white;
	background-color: green;
	border: none;
	padding:12px;
}
</style>
</head>
<body>
    <div>
      <h2>Registration Form</h2>
      <form action="save">
      <pre>
    Rollno:<input type="number" name="rollno" placeholder="Enter RollNo">   
      
     Name:<input type="text"  name="name" placeholder="Enter Name">
          
  Address:<input type="text" name="address" placeholder="Enter Address">
          
 Mobile No:<input type="number" name="mobileno" placeholder="Enter Mobile No">
          
   Gender:<input type="radio" name="gender" value="Male" >Male<input type="radio" name="gender" value="Female" >Female
 
          <button type="submit">Submit</button>
          </pre>
      </form>
    </div>
</body>
</html>