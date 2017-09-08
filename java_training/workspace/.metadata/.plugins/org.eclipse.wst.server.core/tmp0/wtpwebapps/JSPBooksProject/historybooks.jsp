<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>History Books</h3><br>
						<form action='controller?forward=historyBooks' method='POST'>
						<input type='checkbox' name='historybooks' value='H1'>H1<br>
						<input type='checkbox' name='historybooks' value='H2'>H2<br>
						<input type='checkbox' name='historybooks' value='H3'>H3<br>
						<input type='submit' value='SHOW'>
						</form>

</body>
</html>