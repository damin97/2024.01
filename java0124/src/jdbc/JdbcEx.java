package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pw = "mysql";
		Scanner scanner = new Scanner(System.in);
		System.out.println("부서번호:");
		int deptno = Integer.parseInt(scanner.nextLine());
		System.out.println("부서이름:");
		String dname = scanner.nextLine();
		System.out.println("부서위치:");
		String loc = scanner.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pw);
		Statement stmt = conn.createStatement();
		String sql = "insert into dept(deptno, dname, loc) values ("+deptno+", '"+dname+"', '"+loc+"')";
		int result = stmt.executeUpdate(sql);
		
		if(result == 1) {
			System.out.println("입력성공!");
		}else {
			System.out.println("입력실패!");
		}
	}

}
