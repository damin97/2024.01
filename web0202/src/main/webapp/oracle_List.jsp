<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width: 490px; text-align: center;}
        th    { background-color: blue; color: white;}
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* 화면 전체 높이로 설정 */
        }
        /* 아래 스타일은 디자인을 위한 것으로 필요에 따라 조절 가능 */
        .content-container {
            text-align: center;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
        }
    </style>    
</head>
<body>
<div class="content-container">
<table>
    <tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th><th></th><th></th>
    </tr>
<%
	request.setCharacterEncoding("utf-8");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection(
        		"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from score");
    ) {
        while (rs.next()) {
            int sum = rs.getInt("kor") + rs.getInt("eng") + 
                      rs.getInt("math");
%>          
            <tr>
                <td><%=rs.getInt   ("num" )%></td>
                <td><%=rs.getString("name")%></td>
                <td><%=rs.getInt   ("kor" )%></td>
                <td><%=rs.getInt   ("eng" )%></td>
                <td><%=rs.getInt   ("math")%></td>
                <td><%=sum%></td>
                <td><%=String.format("%.2f", (float)sum / 3)%></td>
                <td><button onclick="location.href='oracle_Delete.jsp?num=<%= rs.getString("num")%>'">삭제</button></td>
                <td><button onclick="location.href='oracle_UpdateForm.jsp?num=<%= rs.getString("num")%>'">수정</button></td>
            </tr>
<%          
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
</table><br>
<button onclick="location.href='oracle_InsertForm.jsp'">처음으로</button>
</div>
</body>
</html>