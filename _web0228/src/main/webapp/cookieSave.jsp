<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email = request.getParameter("email");
String ck = request.getParameter("ck");

if(ck != null && ck.equals("on")) { //쿠키 생성의 경우
	//System.out.println(email);
	
	Cookie cookie = new Cookie("email", email);
	cookie.setMaxAge(60*60*24); //60초
	response.addCookie(cookie);
} else { //쿠키 삭제의 경우
	Cookie cookie = new Cookie("email", null);
	cookie.setMaxAge(0); //60초
	response.addCookie(cookie);
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>