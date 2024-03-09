<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
    request.setCharacterEncoding("utf-8");
	
String id  = request.getParameter("id" );
String email   = request.getParameter("email"  );
String name = request.getParameter("name");

// 빈 칸이 하나라도 있으면 오류 출력하고 종료
if (name  == null || name.trim().length()  == 0 ||
    email == null || email.trim().length() == 0) {
%>      
    <script>
        alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
        history.back();
    </script>
<%        
    return;
}

	Member member = new Member(id,//값을 변수를 쓰지 않고 직접 집어넣은 것
        					   email,
        					   name);
	
	MemberDao.getInstance().update(member);

        
    // 사용자 이름을 담은 세션 속성도 업데이트
    // 아이디는 바뀌지 않지만, 사용자 이름은 바뀔 수 있기 때문임
    session.setAttribute("userName", name);
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
    
</script>
<%
response.sendRedirect("list.jsp");
%>
</body>
</html>