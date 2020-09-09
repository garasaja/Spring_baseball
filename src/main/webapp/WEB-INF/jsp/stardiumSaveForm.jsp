<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>stardiumSaveForm</title>
</head>
<body>
	<h1>스터디움 생성하기</h1>
	<hr />
	<form method="post" action="stardium/save">
		
			<input type="text" name="place" placeholder="스터디움넣기"> 
			
			<button type="submit">등록하기</button>
		
	</form>
	

</body>
</html>