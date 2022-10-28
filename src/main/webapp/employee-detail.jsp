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
	<jsp:useBean id="dao" class="infinite.LMS.DAO"/>
	<c:set var="manager" value="${dao.showEmploy(param.mid) }" />
	<c:if test="${manager.size() > 0 }">
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
			</tr>
			<tr>
				<td>${manager[0].empId }</td>
				<td>${manager[0].name }</td>
				<td>${manager[0].email }</td>
				<td>${manager[0].mob }</td>
				<td>${manager[0].doj }</td>
				<td>${manager[0].dept }</td>
				<td>${manager[0].mId }</td>
				<td>${manager[0].leaveAvail }</td>
			</tr>
		</table>
	</c:if>
	<c:if test="${manager.size() == 0 }"><c:out value="NO MANAGER FOUND."/></c:if>
	<br><hr><br>
	
	<c:set var="employ" value="${dao.showEmploy(param.empId) }" />
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
		</tr>
		<tr>
			<td>${employ[0].empId }</td>
			<td>${employ[0].name }</td>
			<td>${employ[0].email }</td>
			<td>${employ[0].mob }</td>
			<td>${employ[0].doj }</td>
			<td>${employ[0].dept }</td>
			<td>${employ[0].mId }</td>
			<td>${employ[0].leaveAvail }</td>
		</tr>
	</table>
	<br><hr><br>
	
	
	<table border=3>
		<tr>
			<th>Leave ID</th>
			<th>Employ ID</th>
			<th>Start Date</th>
			<th>End Date</th>
			<th>No of Days</th>
			<th>Reason</th>
			<th>Type</th>
			<th>Status</th>
			<th>Manager Comment</th>
		</tr>
		<c:forEach var="leave" items="${dao.showHistory(param.empId)}">
		<tr>
			<td>${leave.leaveId }</td>
			<td>${leave.empId }</td>
			<td>${leave.leaveStartDate }</td>
			<td>${leave.leaveEndDate }</td>
			<td>${leave.noOfDays }</td>
			<td>${leave.leaveReason }</td>
			<td>${leave.leaveType }</td>
			<td>${leave.leaveStatus }</td>
			<td>${leave.mgrCmt }</td>
		</tr>
		</c:forEach>
	</table>
	<br><hr><br>
	
	
	<table border=3>
		<tr>
			<th>Leave ID</th>
			<th>Employ ID</th>
			<th>Start Date</th>
			<th>End Date</th>
			<th>No of Days</th>
			<th>Reason</th>
			<th>Type</th>
			<th>Status</th>
			<th>Approve</th>
		</tr>
		<c:forEach var="leave" items="${dao.showSubordinatePendingLeaves(param.empId)}">
		<tr>
			<td>${leave.leaveId }</td>
			<td>${leave.empId }</td>
			<td>${leave.leaveStartDate }</td>
			<td>${leave.leaveEndDate }</td>
			<td>${leave.noOfDays }</td>
			<td>${leave.leaveReason }</td>
			<td>${leave.leaveType }</td>
			<td>${leave.leaveStatus }</td>
			<td><a href="approve-leave.jsp?empId=${leave.empId }"><button>Approve</button></a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>