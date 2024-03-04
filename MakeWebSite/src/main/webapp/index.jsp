<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 세션에 저장된 회원 정보 확인
Member loginMember = (Member)session.getAttribute("member");

// 쿠키에서 admin 쿠키 확인
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
%>
<!DOCTYPE html>
<html lang="ko">
<head>
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
				<a href="#">DAMIN KIM</a>
			</h1>

			<ul id="gnb">

				<li><a href="<%=action%>">ESSAY</a></li>
				<li><a href="b.jsp?name=홍길동">GALLERY</a></li>
				<li><a href="#">YOUTUBE</a></li>
				<li><a href=" bootstrap1.jsp">COMMUNITY</a></li>
				<li><a href="#">LOCATION</a></li>
			</ul>

			<ul class="util">
				<%
				if ((String) session.getAttribute("userId") != null) { //세션에서 아이디 정보 가져와서 null이 아닐 때        
					// 로그인 상태일 때의 출력
				%>
					<li>
					<%=(String) session.getAttribute("userId")%>님 로그인 
					<button type="button" onClick="location.href='logout.jsp'" class="btn btn-dark btn-sm">로그아웃</button>
					<button type="button" onClick="window.open('member_update_form.jsp', 'popup','width=400, height=200')" class="btn btn-dark btn-sm">회원정보 수정</button>
					</li>
				<% } else { %>
				<!-- 로그인 상태가 아닐 때-->
				<li><a href="loginForm.jsp">Login</a></li>
				<% } %>
			</ul>
		</div>
	</header>


	<figure>
		<video src="img/visual.mp4" autoplay muted loop></video>
		<div class="inner">
			<h1>Welcome!</h1>
			<p>
				Lorem ipsum dolor, sit amet consectetur adipisicing elit. <br>
				Id praesentium molestias similique quaerat magni facere in a?
				Adipisci, possimus reprehenderit!
			</p>
			<a href="#">view detail</a>
		</div>
	</figure>

	<section>
		<div class="inner">
			<h1>RECENT NEWS</h1>
			<div class="wrap">
				<article>
					<div class="pic">
						<img src="img/news1.jpg" alt="1번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>

				<article>
					<div class="pic">
						<img src="img/news2.jpg" alt="2번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>

				<article>
					<div class="pic">
						<img src="img/news3.jpg" alt="3번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>

				<article>
					<div class="pic">
						<img src="img/news4.jpg" alt="4번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>
			</div>
		</div>
	</section>

	<footer>
		<div class="inner">
			<div class="upper">
				<h1>DAMIN KIM</h1>
				<ul>
					<li><a href="#">Policy</a></li>
					<li><a href="#">Terms</a></li>
					<li><a href="#">Family Site</a></li>
					<li><a href="#">Sitemap</a></li>
				</ul>
			</div>

			<div class="lower">
				<address>
					Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas,
					facere.<br> TEL : 031-111-1234 C.P : 010-1234-5678
				</address>
				<p>2024 DAMIN KIM &copy; copyright all right reserved.</p>
			</div>
		</div>
	</footer>

</body>
</html>