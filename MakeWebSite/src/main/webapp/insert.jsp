<%@page import="dto.Member"%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.time.*"%>

<%
request.setCharacterEncoding("utf-8");
String memberId = (String) session.getAttribute("userId");
if (memberId == null) {
	response.sendRedirect("loginForm.jsp");
}
// 양식에 입력되었던 값 읽기
String name = request.getParameter("name");
String title = request.getParameter("title");
String content = request.getParameter("content");
String curTime = LocalDate.now() + " " + LocalTime.now().toString().substring(0, 8);

if (name == null || name.length() == 0 || title == null || title.length() == 0 || content == null
		|| content.length() == 0) {
%>
<script>
	alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
	history.back();
</script>
<%
return;
}
BoardDao dao = BoardDao.getInstance();
Board board = new Board(name, title, content);
//Board board = new Board(0, writer, title, content, "", 0);
//Board board = new Board();
//board.setWriter(writer);
//board.setTitle(title);
//board.setContent(content);
//dao.insert(board);
Member member = (Member)session.getAttribute("member");
board.setMemberno(member.getMemberno());
System.out.println(board.getMemberno());
System.out.println(member);
int result = dao.insert(board);
System.out.println(result);
// 목록보기 화면으로 돌아감
response.sendRedirect("list2.jsp");
%>
