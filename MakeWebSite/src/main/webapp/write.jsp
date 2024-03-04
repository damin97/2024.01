<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>

<%
    // 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
    String tmp = request.getParameter("num");
    int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp)// 참일 때
                                                : 0; // 참이 아닐 때

    // 새 글쓰기 모드를 가정하고 변수 초기값 설정
    String name  = "";
    String title   = "";
    String content = "";
    String action  = "insert.jsp";

    // 글 번호가 주어졌으면, 글 수정 모드
    if (num > 0) {
    	BoardDao dao = BoardDao.getInstance();
    	Board board = dao.selectOne(num, false);
    	
    	// 글 데이터를 변수에 저장
    	name = board.getName();
    	title = board.getTitle();
    	content = board.getContent();
    	
    	// 글 수정 모드일 때는 저장 버튼을 누르면 Update 실행
    	action = "update.jsp?num="+num;

    }
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
<form method="post" action="<%=action%>">
    <div class="mb-3">
				<label for="titleInput" class="form-label">TITLE</label> 
				<input type="text" name="title" maxlength="80" value="<%=title%>" class="form-control" id="titleInput" placeholder="제목">
			</div>
			<div class="mb-3">
				<label for="writerInput" class="form-label">WRITER</label>
				<input type="text" name="name" maxlength="20" value="<%=name%>" class="form-control" id="writerInput" placeholder="작성자">
			</div>
			<div class="mb-3">
				<label for="contentInput" class="form-label">CONTENT</label> 
				<input type="text" name="content" rows="10" class="form-control" id="contentInput" placeholder="텍스트를 입력해주세요">
			</div>
			<button class="btn btn-dark">등록하기</button>
</form>
</div>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>
