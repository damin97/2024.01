<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>

<%
String memberId = (String) session.getAttribute("userId");
if (memberId == null) {
	response.sendRedirect("../login/login_main.jsp");
}
// 지정된 글 번호 얻기
int num = Integer.parseInt(request.getParameter("num"));
//게시글 데이터를 담을 변수 정의
String writer  = "";
String title   = "";
String content = "";
String regtime = "";
int    hits    = 0;

BoardDao dao = BoardDao.getInstance();
Board board = dao.selectOne(num, true);

writer = board.getWriter();
title = board.getTitle();
content = board.getContent();
regtime = board.getRegtime();
hits = board.getHits();

//글 제목과 내용이 웹 페이지에 올바르게 출력되도록 
// 공백과 줄 바꿈 처리
title   = title.replace  (" ", "&nbsp;");
content = content.replace(" ", "&nbsp;").replace("\n", "<br>");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
	width: 680px;
	text-align: center;
}

th {
	width: 100px;
	background-color: cyan;
}

td {
	text-align: left;
	border: 1px solid gray;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>제목</th>
			<td><%=title%></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><%=writer%></td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td><%=regtime%></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td><%=hits%></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><%=content%></td>
		</tr>
	</table>

	<br>
	<input type="button" value="목록보기" onclick="location.href='list.jsp'">
	<input type="button" value="수정"
		onclick="location.href='write.jsp?num=<%=num%>'">
	<input type="button" value="삭제"
		onclick="location.href='delete.jsp?num=<%=num%>'">

</body>
</html>
