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
	<form>
		Employ ID: 
		<input type="text" name="empId" value="${param.empId }" readonly><br><br>
		Select:
		<select name="leaveStatus">
			<option selected disabled>SELECT</option>
			<option value="APPROVE">Approve</option>
			<option value="DENY">Deny</option>
		</select><br><br>
		Your Comment:
		<input type="text" name="mgrCmt"><br><br>
		<input type=submit>
	</form>
	
	<c:if test="${param.mgrCmt != null }">
		<jsp:useBean id="dao" class="infinite.LMS.DAO"/>
		<jsp:useBean id="leave" class="infinite.LMS.Leave"/>
		<jsp:setProperty property="*" name="leave"/>
		<c:out value="${dao.approveOrDenyLeave(leave) }"/>
	</c:if>
</body>
</html>