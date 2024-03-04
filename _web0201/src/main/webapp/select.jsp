<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터베이스</title>
</head>
<body>
<a href="index.jsp">목록으로</a>
<%
request.setCharacterEncoding("utf-8"); //request.getParameter에 대해서 한글을 처리하게 만드는 코드
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "select ename, job, sal*12 as annal from emp1";
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();%>
<table border="1" solid>
<%
while(rs.next()){%>
	<tr>
	<td><a href="updateForm.jsp?ename=<%= rs.getString("ename")%>"><%= rs.getString("ename") %></a></td>
	<td><%= rs.getString("job") %></td>
	<td><%= rs.getString("annal") %></td>
	<td><a href="delete.jsp?ename=<%= rs.getString("ename")%>">삭제</a></td>
	</tr>
<% }%>
</table>
</body>
</html>