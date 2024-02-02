<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 창</title>
<style>
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
<h3 style="color: blue;">학생 성적 입력</h3>
<form action="oracle_Insert.jsp" method="post">
번호 <input type="text" name="num"/><br>
이름 <input type="text" name="name"/><br>
국어 <input type="text" name="kor"/><br>
영어 <input type="text" name="eng"/><br>
수학 <input type="text" name="math"/><br><br>
<input type="submit"  value="확인"/>
<input type="reset" />
<button onclick="location.href='oracle_List.jsp'">목록으로</button>
</form>
</div>
</body>
</html>