<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = "";
String email = "";
Cookie[] cookies = request.getCookies(); //파일에서 가져오기
if(cookies != null){
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("email")){
			email = cookie.getValue();
			
		}
		if(cookie.getName().equals("id")){
			id = cookie.getValue();

		}
	}
}
%>
<!doctype html>
<html lang="en" data-bs-theme="auto">
<head>
<script src="assets/js/color-modes.js"></script>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.115.4">
<title>Sign in Template · Bootstrap v5.3</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.3/examples/sign-in/">



<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">

<link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.b-example-divider {
	width: 100%;
	height: 3rem;
	background-color: rgba(0, 0, 0, .1);
	border: solid rgba(0, 0, 0, .1);
	border-width: 1px 0;
	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em
		rgba(0, 0, 0, .15);
}

.b-example-vr {
	flex-shrink: 0;
	width: 1.5rem;
	height: 100vh;
}

.bi {
	vertical-align: -.125em;
	fill: currentColor;
}

.nav-scroller {
	position: relative;
	z-index: 2;
	height: 2.75rem;
	overflow-y: hidden;
}

.nav-scroller .nav {
	display: flex;
	flex-wrap: nowrap;
	padding-bottom: 1rem;
	margin-top: -1px;
	overflow-x: auto;
	text-align: center;
	white-space: nowrap;
	-webkit-overflow-scrolling: touch;
}

.btn-bd-primary {
	--bd-violet-bg: #712cf9;
	--bd-violet-rgb: 112.520718, 44.062154, 249.437846;
	--bs-btn-font-weight: 600;
	--bs-btn-color: var(--bs-white);
	--bs-btn-bg: var(--bd-violet-bg);
	--bs-btn-border-color: var(--bd-violet-bg);
	--bs-btn-hover-color: var(--bs-white);
	--bs-btn-hover-bg: #6528e0;
	--bs-btn-hover-border-color: #6528e0;
	--bs-btn-focus-shadow-rgb: var(--bd-violet-rgb);
	--bs-btn-active-color: var(--bs-btn-hover-color);
	--bs-btn-active-bg: #5a23c8;
	--bs-btn-active-border-color: #5a23c8;
}

.bd-mode-toggle {
	z-index: 1500;
}

.form-floating {
	border-radius: 10%;
}

.form-check-label {
	color: #666; /* 원하는 색상 코드로 대체하세요 */
}
</style>


<!-- Custom styles for this template -->
<link href="css/sign-in.css" rel="stylesheet">
</head>
<body class="d-flex align-items-center py-4 bg-body-tertiary"
	style="background-color: black;">

	<main class="form-signin w-100 m-auto">
		<form action="loginCheck.jsp" method="get">
			<img class="mb-4">
			<h1 class="h3 mb-3 fw-normal">로그인</h1><br>

			<div class="form-floating">
				<input type="text" class="form-control" id="id" name="id" value="<%=id %>" placeholder="id">
				<label for="floatingInput">아이디</label>
			</div>
			<br>
			<div class="form-floating">
				<input type="email" class="form-control rounded" id="email" name="pw" value="<%=email %>"
					placeholder="name@example.com"> <label
					for="floatingPassword">이메일</label>
			</div>
			<br>
			<br>

			<div class="form-check text-start my-3">
				<input class="form-check-input" type="checkbox" checked name="ck" placeholder="remember-me"
					id="check">아이디/이메일 기억하기
			</div>
			
			<button class="btn btn-dark w-100 py-2" type="submit">로그인</button><br><br>
			<button class="btn btn-secondary w-100 py-2" type="button" onClick="location.href='memberJoinForm.jsp'">회원가입</button>
			<p class="mt-5 mb-3 text-body-secondary">&copy; DAMIN KIM</p>
		</form>
		
	</main>
	
</body>
</html>
