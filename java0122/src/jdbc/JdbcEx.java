package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/company"; // company는 데이터베이스 명, localhost:3306은 mysql의 주소
		String id = "root";
		String pw = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql 드라이버 로딩!");
		Connection conn = DriverManager.getConnection(url, id, pw); // 접속
		System.out.println("mysql 접속 성공");
		Statement stmt = conn.createStatement(); //메소드 사용하려고 변수 선언하는 것이다
		ResultSet rs = stmt.executeQuery("select * from dept"); //
		while(rs.next()) {
			int deptno = rs.getInt("deptno"); // "deptno"는 컬럼 명
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.printf("%d, %s, %s\n", deptno, dname, loc);
		}
		
		conn.close();
	}

}
