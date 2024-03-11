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

// 지정된 글 번호의 레코드를 DB에서 삭제
BoardDao dao = BoardDao.getInstance();
dao.delete(num);

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
    response.sendRedirect("list3.jsp");
} else {
    response.sendRedirect("list2.jsp");
    // 여기서 루프 밖에서 바로 리다이렉트를 수행하도록 수정
}
%>
<script>
alert('삭제 되었습니다.')
</script>