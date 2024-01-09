<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public static String print(){
	return "안녕";
}
%>
<%= print() %>
<%
int sum = 0;
for(int i=1; i<=10; i++){
	sum += i;
}
%>
<%= sum %>
<h3>오늘 날짜와 시간 정보 입니다</h3>
<%
Date now = new Date();
%>
<%= now %>

</body>
</html>