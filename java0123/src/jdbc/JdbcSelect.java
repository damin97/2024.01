package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class JdbcSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<EmployeeInfo> list = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pw = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pw);
		Statement stmt = conn.createStatement();
		String sql = "select * from emp";
		
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt("empno")+",\t");
			System.out.print(rs.getString("ename")+",\t");
			System.out.println(rs.getDouble("sal"));
			list.add(new EmployeeInfo(rs.getInt("empno"), rs.getString("ename"), rs.getDouble("sal")));
		}
		
		for(EmployeeInfo einfo : list) {
			System.out.println(einfo);
		}
	}

}
