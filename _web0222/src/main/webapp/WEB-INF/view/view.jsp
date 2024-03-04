<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Member member = (Member)session.getAttribute("member");
if(member == null){
	response.sendRedirect("loginForm.do");
}
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
			<td>${board.title}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<th>작성일시</th>
			<td>${board.regtime}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${board.hits}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${board.content}</td>
		</tr>
	</table>

	<br>
	<input type="button" value="목록보기" onclick="location.href='list.do'">
	<input type="button" value="수정"
		onclick="location.href='write.do?num=${board.num}'">
	<input type="button" value="삭제"
		onclick="location.href='delete.do?num=${board.num}'">

</body>
</html>
