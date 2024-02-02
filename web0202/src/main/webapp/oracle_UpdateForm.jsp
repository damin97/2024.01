<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* 화면 전체 높이로 설정 */
        }
        /* 아래 스타일은 디자인을 위한 것으로 필요에 따라 조절 가능 */
        .content-container {
            text-align: center;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
        }
    </style>
</head>
<body>
<div class="content-container">
<h3 style="color: blue;">학생 성적 수정</h3>
<%
request.setCharacterEncoding("utf-8"); //request.getParameter에 대해서 한글을 처리하게 만드는 코드
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "select num, name, kor, eng, math from score where num=?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("num"));
ResultSet rs = pstmt.executeQuery();
String num = ""; 
String name = ""; 
String kor = "";
String eng = "";
String math = "";
if(rs.next()){
	num = rs.getString("num");
	name = rs.getString("name");
	kor = rs.getString("kor");
	eng = rs.getString("eng");
	math = rs.getString("math");
}
%>
<form action="oracle_Update.jsp" method="post">
번호 <input type="text" name="num" value="<%=num %>"/><br>
이름 <input type="text" name="name" value="<%=name %>"/><br>
국어 <input type="text" name="kor" value="<%=kor %>"/><br>
영어 <input type="text" name="eng" value="<%=eng %>"/><br>
수학 <input type="text" name="math" value="<%=math %>"/><br><br>
<input type="submit"  value="확인"/>
<input type="reset" />
<button onclick="location.href='oracle_List.jsp'">목록으로</button>
</form>
</div>
</body>
</html>