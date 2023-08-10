<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
					<h6 class="alert alert-success">${msgSucc}</h6>
			<h6 class="alert alert-danger">${err}</h6>
		

						<h2>All Employee List</h2>
				
				
				<table border="1">
						<tr>
							<th>Employee Name</th>
							<th>PassWord</th>
							<th>Mobile No.</th>
							<th>Adhar No.</th>
						</tr>
						
					<c:forEach var = "eList" items="${emp}">
					
						<tr>
							<td>${eList.name }</td>
							<td>${eList.pwd }</td>
							<td>${eList.mob }</td>
							<td>${eList.adhar }</td>
						</tr>
					</c:forEach>
				</table>
</body>
</html>