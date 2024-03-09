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

MemberDao.getInstance().delete(member);

response.sendRedirect("list.jsp");
%>
