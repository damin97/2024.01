<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
boolean isAdmin = false;
String action = "list1.jsp";
Cookie[] cookies = request.getCookies();
Member loginMember = (Member) session.getAttribute("member");

//loginMember가 null인 경우에 대한 처리
if (session.getAttribute("userId") != null && loginMember != null) {
 // 쿠키에서 admin 쿠키 확인
System.out.print(loginMember);
 if (cookies != null && cookies.length > 0) {
     for (Cookie cookie : cookies) {
         if (cookie.getName().equals("admin") && cookie.getValue().equals(loginMember.getId())) {
             isAdmin = true;
             action = "list3.jsp";
             break;
         }else {
        		action = "list2.jsp";
        		
         }
     }
 }
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
				<a href="#">DAMIN KIM</a>
			</h1>
			<ul id="gnb">
				<li><a href="<%=action%>">ESSAY</a></li>
				<%
				if(isAdmin){
				
				%>
				<li><a href="list.jsp">MEMBER</a></li>
				<%
				}
				%>
				<li><a href="#">GALLERY</a></li>
			</ul>
			<ul class="util">
				<%
				if (session.getAttribute("userId") != null) { //세션에서 아이디 정보 가져와서 null이 아닐 때        
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
				<li><a href="memberJoinForm.jsp">Sign up</a></li>
				<% } %>
			</ul>
		</div>
	</header>


	<figure>
		<video src="img/앙트레브.mp4" autoplay muted loop></video>
		<div class="inner">
			<h1>DREAM SUPPORTER</h1>
			<p>
				앙트레브는 꿈을 향해 한 발 한 발 앞으로 나아가는 사람들을 응원하며<br>
앙트레브의 제품들이 그 꿈들을 위하여 일상을 함께 하는 것이 우리의 목표입니다.
			</p>
			<a href="#">view more</a>
		</div>
	</figure>

	<section>
		<div class="inner">
			<h1>RECENT NEWS</h1>
			<div class="wrap">
				<article>
					<div class="pic">
						<img src="img/이미지1.jpg" alt="1번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>

				<article>
					<div class="pic">
						<img src="img/이미지2.jpg" alt="2번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>

				<article>
					<div class="pic">
						<img src="img/이미지3.jpg" alt="3번째 콘텐츠 이미지">
					</div>
					<h2>
						<a href="#">Lorem ipsum dolor sit.</a>
					</h2>
					<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
						Vitae minus, eaque corrupti vero ad maiores!</p>
				</article>

				<article>
					<div class="pic">
						<img src="img/이미지4.jpg" alt="4번째 콘텐츠 이미지">
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
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
	</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  
</body>
</html>