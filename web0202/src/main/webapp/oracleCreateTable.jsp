<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>테이블 생성</title>
</head>
<body>

<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
    ) {
    	
    	String sql = 
                "create table score (" + 
                "    num  number(3)          primary key," + 
                "    name varchar2(20),             " +
                "    kor  int,                     " +    
                "    eng  int,                     " +
                "    math int                      " +    
                ")";
    	
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    	pstmt.executeUpdate();
        out.println("성적 테이블 생성 성공 !");
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>