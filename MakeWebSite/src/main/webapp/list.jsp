<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//세션에 저장된 회원 정보 확인
Member loginMember = (Member)session.getAttribute("member");

//쿠키에서 admin 쿠키 확인
Cookie[] cookies = request.getCookies();
boolean isAdmin = false;
String action = "list2.jsp";
if (cookies != null && cookies.length > 0) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("admin") && cookie.getValue().equals(loginMember.getId())) {
			isAdmin = true;
			action = "list3.jsp";
			
		}
	}
}

String memberId = (String) session.getAttribute("userId");
if (memberId == null) {
	response.sendRedirect("loginForm.jsp");
}
MemberDao dao = MemberDao.getInstance(); // 객체 불러오기
ArrayList<Member> list = dao.selectList(); // selectList() 호출
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>기업형 웹 페이지</title>
<link rel="icon" href="favicon.ico" type="image/x-icon">
<script src="https://kit.fontawesome.com/c47106c6a7.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css">
<script src="js/ie.js"></script>
</head>

<body>
	
	<header>
		<div class="inner">
			<h1>
				<a href="index.jsp">DAMIN KIM</a>
			</h1>
			<ul id="gnb">
				<li><a href="<%=action%>">ESSAY</a></li>
				<li><a href="list.jsp">MEMBER</a></li>
				<li><a href="#">GALLERY</a></li>
			</ul>
			<ul class="util">
				<%
				if ((String) session.getAttribute("userId") != null) { //세션에서 아이디 정보 가져와서 null이 아닐 때        
					// 로그인 상태일 때의 출력
				%>
				<li>
					<%=(String) session.getAttribute("userId")%>님 로그인 
					<button type="button" class="btn btn-light btn-sm" onclick="location.href='logout.jsp'">로그아웃</button>
					<button type="button" class="btn btn-light btn-sm" onclick="location.href='member_update_form.jsp?id=<%=loginMember.getId()%>'">회원정보 수정</button>
				</li>
				<% } else { %>
				<!-- 로그인 상태가 아닐 때-->
				<li><a href="loginForm.jsp">Login</a></li>
				<% } %>
			</ul>
		</div>
	</header>
	<div class="container" style="padding-top: 50px; width:60%; margin:auto;">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th class="num">#</th>
					<th class="id">ID</th>
					<th class="email">EMAIL</th>
					<th class="name">NAME</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<tbody>
			<%
			for(Member member : list){
			%>
				<tr>
					<th scope="row"><%=member.getMemberno()%></th>
					<td><%=member.getId()%></td>
					<td><%=member.getEmail()%></td>
					<td><%=member.getName()%></td>
					<td><button class="btn btn-dark" onClick='location.href="member_update_form_from_list.jsp?id=<%=member.getId()%>"'>수정</button></td>
					<td><button class="btn btn-warning" onClick='location.href="memberDelete_fromList.jsp?id=<%=member.getId()%>"'>삭제</button></td>
				</tr>
			<%
			}
			%>
			</tbody>
		</table>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
	</script>
</body>
</html>