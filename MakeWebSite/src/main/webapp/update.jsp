<%@page import="dto.Member"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
     
 <%@ page import="java.sql.*" %>  
 <%@ page import="java.time.*" %>
  
 <%
     request.setCharacterEncoding("utf-8");
 
     // 전달받은 값 읽기
     int    num     = Integer.parseInt(request.getParameter("num"));
     String name  = request.getParameter("name" );
     String title   = request.getParameter("title"  );
     String content = request.getParameter("content");
 
     // 빈 칸이 하나라도 있으면 오류 출력하고 종료
     if (name  == null || name.length()  == 0 ||
         title   == null || title.trim().length()   == 0 ||
         content == null || content.length() == 0) {
 %>      
         <script>
             alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
             history.back();
         </script>
 <%        
         return;
     }
 
     BoardDao dao = BoardDao.getInstance();
     Board board = new Board(num, name, title, content);
     dao.update(board);
     
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
         response.sendRedirect("list3.jsp?num=" + num);
     } else {
         response.sendRedirect("list2.jsp?num=" + num);
         // 여기서 루프 밖에서 바로 리다이렉트를 수행하도록 수정
     }
     
 %>     
 