<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@page import="java.util.List"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<%

BoardDao dao = BoardDao.getInstance(); // 객체 불러오기
List<Board> list = dao.selectList();
//선택한 옵션에 따라 게시글 필터링
String selectedOption = request.getParameter("filterOption");
if ("1".equals(selectedOption)) {
    // 옵션이 "1"일 경우 전체 글을 가져오기
    list = dao.selectList();
}else if ("2".equals(selectedOption)) {
	list = dao.selectBestList();
}
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
				<li><a href="list1.jsp">ESSAY</a></li>
				<li><a href="#">GALLERY</a></li>
			</ul>

			<ul class="util">
				<%
				if ((String) session.getAttribute("userId") != null) { //세션에서 아이디 정보 가져와서 null이 아닐 때        
					// 로그인 상태일 때의 출력
				%>
				<form action="logout.jsp" method="post">
					<%=(String) session.getAttribute("userId")%>님 로그인
					<button type="button" class="btn btn-light btn-sm" onclick="location.href='logout.jsp'">로그아웃</button>
					<button type="button" class="btn btn-light btn-sm" onclick="location.href='member_update_form.jsp'">회원정보 수정</button>
				</form>
				<% } else { %>
				<!-- 로그인 상태가 아닐 때-->
				<li><a href="loginForm.jsp">Login</a></li>
				<li><a href="memberJoinForm.jsp">Sign up</a></li>
				<% } %>
			</ul>
		</div>
	</header>


<div class="inner" style="padding-top: 50px; width:60%; margin:auto;">

<form id="filterForm" method="post" action="list1.jsp">
<select class="form-select" aria-label="Default select example" name="filterOption" onchange="submitForm()">
  <option value="0" selected>옵션 선택하기</option>
  <option value="1">전체글 보기</option>
  <option value="2">인기글 보기</option>
</select><br>
</form>
	<table class="table table-bordered table-hover" >
		<thead>
		<tr>
			<th class="num">번호</th>
			<th class="title">제목</th>
			<th class="name">작성자</th>
			<th class="content">내용</th>
			<th class="regtime">작성일시</th>
			<th>조회수</th>
		</tr>
		</thead>
		<tbody>
		<%
		for(Board board : list) {
		%>
		<tr>
			<td><%=board.getNum()%></td>
			<td style="text-align: left;"><a
				href="view.jsp?num=<%=board.getNum()%>&name=<%=board.getName()%>"> <%=board.getTitle()%>
			</a></td>
			<td><%=board.getName()%></td>
			<td><%=board.getContent()%></td>
			<td><%=board.getRegtime()%></td>
			<td><%=board.getHits()%></td>
			
		</tr>
		<%
		}
		%>
		</tbody>
	</table>

	<br>
</div>

<script>
        function submitForm() {
        	
            document.getElementById("filterForm").submit();
        }
    </script>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
	</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  
  </body>
</html>
