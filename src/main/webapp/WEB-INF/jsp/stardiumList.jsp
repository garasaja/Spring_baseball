<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>stardiumList</title>
<style>
h1 {
	text-align: center;
}
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 10%;
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
	<h1>stardiumList</h1>

	<table>
		<tr>
			<th>Stardium</th>
		</tr>
		<c:forEach items="${stardium}" var="stardium">
			<tr>
				<td>${stardium.place}</td>
			</tr>
		</c:forEach>


	</table>

</body>
</html>