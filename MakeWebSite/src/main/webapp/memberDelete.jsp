<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
Member member = MemberDao.getInstance().select(id);

Cookie cookie = new Cookie("email", "");
Cookie cookie2 = new Cookie("id", "");
cookie.setMaxAge(0); 
cookie2.setMaxAge(0); 
response.addCookie(cookie);
response.addCookie(cookie2);

Cookie cookie3 = new Cookie("admin", "");
cookie3.setMaxAge(0);  
response.addCookie(cookie3);

session.invalidate();

MemberDao.getInstance().delete(member);

response.sendRedirect("index.jsp");

%>
