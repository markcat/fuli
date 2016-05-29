<%@page pageEncoding="utf-8"   
contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<table width="60%" border="1" cellpadding="2" cellspacing="0">
			<tr>
				<td>EMPNO</td>
				<td>ENAME</td>
				<td>JOB</td>
				<td>MGR</td>
				<td>HIREDATE</td>
				<td>SAL</td>
				<td>COMM</td>
				<td>DEPTNO</td>
			</tr>
			<c:forEach items="${emps }" var="emp">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.mgr}</td>
					<td>${emp.hiredate}</td>
					<td>${emp.sal}</td>
					<td>${emp.comm}</td>
					<td>${emp.deptno}</td>		
				</tr>	
			</c:forEach>
		</table>
	</body>
</html>