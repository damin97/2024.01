<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   

<%
String id = request.getParameter("id");
String email = request.getParameter("pw");
String ck = request.getParameter("ck");
if(ck != null && ck.equals("on")) { //쿠키 생성의 경우
	System.out.println(email);
	
	Cookie cookie = new Cookie("email", email);
	cookie.setMaxAge(60*60*24); //하루
	response.addCookie(cookie);
	
	Cookie cookie2 = new Cookie("id", id);
	cookie2.setMaxAge(60*60*24); //하루
	response.addCookie(cookie2);
} else { //쿠키 삭제의 경우
	Cookie cookie = new Cookie("email", null);
	Cookie cookie2 = new Cookie("id", null);
	cookie.setMaxAge(0); 
	cookie2.setMaxAge(0); 
	response.addCookie(cookie);
	response.addCookie(cookie2);
}

	Member member = MemberDao.getInstance().selectForLogin(id, email);

    // 그런 레코드가 있으면, 세션 속성을 등록하고, 메인 화면으로 돌아감
    if (member != null) {
        session.setAttribute("userId",   member.getId());
        session.setAttribute("userEmail", member.getEmail());
        session.setAttribute("member", member); //세션에 객체를 저장하는 것
        
        if(id.equals("admin")){
        	Cookie cookie3 = new Cookie("admin", member.getId());
        	response.addCookie(cookie3);
        }        
        response.sendRedirect("index.jsp");
        return;
    }
%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('아이디 또는 비밀번호가 틀립니다!');
    history.back();
</script>
 
</body>
</html>