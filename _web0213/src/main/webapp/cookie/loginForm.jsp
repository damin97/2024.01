<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>" method="post">
아이디 <input type="text" name="id" size="10">
암호 <input type="text" name="password" size="10">
로그인 정보 기억하기 <input type="checkbox">
<input type="submit" value="로그인">
</form>
</body>
</html>