<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">
div{
text-align:center;
display:block;
margin-left: auto;
margin-right: auto;
}

.account {
	margin: 50px 0px;
}

input {
	width: 20%
}

#login {
	float: center;
	background: black;
	color: white;
}
</style>
</head>
<body>
	<div>
		<form action="login.jsp" method="post">
			<div class="account">
				<label>아이디: </label><input type="text" name="id" class="write">
			</div>
			<div class="account">
				<label>이메일: </label><input type="text" name="email" class="write">
			</div>
			<button type="submit" id="login">로그인</button>
		</form>
	</div>
</body>
</html>