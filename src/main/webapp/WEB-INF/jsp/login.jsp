<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>			
							<h1>LogIn Form</h1>
							
							<h6 class="alert alert-danger">${errlog}</h6>
							
					<form action="login" method="post">
							<input type="text" name="username" placeholder="Enter UserName "><br><br>
							<input type="text" name="password" placeholder="Enter Password "><br><br>
							<input type="submit" value="Login" >
					</form>
</body>
</html>