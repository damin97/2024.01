<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie ck = new Cookie("loginId", "damin");
ck.setMaxAge(60); // 60초를 의미, 0은 쿠키 삭제 기능
response.addCookie(ck);
%>
<%=ck.getName() %><br>
<%=ck.getValue() %>
</body>
</html>