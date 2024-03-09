<%@page import="java.util.ArrayList"%>
<%@page import="dto.Board"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
String name = request.getParameter("name");
BoardDao dao = BoardDao.getInstance(); // 객체 불러오기
Board board = dao.selectOne(Integer.parseInt(num), true);
board.setName(name);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<div class="container" style="padding-top: 50px">
<form method="post" action="update.jsp">
    <div class="mb-3">
				<label for="titleInput" class="form-label">NUM</label> 
				<input type="text" readonly name="num" maxlength="80" value="<%=board.getNum()%>" class="form-control" id="titleInput">
			</div>
    <div class="mb-3">
				<label for="titleInput" class="form-label">TITLE</label> 
				<input type="text" name="title" maxlength="80" value="<%=board.getTitle()%>" class="form-control" id="titleInput">
			</div>
			<div class="mb-3">
				<label for="writerInput" class="form-label">WRITER</label>
				<input type="text" readonly name="name" maxlength="20" value="<%=board.getName()%>" class="form-control" id="writerInput">
			</div>
			<div class="mb-3">
				<label for="contentInput" class="form-label">CONTENT</label> 
				<input type="text" name="content" rows="10" value="<%=board.getContent()%>" class="form-control" id="contentInput">
			</div>
			<button class="btn btn-dark">수정하기</button>
</form>
</div>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>