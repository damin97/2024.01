<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
    request.setCharacterEncoding("utf-8");
	Member member = (Member)session.getAttribute("member");

	member = new Member( member.getMemberno	 (),
						 request.getParameter("id"  ),//값을 변수를 쓰지 않고 직접 집어넣은 것
        				 request.getParameter("email"  ),
        				 request.getParameter("name"));
	
	MemberDao.getInstance().update(member);

        
    // 사용자 이름을 담은 세션 속성도 업데이트
    // 아이디는 바뀌지 않지만, 사용자 이름은 바뀔 수 있기 때문임
    session.setAttribute("userName", request.getParameter("name"));
    session.setAttribute("member", member);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('수정이 완료되었습니다.');
    opener.location.reload(true);  // 사용자 이름이 바뀌었으면 바로 반영, reload는 새로고침 하는 것
    window.close();
    
</script>
<%
response.sendRedirect("index.jsp");
%>
</body>
</html>