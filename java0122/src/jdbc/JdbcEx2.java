package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/company"; // company는 데이터베이스 명, localhost:3306은 mysql의 주소
		String id = "root";
		String pw = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql 드라이버 로딩!");
		Connection conn = DriverManager.getConnection(url, id, pw); // 접속
		System.out.println("mysql 접속 성공");
		Statement stmt = conn.createStatement(); //메소드 사용하려고 변수 선언하는 것이다
		ResultSet rs = stmt.executeQuery("select ename, sal from emp"); // emp는 직원 정보를 저장하는 테이블을 의미한다
		while(rs.next()) { // next() 는 다음 단계로 이동을 의미한다
			String ename = rs.getString("ename");
			Double sal = rs.getDouble("sal");
			System.out.printf("%s, %f\n", ename, sal);
		}
		conn.close();
	}
}
