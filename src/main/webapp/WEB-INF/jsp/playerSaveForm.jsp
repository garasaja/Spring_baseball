<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>playerSaveForm</title>
</head>
<body>
	<h1>플레이어 생성하기</h1>
	<hr />
	<form method="post" action="player/save">
		
			<input type="text" name="name" placeholder="이름"> 
			<input type="text" name="number" placeholder="번호">
			<input type="text" name="position" placeholder="포지션">
			<button type="submit">등록하기</button>
		
	</form>
</body>
</html>