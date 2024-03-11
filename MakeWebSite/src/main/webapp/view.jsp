<%@page import="dto.Member"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>

<%
String memberId = (String) session.getAttribute("userId");
if (memberId == null) {
	response.sendRedirect("loginForm.jsp");
}
// 지정된 글 번호 얻기
int num = Integer.parseInt(request.getParameter("num"));
String name = request.getParameter("name");
//게시글 데이터를 담을 변수 정의
String title   = "";
String content = "";
String regtime = "";
int    hits    = 0;
String action = "list2.jsp";

BoardDao dao = BoardDao.getInstance();
Board board = dao.selectOne(num, true);

num = board.getNum();
title = board.getTitle();
content = board.getContent();
regtime = board.getRegtime();
hits = board.getHits();

//글 제목과 내용이 웹 페이지에 올바르게 출력되도록 
// 공백과 줄 바꿈 처리
title   = title.replace  (" ", "&nbsp;");
content = content.replace(" ", "&nbsp;").replace("\n", "<br>");

Cookie[] cookies = request.getCookies();
Member loginMember = (Member) session.getAttribute("member");
boolean isAdmin = false;

if (cookies != null && cookies.length > 0) {
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("admin") && cookie.getValue().equals(loginMember.getId())) {
            isAdmin = true;
            break;
        }
    }
}

if (isAdmin) {
    action = "list3.jsp";
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
    		<div class="mb-3 row">
				<label for="titleInput" class="col-sm-2 col-form-label">TITLE</label> 
				<div class="col-sm-10">
				<input type="text" readonly value="<%=title%>" class="form-control-plaintext" id="staticTitle">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="writerInput" class="col-sm-2 col-form-label">WRITER</label>
				<div class="col-sm-10">
				<input type="text" readonly value="<%=name%>" class="form-control-plaintext" id="staticWriter">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="contentInput" class="col-sm-2 col-form-label">CONTENT</label> 
				<div class="col-sm-10">
				<input type="text" readonly value="<%=content%>" class="form-control-plaintext" id="staticContent">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="contentInput" class="col-sm-2 col-form-label">DATE</label> 
				<div class="col-sm-10">
				<input type="text" readonly value="<%=regtime%>" class="form-control-plaintext" id="staticDate">
				</div>
			</div>
			<div class="mb-3 row">
				<label for="contentInput" class="col-sm-2 col-form-label">VIEWS</label> 
				<div class="col-sm-10">
				<input type="text" readonly value="<%=hits%>" class="form-control-plaintext" id="staticHits">
				</div>
			</div><br>
			<button class="btn btn-dark">목록보기</button>
</form>
</div>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>
