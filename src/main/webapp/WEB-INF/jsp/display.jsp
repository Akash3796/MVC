<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


</head>
<body>
			<h6 class="alert alert-success">${msgSucc}</h6>
			<h6 class="alert alert-danger">${err}</h6>
		

						<h2>Data Print</h2>
				
				<h4>UserName     : ${emp.name}</h4>
				<h4>PassWord     : ${emp.pwd}</h4>
				<h4>Mob No.      : ${emp.mob}</h4>
				<h4>Adhar No.    : ${emp.adhar}</h4>
				
</body>
</html>