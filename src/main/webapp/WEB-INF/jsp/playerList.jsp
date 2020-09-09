<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>playerList</title>
<style>
h1 {
	text-align: center;
}
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	text-align: center;
	width: 50%;
	margin: auto;
}

td, th {
	border: 1px solid #dddddd;
	text-align: center;
	padding: 8px;
	
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
		<h1>PlayerList</h1>

	<table>
		<tr>
			<th>이름</th><th>팀</th><th>소속</th><th>넘버</th><th>포지션</th>
		</tr>
		<c:forEach items="${team}" var="team">
			<tr>
				<td>${team.name}</td>
				<td>${team.team}</td>
				<td>${team.stardium}</td>
				<td>${team.number}</td>
				<td>${team.position}</td>
			
		</c:forEach>


	</table>
</body>
</html>