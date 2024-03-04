<%@page import="util.Cookies"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType = "text/html; charset=utf-8" %>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	boolean login = false;
	//mysql 접속 후 로그인 체크
	String sql = "select count(*) from board where num = ? and writer = ?";
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    String num = "";
    String writer = "";
    
    try ( 
        Connection conn = DriverManager.getConnection(
        		"jdbc:mysql://localhost:3306/project1", "root", "mysql");
        PreparedStatement pstmt = conn.prepareStatement(sql);
    ) {
    	pstmt.setString(1, id);
    	pstmt.setString(2, password);
    	try(ResultSet rs = pstmt.executeQuery();) {
    		rs.next();

        	if (rs.getInt(1) == 1) {//로그인 성공 조건
        		login = true;
        	}else {
        		System.out.println("로그인 실패");
        	}
    	}catch(SQLException e) {
    		e.printStackTrace();
        }

    	
    } catch(SQLException e) {
		e.printStackTrace();
    }
    
    String idon = request.getParameter("id");
    String passwordon = request.getParameter("password");
    String remember = request.getParameter("remember");
    if (remember != null && remember.equals("on")) {
       response.addCookie(Cookies.createCookie("MEMBERLOGID", idon, "/", 60 * 60));
       response.addCookie(Cookies.createCookie("MEMBERLOGPW", passwordon, "/", 60 * 60));
       // response.addCookie 브라우저에 쿠키 정보를 저장할 때 쿠키를 생성한다는 말임
    } else {
       response.addCookie(Cookies.createCookie("MEMBERLOGID", "", "/", 0));
       response.addCookie(Cookies.createCookie("MEMBERLOGPW", "", "/", 0));
    }
    
	if (login) {
		session.setAttribute("MEMBERID", id);
		session.setAttribute("MEMBERPW", password);
		response.sendRedirect("list.jsp");
%>
<html>
<head><title>로그인성공</title></head>
<body>

로그인에 성공했습니다.

</body>
</html>
<%
	} else { // 로그인 실패시
%>
<script>
alert("로그인에 실패하였습니다.");
history.go(-1); // 이전 페이지로 이동
</script>
<%
	}
%>
