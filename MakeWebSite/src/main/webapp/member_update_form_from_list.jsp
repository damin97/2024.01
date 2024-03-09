<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	Member member= MemberDao.getInstance().select(request.getParameter("id"));
	
	%>
	<div class="container" style="padding-top: 50px">
		<form action="member_update_from_list.jsp" method="post">
			<div class="mb-3">
				<label for="idInput" class="form-label">아이디</label> <input
					type="text" name="id" readonly value="<%=member.getId()%>"
					class="form-control" id="idInput" placeholder="아이디">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">이메일</label>
				<input type="email" name="email" value="<%=member.getEmail()%>"
					class="form-control" id="exampleFormControlInput1"
					placeholder="name@example.com">
			</div>
			<div class="mb-3">
				<label for="nameInput" class="form-label">이름</label> <input
					type="text" name="name" value="<%=member.getName()%>"
					class="form-control" id="nameInput" placeholder="이름">
			</div>
			<button class="btn btn-dark">저장하기</button>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>