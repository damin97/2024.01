<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력결과</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "insert into emp1(ename, job, sal) values(?,?,?)";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("ename"));
pstmt.setString(2, request.getParameter("job"));
pstmt.setString(3, request.getParameter("sal"));
int result = pstmt.executeUpdate();
if(result == 1){
	out.println("입력성공!");
}
%><br>
<button onclick="location.href='select.jsp' ">목록으로</button>
<%
response.sendRedirect("select.jsp");
%>
</body>
</html>