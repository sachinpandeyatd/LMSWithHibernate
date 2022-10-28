<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dao" class="infinite.LMS.DAO"></jsp:useBean>
	<table border=3>
		<tr>
			<th>Employ ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>DOJ</th>
			<th>Department</th>
			<th>Manager ID</th>
			<th>Leave Balance</th>
			<th>Info</th>
		</tr>
		<c:forEach var="employ" items="${dao.showEmploy()}">
		<tr>
			<td>${employ.empId }</td>
			<td>${employ.name }</td>
			<td>${employ.email }</td>
			<td>${employ.mob }</td>
			<td>${employ.doj }</td>
			<td>${employ.dept }</td>
			<td>${employ.mId }</td>
			<td>${employ.leaveAvail }</td>
			<td><a href="employee-detail.jsp?mid=${employ.mId }&empId=${employ.empId}"><button>Info</button></a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>